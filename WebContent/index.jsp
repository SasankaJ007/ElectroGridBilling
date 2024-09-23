<%@page import="model.Bill"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Details</title>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<script src="Components/jquery-3.2.1.min.js"></script>
<script src="Components/bills.js"></script>
</head>
<body>
<div class = "contanier">
<div class="row">
		<div class="col-lg-12">
			<div class="card m-b-32">
				<div class="card-body">

					<form id="formUser" name="formUser" method="post"
						action="index.jsp">

						<label>Name</label> <input id="name"
							name="name" type="text"
							class="form-control form-control-sm">
							<br> 
							<label>Date</label><input id="date"
							name="date" type="text"
							class="form-control form-control-sm">
							<br>
							<label>Period</label><input id="period"
							name="period" type="text"
							class="form-control form-control-sm">
						
							
							 <br>
							 <input id="btnSave" name="btnSave" type="button" value="Save"
							class="btn btn-primary"> <input type="hidden"
							id="idbill" name="idbill" value="">
					</form>
					<br>
					<div id="alertSuccess" class="alert alert-success"></div>
					<div id="alertError" class="alert alert-danger"></div>
					<br> <br>
					
					<div id="divUserGrid">
						<%
						Bill billObj = new Bill();
											out.print(billObj.readBill());
						%>
					</div>
				</div>
</div>
</div>
</div>

</div>
</body>
</html>