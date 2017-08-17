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
	var userId = window.sessionStorage["userId"];
	//ajax根据id加载相应用户
	$.ajax({
		type:"post",
		url:"http://localhost:8080/user/get/"+userId,
		async:true,
		dataType : "json",
		success : function(data){
			$("#id").text("用户ID："+data.id);
			$("#email").text("用户邮箱："+data.email);
			$("#nickName").text("用户昵称："+data.nickName);
			$("#regTime").text("注册时间："+new Date(data.regTime).Format("yyyy-MM-dd hh:mm:ss"));
			$("#enabled").text("是否启用："+(data.enabled==1 ? "启用" : "停用"));
			$("#role").text("用户角色："+(data.role==1 ? "超级管理员" : (data.role==2 ? "网站管理员" : "网站会员")));
		},
		error : function(){
			alert("error");
		}
	});
	
	//根据用户id查询该用户的所有评论信息(1:菜品id,2:用户id)
	$.ajax({
		type:"post",
		url:"http://localhost:8080/remark/selectRemarks/2/"+userId,
		async:true,
		dataType : "json",
		success : function(data){
			for(var i=0; i<data.length; i++){
				$("#myRemarkTable").append(
					"<tr>"+
						"<td class='left aligned'>"+(i+1)+"</td>"+
						"<td>"+data[i].remarkContent+"</td>"+
						"<td>"+new Date(data[i].remarkTime).Format("yyyy-MM-dd hh:mm:ss")+"</td>"+
						"<td>"+data[i].dish.dishName+"</td>"+
					"</tr>"
				);
			}
		},
		error : function(){
			alert("error");
		}
	});
	
	/**
	 * 用户退出
	 */
	$("#logoutBtn").click(function(){
		window.sessionStorage.removeItem("userId");
		window.location = "index.html";
	});
});


