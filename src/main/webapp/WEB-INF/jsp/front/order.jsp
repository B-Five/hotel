<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
				<li><a href="/hotel/searchPage">预定</a></li>
				<li><a href="/hotel/showCustomerOrder">订单</a></li>
				<li><a href="#">额外服务</a></li>
				<li><a href="/hotel/loginOut">退出登录</a></li>
			</ul>
		</div>
	</div>
	<div class="header"></div>
	<div class="main-container">
		<ul>
			<h2>订单</h2>
			<input id="listLength" value="${fn:length(orderList)}" hidden>
			<c:forEach items="${orderList}" var="order" varStatus="status">
				<ul>
					<li>编号:${status.count}</li>
					<li>订单号:${order.oId}</li>
					<li>房间号:${order.oIntfield1}</li>
					<li>房间类型:${order.oStringfield1}</li>
					<li>订单总价:${order.oPrice}</li>
					<li>入住日期:<fmt:formatDate value="${order.oCheckintime}" /></li>
					<li>退房日期:<fmt:formatDate value="${order.oCheckouttime}"/></li>
					<c:if test="${order.oStatus}">
					<a href="#" class="btn btn-primary btn-sm disabled" role="button">订单已关闭</a>
					</c:if>
					<c:if test="${!order.oStatus}">
					<c:if test="${order.oBoolfield1}">
					<button type="button" id="showcode"  class="btn btn-info btn-sm" onclick="alert('入住码为：${order.oStringfield2}')">查看密钥</button>
					<button type="button" id="checkoutbtn"  class="btn btn-warning btn-sm" value="${order.oId}">立即退房</button>
					</c:if>
					<c:if test="${!order.oBoolfield1}">
					<button type="button" id="checkinbtn"  class="btn btn-success btn-sm" value="${order.oId}">立即入住</button>
					<button type="button" id="deletebtn"  class="btn btn-danger btn-sm" value="${order.oId}">取消订单</button>
					</c:if>
					</c:if>
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
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/js/order.js"></script>
</html>