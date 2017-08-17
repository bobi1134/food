$(document).ready(function() {
    // fix menu when passed
    $('.masthead')
        .visibility({
            once: false,
            onBottomPassed: function() {
                $('.fixed.menu').transition('fade in');
            },
            onBottomPassedReverse: function() {
                $('.fixed.menu').transition('fade out');
            }
        });

    // create sidebar and attach to menu open
    $('.ui.sidebar')
        .sidebar('attach events', '.toc.item');

});

/*******************************************************************************/
$(function(){
	//用户执行登录操作后，将会在sessionStorage中保存userId=?(key-value形式)
	var userId = window.sessionStorage["userId"];
	
	if(typeof(userId) != "undefined" && userId != ""){
		$("#login").show();
		$("#unLogin").hide();
		
		$("#login-Following").hide();
		$("#unLogin-Following").show();
		
		//ajax根据id查询该用户信息
		$.ajax({
			type:"post",
			url:"http://localhost:8080/user/get/"+userId,
			async:true,
			dataType : "json",
			success : function(data){
				$("#login span").text(data.nickName);
			},
			error : function(){
				alert("error");
			}
		});
	}
});
