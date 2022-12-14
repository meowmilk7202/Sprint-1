package vn.iotstar.Controller;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import net.bytebuddy.utility.RandomString;
import vn.iotstar.Entity.Account;
import vn.iotstar.Service.IAccountService;
import vn.iotstar.Service.Impl.UserNotFoundException;
import vn.iotstar.Utils.Utility;

@Controller
public class ForgotPasswordController {
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private IAccountService userService;

	@GetMapping("/forgot_password")
	public String showForgotPasswordForm() {
		return "common/forgot_password_form";

	}

	@PostMapping("/forgot_password")
	public String processForgotPassword(HttpServletRequest request, Model model) {
		String email = request.getParameter("email");

		// System.out.print(email);

		String token = RandomString.make(30);

		try {
			userService.updateResetPasswordToken(token, email);
			String resetPasswordLink = Utility.getSiteURL(request) + "/reset_password?token=" + token;
			sendEmail(email, resetPasswordLink);
			model.addAttribute("message", "We have sent a reset password link to your email. Please check.");

		} catch (UserNotFoundException ex) {
			model.addAttribute("error", ex.getMessage());
		} catch (UnsupportedEncodingException | MessagingException e) {
			model.addAttribute("error", "Error while sending email");
		}

		return "common/forgot_password_form";
	}

	public void sendEmail(String recipientEmail, String link) throws MessagingException, UnsupportedEncodingException {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);

		helper.setFrom("hcmute.edu.vn", "Tr?????ng ?????i H???c S?? Ph???m K??? Thu???t");
		helper.setTo(recipientEmail);

		String subject = "Th?? x??c nh???n thay ?????i m???t kh???u";

		String content = "<p>Ch??o B???n,</p>" + "<p>B???n c?? m???t y??u c???u thay ?????i m??? kh???u m???i.</p>"
				+ "<p>Nh???n v??o link b??n d?????i ????? thay ?????i m???t kh???u:</p>" + "<p><a href=\"" + link
				+ "\">Thay ?????i m???t kh???u.</a></p>" + "<br>" + "<p>B??? qua email n??y n???u nh?? b???n nh??? m???t kh???u c???a m??nh, "
				+ "ho???c b???n ch??a y??u c???u th???c hi???n.</p>";

		helper.setSubject(subject);

		helper.setText(content, true);

		mailSender.send(message);
	}

	@GetMapping("/reset_password")
	public String showResetPasswordForm(@Param(value = "token") String token, Model model) {
		Account customer = userService.getByResetPasswordToken(token);
		model.addAttribute("token", token);

		if (customer == null) {
			model.addAttribute("message", "Invalid Token");
			return "message";
		}

		return "/common/reset_password_form";
	}

	@PostMapping("/reset_password")
	public String processResetPassword(HttpServletRequest request, Model model) {
		String token = request.getParameter("token");
		String password = request.getParameter("password");

		Account customer = userService.getByResetPasswordToken(token);
		model.addAttribute("title", "Reset your password");

		if (customer == null) {
			model.addAttribute("message", "Invalid Token");
			return "common/login";
		} else {
			userService.updatePassword(customer, password);
			model.addAttribute("message", "Thay ?????i m???t kh???u th???nh c??ng.");
		}
		return "common/login";
	}
}