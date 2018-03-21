$(function() {
	// 取消订单按钮事件
	$("#deletebtn").click(function() {
		var oId = $("#deletebtn").val();
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
	});

	// 立即入住按钮事件
	$("#checkinbtn").click(function() {
		var oId = $("#checkinbtn").val();
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
					window.location.reload(true);
				} else{
					alert(data);
				}
			},
		});
	});

});