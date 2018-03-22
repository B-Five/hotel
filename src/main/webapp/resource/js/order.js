$(function() {
	// 取消订单按钮事件
	 $("button[id^='deletebtn']").each(function() {
		$(this).click(function() {
			var oId = $(this).val();
			if(window.confirm('你确定要取消订单吗？')){
			$.ajax({
				type : "post",
				url : "/hotel/deleteCustomerOrder",
				dataType : "text",
				data : {
					oId : oId
				},
				success : function(data) {
					if (data == "success") {
						alert("取消成功");
						window.location.reload(true);
					} else
						alert("取消失败");
				},
			});
			}
		});
	});

	// 立即入住按钮事件
	 $("button[id^='checkinbtn']").each(function() {
		$(this).click(function() {
			var oId = $(this).val();
			$.ajax({
				type : "post",
				url : "/hotel/checkInCustomerOrder",
				dataType : "text",
				data : {
					oId : oId
				},
				success : function(data) {
					if (data == "failure") {
						alert("未到入住日期暂时无法入住");
					} else {
						alert("入住码为" + data);
						window.location.reload(true);
					}
				},
			});
		});
	});

	// 立即退房按钮事件
	 $("button[id^='checkoutbtn']").each(function() {
		$(this).click(function() {
			var oId = $(this).val();
			$.ajax({
				type : "post",
				url : "/hotel/checkOutCustomerOrder",
				dataType : "text",
				data : {
					oId : oId
				},
				success : function(data) {
					if (data == "failure") {
						alert("未到退房日期暂时无法退房");
					} else {
						alert("本次订单费用一共"+data+"元");
						alert("支付成功");
						window.location.reload(true);
					}
				},
			});
		});
	});

});