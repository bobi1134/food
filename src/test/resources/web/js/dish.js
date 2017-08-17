/**
 * 格式化日期函数
 * @param fmt
 * @returns {*}
 * @constructor
 */
Date.prototype.Format = function(fmt) { 
	var o = {
		"M+": this.getMonth() + 1,
		//月份
		"d+": this.getDate(),
		//日
		"h+": this.getHours(),
		//小时
		"m+": this.getMinutes(),
		//分
		"s+": this.getSeconds(),
		//秒
		"q+": Math.floor((this.getMonth() + 3) / 3),
		//季度
		"S": this.getMilliseconds() //毫秒
	};
	if (/(y+)/.test(fmt)) {
		fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	}
	for (var k in o) {
		if (new RegExp("(" + k + ")").test(fmt)) {
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
		}
	}
	return fmt;
}

//文档加载完执行
$(function(){
	var dishId = window.sessionStorage["dishId"];
	//根据菜品id查询菜品信息
	$.ajax({
		type:"post",
		url:"http://localhost:8080/dish/get/"+dishId,
		async:true,
		dataType : "json",
		success : function(data){
			$("#dishName").text(data.dishName);
			$(".ui.steps .step .dishName").text(data.dishName);
			$(".ui.steps .step .praise").text(data.praiseNum);
		},
		error : function(){
			alert("error");
		}
	});
	
	//根据菜品id查询菜品评论信息(1:菜品id,2:用户id)
	$.ajax({
		type:"post",
		url:"http://localhost:8080/remark/selectRemarks/1/"+dishId,
		async:true,
		dataType : "json",
		success : function(data){
			for(var i=0; i<data.length; i++){
				$("#remarks").append(
					"<div class='ui segment'>"+
			    		"<span>"+(i+1)+"、"+data[i].remarkContent+"</span>"+
			    		"<br />"+
			    		"<span class='date_user'>"+new Date(data[i].remarkTime).Format("yyyy-MM-dd hh:mm:ss")+" by "+data[i].user.nickName+"</span>"+
			    	"</div>"
				);
			}
		},
		error : function(){
			alert("error");
		}
	});
	
	
	
	/**
	 * 评论
	 */
	$(".ui.form .field .form").form({
		fields: {
			remarkContent: {
				identifier: 'remarkContent',
				rules: [{
						type: 'empty',
						prompt: 'Please enter your remark content'
					},
					{
						type: 'length[6]',
						prompt: 'Your remark content must be at least 6 characters'
					}
				]
			}
		},
		onSuccess: function() {
			var userId = window.sessionStorage["userId"];
			if(typeof(userId) != "undefined" && userId != ""){
				$.ajax({
					type: "post",
					url: "http://localhost:8080/remark/save",
					async: true,
					dataType: "json",
					data: {"dishId":window.sessionStorage["dishId"],remarkContent:$("#remarkContent").val(), "userId":userId},
					success: function(data) {
						if(data>0){
							alert("评论成功！");
							window.location = "dish.html";
						}
					},
					error: function() {
						alert("error");
					}
				});
			}else{
				alert("您还未登录！");
				window.location = "login.html";
			}
		}
	});
	
	$('.ui.form').submit(function(e) {
		return false;
	});
	
	/**
	 * 点赞
	 */
	$("#praiseBtn").click(function(){
		$.ajax({
			type: "post",
			url: "http://localhost:8080/dish/praiseNum/"+window.sessionStorage["dishId"],
			async: true,
			dataType: "json",
			success: function(data) {
				alert("点赞成功！");
				$(".ui.steps .step .praise").text(data.praiseNum);
			},
			error: function() {
				alert("error");
			}
		});
	});
});

