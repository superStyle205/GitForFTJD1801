<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="/WEB-INF/view/templates/header.jsp" />
<div class="app-content content container-fluid">
	<div class="content-wrapper">
		<!-- Path -->
		<div class="content-header row">
			<div class="content-header-left col-md-6 col-xs-12 mb-2">
				<c:choose>
					<c:when test="${edit}">
						<h3 class="content-header-title mb-0">Sửa thông tin khách
							hàng</h3>
					</c:when>
					<c:when test="${delete}">
						<h3 class="content-header-title mb-0">Xóa khách hàng</h3>
					</c:when>
					<c:otherwise>
						<h3 class="content-header-title mb-0">Thêm mới khách hàng</h3>
					</c:otherwise>
				</c:choose>
				<div class="row breadcrumbs-top">
					<div class="breadcrumb-wrapper col-xs-12">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a
								href='<c:url value="/home" />'>Home</a></li>
							<li class="breadcrumb-item"><a
								href='<c:url value="/QuanLyDuAn/KhachHang/list-khachHang" />'>Danh
									sách khách hàng</a></li>
							<c:choose>
								<c:when test="${edit}">
									<li class="breadcrumb-item active">Sửa thông tin khách
										hàng</li>
								</c:when>
								<c:when test="${delete}">
									<li class="breadcrumb-item active">Xóa khách hàng</li>
								</c:when>
								<c:otherwise>
									<li class="breadcrumb-item active">Thêm mới khách hàng</li>
								</c:otherwise>
							</c:choose>

						</ol>
					</div>
				</div>
			</div>
		</div>
		<!-- End Path -->

		<div class="content-body">
			<div class="main-content">
				<div class="row">
					<form:form method="POST" modelAttribute="customer" action="">
						<div class="form-group col-sm-6">
							<label>Tên khách hàng</label>
							<form:input class="form-control" path="nameCustomer"
								placeholder="Tên khách hàng" />
							<label>Email</label>
							<form:input class="form-control" path="email" placeholder="Email" />
							<label>Giới tính</label> <br>
							<form:radiobutton path="sex" value="1" />
							Nam
							<form:radiobutton path="sex" value="2" />
							Nữ
						</div>
						<div class="form-group col-sm-6">
							<label>Số điện thoại</label>
							<form:input class="form-control" path="contact"
								placeholder="Số điện thoại" />
							<label>Địa chỉ</label>
							<form:input class="form-control" path="address"
								placeholder="Địa chỉ" />
							<label>Ngày sinh</label>
							<form:input type="date" class="form-control" path="dayOfBirth"
								placeholder="Ngày sinh" />
						</div>
						<div class="col-sm-12 text-center">
							<c:choose>
								<c:when test="${edit}">
									<button type="submit" class="btn btn-success">Lưu
										thông tin</button>
									<a href="/FBMS/QuanLyDuAn/KhachHang/list-khachHang/1"
										class="btn btn-success">Hủy</a>
								</c:when>
								<c:when test="${delete}">
									<button type="submit" class="btn btn-success">Xóa
										thông tin</button>
									<a href="/FBMS/QuanLyDuAn/KhachHang/list-khachHang/1"
										class="btn btn-success">Hủy</a>
								</c:when>
								<c:otherwise>
									<button type="submit" class="btn btn-success">Lưu
										thông tin</button>
									<a href="/FBMS/QuanLyDuAn/KhachHang/list-khachHang/1"
										class="btn btn-success">Hủy</a>
								</c:otherwise>
							</c:choose>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/view/templates/footer.jsp" />
