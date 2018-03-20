<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resource/css/bootstrap.css">
<link rel="stylesheet" href="resource/css/index.css">
<title>订单</title>
</head>
<body>
	<div class="nav">
		<div class="container">
			<ul class="pull-left">
				<li><a href="/hotel/index">首页</a></li>
				<li><a href="#">${sessionScope.customer.cLastname }${sessionScope.customer.cGender }</a></li>
			</ul>
			<ul class="pull-right">
				<li><a href="#">入住</a></li>
				<li><a href="#">订单</a></li>
				<li><a href="#">额外服务</a></li>
				<li><a href="/hotel/loginOut">退出登录</a></li>
			</ul>
		</div>
	</div>
	<div class="header"></div>
	<div class="main-container">
		<ul>
			<h2>订单</h2>
			<c:forEach items="${orderList}" var="order">
				<ul>
					<li>房间号:${order.oIntfield1}</li>
					<li>房间类型:${order.oStringfield1}</li>
					<li>房间价格:${order.oPrice}</li>
					<li>入住日期:<fmt:formatDate value="${order.oCheckintime}" /></li>
					<li>退房日期:<fmt:formatDate value="${order.oCheckouttime}"/></li>
					<button type="button" id="orderbtn" class="btn btn-success btn-sm">立即入住</button>
					<button type="button" id="orderbtn" class="btn btn-success btn-sm">取消订单</button>
				</ul>
			</c:forEach>
		</ul>
	</div>
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
</html>