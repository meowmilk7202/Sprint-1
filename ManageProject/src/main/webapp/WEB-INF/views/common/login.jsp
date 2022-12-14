<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">

</head>

<body>
	<section class="vh-100">
		<div class="container py-5 h-100">
			<div
				class="row d-flex align-items-center justify-content-center h-100">
				<div class="col-md-8 col-lg-7 col-xl-6">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
						class="img-fluid" alt="Phone image">
				</div>

				<h5>${message}</h5>
				<div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
					<form action="home" method="get">
						<!-- Email input -->
						<div class="form-outline mb-4">
							<input type="text" id="form1Example13"
								class="form-control form-control-lg" placeholder="MSSV or email"
								name="username" /> <label class="form-label"
								for="form1Example13">Username</label> >
							<div class="form-outline mb-4">
								<input type="password" id="form1Example23"
									class="form-control form-control-lg" name="password" /> <label
									cla" for="form1Example23">Password</label>
							</div>
							<button type="submit" value="login"
								class="btn btn-primary btn-lg btn-block">Sign in</button>
					</form>
				</div>
			</div>
		</div>
	</section>
</body>

</html>

