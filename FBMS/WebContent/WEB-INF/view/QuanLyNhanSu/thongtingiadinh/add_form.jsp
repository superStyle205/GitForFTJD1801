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
				<h3 class="content-header-title mb-0">Thêm mới thông tin gia đình</h3>
				<div class="row breadcrumbs-top">
					<div class="breadcrumb-wrapper col-xs-12">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a
								href='<c:url value="/home" />'>Home</a></li>
							<li class="breadcrumb-item"><a
								href='<c:url value="/QuanLyNhanSu/thongTinGiaDinh/" />'>Danh
									sách thông tin gia đình</a></li>
							<li class="breadcrumb-item active">Thêm mới thông tin gia đình</li>
						</ol>
					</div>
				</div>
			</div>
		</div>
		<!-- End Path -->

		<div class="content-body">
			<div class="main-content">
				<div class="row">
					<form:form method="POST" modelAttribute="RelativeInformation" action="">
					<div class="form-group col-sm-3">
							<label>Họ và tên</label>
							<form:input class="form-control" path="name"
								placeholder="Họ và tên" />
						</div>
						<div class="form-group col-sm-3">
							<label>Mối quan hệ</label>
							<form:input class="form-control" path="relationship"
								placeholder="Mối quan hệ" />
						</div>

						<div class="form-group col-sm-3">
							<label>Ngày sinh</label>
							<form:input type="date" class="form-control"
								value="${RelativeInformation.dayOfBirth}" path="dayOfBirth" placeholder="Ngày sinh"/>
						</div>					
						<div class="form-group col-sm-4">
							<label>Công việc</label>
							<form:input class="form-control" path="job"
								placeholder="Công việc" />
						</div>
						<div class="form-group col-sm-3">
							<label>Mã nhân viên</label>
							<form:input class="form-control" path="idEmployee" placeholder="Nhân viên" />
						</div>
						<div class="form-group col-sm-8">
							<label>Địa chỉ</label>
							<form:input class="form-control" path="address"
								placeholder="Địa chỉ" />
						</div>
						
						<div class="col-sm-12 text-center">
							<button type="submit" class="btn btn-success">Lưu</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/view/templates/footer.jsp" />
