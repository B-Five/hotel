<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房间预订</title>
<link rel="stylesheet" href="resource/css/bootstrap.css">
<link rel="stylesheet" href="resource/css/index.css">
<link rel="stylesheet" href="resource/css/daterangepicker.min.css">
</head>
<body>
	<div class="nav">
		<div class="container">
			<ul class="pull-left">
				<li><a href="/hotel/index">首页</a></li>
				<%
					if (session.getAttribute("customer") != null) {
				%>
				<li><a href="#">${sessionScope.customer.cLastname }${sessionScope.customer.cGender }</a></li>
				<input id ="cid" value="${customer.cId}" hidden >
			</ul>
			<ul class="pull-right">
				<li><a href="#">入住</a></li>
				<li><a href="/hotel/showCustomerOrder">订单</a></li>
				<li><a href="#">额外服务</a></li>
				<li><a href="/hotel/loginOut">退出登录</a></li>
			</ul>
			<%
				} else {
			%>
			</ul>
			<ul class="pull-right">
				<li><a href="/hotel/register">注册</a></li>
				<li><a href="/hotel/login">登录</a></li>
				<li><a href="#">Help</a></li>
			</ul>
			<%
				}
			%>
		</div>
	</div>
	<div class="header"></div>
	<div class="main-container">
		<div class="order-container">
			<div class="order-container1">
				<form action="searchPage">
					<div class="order1">
						<h4>时间</h4>
						<input id="date-range0" size="30" name="time" value="${requestScope.time}" placeholder="入住日期  to 退房日期 " >
					</div>
					<div class="order2">
						<h4>房客</h4>
						<input id="member" list="test" type="text" name="member"
							value="${requestScope.member}" placeholder="房客数量">
						<datalist id="test">
						<option value="1">一位房客</option>
						<option value="2">两位房客</option>
						<option value="3">三位房客</option>
						</datalist>
						<button type="submit" class="btn btn-primary">搜索</button>
					</div>
				</form>
			</div>
		</div>
		<ul>
			<h2>客房</h2>
			<c:forEach items="${roomTypeList}" var="roomType" >
			<ul>
			<li>房间类型:${roomType.tName}</li>
			<li>房间床型:${roomType.tBed}</li>
			<li>房间位置:${roomType.tPo}</li>
            <li>浴室类型:${roomType.tBath}</li>
            <button type="button" id="orderbtn" class="btn btn-success btn-sm" value="${roomType.tId}" >预定房间</button>
            </ul>
            </c:forEach>
		</ul>
	</div>
	<div></div>


	<div class="learn-more">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<h3>预定</h3>
					<p>From apartments and rooms to treehouses and boats: stay in
						unique spaces in 192 countries.</p>
					<p>
						<a href="#">See how to travel on Airbnb</a>
					</p>
				</div>
				<div class="col-md-4">
					<h3>入住</h3>
					<p>Renting out your unused space could pay your bills or fund
						your next vacation.</p>
					<p>
						<a href="#">Learn more about hosting</a>
					</p>
				</div>
				<div class="col-md-4">
					<h3>额外服务</h3>
					<p>From Verified ID to our worldwide customer support team,
						we've got your back.</p>
					<p>
						<a href="#">Learn about trust at Airbnb</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
<!-- <script type="text/javascript">
	function orderRoom(customer, type) {
		var time = $("#date-range0").val();
		var member = $("#member").val();
		console.log(time);
		if (customer != "") {
			if (time != "" && member != 0) {
				$.ajax({
					type : "post",
					url : "/hotel/createOrder",
					dataType : "text", // data传递的是一个json类型的值，而不是字符串，且必须标明dataType的类型，否则会出现400错误或者其他错误。
					data : {
						time : time,
						type : type
					},
					success : function(data) {
						if (data == "success") {
							alert("预定成功");
						} else
							alert("输入错误");
					},
				});
			} else {
				alert("请选择入住日期和退房日期 或者房客数量");
			}
		} else {
			alert("请先登录");
		}
	}
</script> -->
<script type="text/javascript" src="resource/js/moment.min.js"></script>
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resource/js/jquery.daterangepicker.min.js"></script>
<script type="text/javascript" src="resource/js/common.js"></script>
</html>