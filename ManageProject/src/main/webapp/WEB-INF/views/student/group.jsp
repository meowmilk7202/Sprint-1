<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<div class="card shadow w-100">

	<div class="card-header py-3">
		<h6 class="m-0 font-weight-bold text-primary">${message}</h6>

	</div>
	<c:if test="${message == null}">
		<div class="card-header py-3">
			<h6 class="m-0 font-weight-bold text-primary">Xem Danh sách</h6>

		</div>
		<div class="card-body">
			<div class="table-responsive">
				<c:if test="${user.isleader}">
					<c:if test="${listwaitingproject.size() >0}">
						<h4>Danh sách sinh viên quan tâm đề tài</h4>
						<table class="table table-bordered" id="dataTable" width="100%"
							cellspacing="0">
							<thead class="thead-inverse">
								<tr>
									<th>STT</th>
									<th>Tên sinh viên</th>
									<th>Chuyên ngành</th>
									<th>Chức năng</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${listwaitingproject}" var="item"
									varStatus="STT">
									<tr>
										<td scope="row">${STT.index+1 }</td>

										<td><a href="/student/detail/${item.mssv}">${item.name}</a></td>
										<td>${item.faculty}</td>
										<c:if test="${!item.isleader}">
											<td><a href="/student/accept/${item.mssv}"
												class="btn btn-outline-success"><i class="fa fa-sucess"></i>Chấp
													nhận</a> <a href="/student/noaccept/${item.mssv}"
												class="btn btn-outline-warning"><i class="fa fa-sucess"></i>Từ chối</a></td>
										</c:if>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:if>
				</c:if>
				<br>
				<hr>
				<br>
				<h4>Danh sách thành viên nhóm</h4>
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead class="thead-inverse">
						<tr>
							<th>STT</th>
							<th>Tên thành viên</th>
							<th>Chuyên ngành</th>
							<th>Chức vụ</th>
							<c:if test="${user.isleader}">
								<th>Chức năng</th>
							</c:if>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="item" varStatus="STT">
							<tr>
								<td scope="row">${STT.index+1 }</td>

								<td><a href="/student/detail/${item.mssv}">${item.name}</a></td>
								<td>${item.faculty}</td>
								<td>${item.isleader?"Nhóm trưởng": "Thành viên"}</td>
								<c:if test="${user.isleader}">
									<c:if test="${!item.isleader}">
										<c:if test="${item.xoaproject.equals(0)}">
											<td><a href="/student/deletegroup/${item.mssv}"
												class="btn btn-outline-warning"><i class="fa fa-trash"></i>Xóa
													khỏi nhóm</a></td>
										</c:if>
										<c:if test="${item.xoaproject>0}">
											<td><a><i class="fa fa-trash"></i>Đã yêu cầu xóa</a></td>
										</c:if>
									</c:if>
									<c:if test="${item.isleader}">
										<td><a href="/student/profile"
											class="btn btn-outline-success"><i class="fa fa-trash"></i>Chỉnh
												sửa</a></td>
									</c:if>
								</c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</c:if>
</div>