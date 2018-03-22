$(function(){

	//登录输入框效果
	$('.form_text_ipt input').focus(function(){
		$(this).parent().css({
			'box-shadow':'0 0 3px #bbb',
		});
	});
	$('.form_text_ipt input').blur(function(){
		$(this).parent().css({
			'box-shadow':'none',
		});
		//$(this).parent().next().hide();
	});

	//表单验证
	$('.form_text_ipt input').blur('input propertychange',function(){
		if($(this).val()==""){
			$(this).css({
				'color':'red',
			});
			$(this).parent().css({
				'border':'solid 1px red',
			});
			//$(this).parent().next().find('span').html('helow');
			$(this).parent().next().show();
		}else{
			$(this).css({
				'color':'#ccc',
			});
			$(this).parent().css({
				'border':'solid 1px #ccc',
			});
			$(this).parent().next().hide();
		}
	});

    $("#loginbtn").click(function () {
        $.ajax({
            type:"post",
            url:"/hotel/loginCheck",
            dataType:"text",    //data传递的是一个json类型的值，而不是字符串，且必须标明dataType的类型，否则会出现400错误或者其他错误。
      data:{email:$("#email").val(),password:$("#password").val()},
            success:function (data) {
            if(data=="success"){
             window.location.href='/hotel/index';
               }else
                 alert("用户名或密码错误");
            },
        });
    });

    $("#registerbtn").click(function () {
        $.ajax({
            type:"post",
            url:"/hotel/registerCheck",
            dataType:"text",    //data传递的是一个json类型的值，而不是字符串，且必须标明dataType的类型，否则会出现400错误或者其他错误。
      data:{email:$("#rEmail").val(),password:$("#password").val(),lastname:$("#lastname").val(),firstname:$("#firstname").val(),phone:$("#phone").val()},
            success:function (data) {
            if(data=="success"){
             window.location.href='/hotel/login';
               }else
                 alert("用户名或密码错误");
            },
        });
    });

   /* $("#searchbtn").click(function () {
        $.ajax({
            type:"post",
            url:"/hotel/search",
            dataType:"text",    //data传递的是一个json类型的值，而不是字符串，且必须标明dataType的类型，否则会出现400错误或者其他错误。
      data:{time:$("#date-range0").val(),member:$("#member").val()},
      success:function (data) {
          if(data=="success"){
           window.location.href='/hotel/searchPage';
             }else
               alert("输入错误");
          },
        });
    });*/


    // 预定房间按钮事件
	    $("button[id^='orderbtn']").each(function() {
		$(this).click(function() {
			var time = $("#date-range0").val();
			var member = $("#member").val();
			var customer = $("#cid").val();
			var type = $(this).val();
			if (customer != null) {
				if (time != "" && member != 0) {
					if (window.confirm('你确定要预定这个房间吗？')) {
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
									alert("预定失败");
							},
						});
					}
				} else {
					alert("请选择入住日期和退房日期 或者房客数量");
				}
			} else {
				alert("请先登录");
			}
		});
	});

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

/*
 * $("#rEmail").blur(function(){ $.ajax({ type:"post", url:"/hotel/emailCheck",
 * dataType:"text",
 * //data传递的是一个json类型的值，而不是字符串，且必须标明dataType的类型，否则会出现400错误或者其他错误。
 * data:{email:$(this).val()}, success:function (data) { if(data=="success"){
 * alert("该邮箱可以使用"); }else alert("该邮箱已被注册"); }, }); return false; })
 */
    $('#date-range0').dateRangePicker(
    		{
    			minDays: 1
    		}).bind('datepicker-first-date-selected', function(event, obj)
    		{
    			/* This event will be triggered when first date is selected */
    			console.log('first-date-selected',obj);
    			// obj will be something like this:
    			// {
    			// 		date1: (Date object of the earlier date)
    			// }

    		})

});


