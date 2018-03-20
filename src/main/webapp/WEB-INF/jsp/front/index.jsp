<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>

<head>
<title>炉石酒馆</title>
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
			</ul>
			<ul class="pull-right">
				<li><a href="#">入住</a></li>
				<li><a href="/hotel/customerOrder">订单</a></li>
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

	<div class="jumbotron">
		<div class="container">
			<h1>XX酒店</h1>
			<p>在这邂逅不期而遇的美好，人生从此更丰厚</p>
			<a href="#">立即预定！</a>
		</div>
	</div>

	<div class="neighborhood-guides">
		<div class="container">
			<h2>自助式豪华酒店</h2>
			<p>真正弥足珍贵的旅程并非到此一游，而是让彼此更亲近。</p>
			<div class="row">
				<div class="col-md-4">
					<div class="thumbnail">
						<img
							src="https://www.fourseasons.com/content/dam/fourseasons/images/web/MAC/MAC_036_aspect16x9.jpg/jcr:content/renditions/cq5dam.web.468.263.jpeg" />
					</div>
					<div class="thumbnail">
						<img
							src="https://www.fourseasons.com/content/dam/fourseasons/images/web/MAC/MAC_039_aspect16x9.jpg/jcr:content/renditions/cq5dam.web.468.263.jpeg" />
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img
							src="https://www.fourseasons.com/content/dam/fourseasons/images/web/MAC/MAC_198_aspect16x9.jpg/jcr:content/renditions/cq5dam.web.468.263.jpeg" />
					</div>
					<div class="thumbnail">
						<img
							src="https://www.fourseasons.com/content/dam/fourseasons/images/web/MAC/MAC_327_aspect16x9.jpg/jcr:content/renditions/cq5dam.web.468.263.jpeg" />
					</div>
				</div>
				<div class="col-md-4">
					<div class="thumbnail">
						<img
							src="https://www.fourseasons.com/content/dam/fourseasons/images/web/MAC/MAC_329_aspect16x9.jpg/jcr:content/renditions/cq5dam.web.637.358.jpeg" />
					</div>
					<div class="thumbnail">
						<img
							src="https://www.fourseasons.com/alt/img-opt/publish/content/dam/fourseasons/images/web/HKG/HKG_154_aspect16x9.jpg/60.jpg" />
					</div>

				</div>
			</div>
		</div>

		<div class="order-container">
			<div class="order-container1">
				<form action="searchPage" method="post">
					<div class="order1">
						<h4>时间</h4>
						<input id="date-range0" name="time" size="30" placeholder="入住日期  to 退房日期 ">
					</div>
					<div class="order2">
						<h4>房客</h4>
						<input id="member" name="member" list="test" type="text"
							placeholder="房客数量">
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
<script type="text/javascript" src="resource/js/moment.min.js"></script>
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="resource/js/jquery.daterangepicker.min.js"></script>
<script type="text/javascript" src="resource/js/common.js"></script>
</html>