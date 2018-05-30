<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>服务预定</title>
    <link rel="stylesheet" href="resource/css/bootstrap.css">
    <link rel="stylesheet" href="resource/css/index.css">
    <link rel="stylesheet" href="resource/css/daterangepicker.min.css">
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="resource/back/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css" rel="stylesheet" type="text/css" />
    <!-- END GLOBAL MANDATORY STYLES -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <link href="resource/back/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/bootstrap-timepicker/css/bootstrap-timepicker.min.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/bootstrap-datetimepicker/css/bootstrap-datetimepicker.css" rel="stylesheet" type="text/css" />
    <link href="resource/back/assets/global/plugins/clockface/css/clockface.css" rel="stylesheet" type="text/css" />
    <!-- END PAGE LEVEL PLUGINS -->
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
            <input id="cid" value="${customer.cId}" hidden>
        </ul>
        <ul class="pull-right">
            <li><a href="/hotel/searchPage">预定</a></li>
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
                    <div class="input-group date form_datetime">
                        <input type="text" size="16" readonly class="form-control">
                        <span class="input-group-btn">
                            <button class="btn default date-set" type="button">
                                <i class="fa fa-calendar"></i>
                            </button>
                        </span>
                    </div>
                </div>
                <div class="order2">
                    <h4>服务时间</h4>
                    <input id="member" list="test" type="text" name="member"
                           value="" placeholder="服务时间">
                    <datalist id="test">
                        <option value="立即服务">立即服务</option>
                        <option value="预定时间">预定时间</option>
                    </datalist>
                </div>
            </form>
        </div>
    </div>
    <ul>
        <h2>服务</h2>
        <c:forEach items="${servicesTypeList}" var="servicesType">
            <ul>
                <li>房间类型:${servicesType.stName}</li>
                <li>房间床型:${servicesType.stDesc}</li>
                <li>房间位置:${servicesType.stPrice}</li>
                <button type="button" id="servicebtn" class="btn btn-success btn-sm" value="${servicesType.stId}">选择服务
                </button>
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
                <p>进入预定页面，选择要入住的日期和退房的日期，然后查询，最后选择合适的房间进行预定即可</p>
                <p>
                    <a href="#">预定</a>
                </p>
            </div>
            <div class="col-md-4">
                <h3>入住</h3>
                <p>进入订单页面，选择要入住的订单，点击预定即可</p>
                <p>
                    <a href="#">入住</a>
                </p>
            </div>
            <div class="col-md-4">
                <h3>额外服务</h3>
                <p>进入额外服务页面，选择想要的服务，然后选择服务时间即可</p>
                <p>
                    <a href="#">额外服务</a>
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

<!-- BEGIN PAGE LEVEL PLUGINS -->
<script src="resource/back/assets/global/plugins/moment.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-daterangepicker/daterangepicker.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-timepicker/js/bootstrap-timepicker.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-datetimepicker/js/bootstrap-datetimepicker.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/clockface/js/clockface.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL SCRIPTS -->
<script src="resource/back/assets/global/scripts/app.min.js" type="text/javascript"></script>
<!-- END THEME GLOBAL SCRIPTS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="resource/back/assets/pages/scripts/components-date-time-pickers.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL SCRIPTS -->

<!-- BEGIN CORE PLUGINS -->
<script src="resource/back/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/js.cookie.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/jquery.blockui.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/uniform/jquery.uniform.min.js" type="text/javascript"></script>
<script src="resource/back/assets/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
<!-- END CORE PLUGINS -->
</html>