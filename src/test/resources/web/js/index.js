//页面加载完执行
$(function(){
	//ajax加载前两条大学信息
	$.ajax({
		type:"post",
		url:"http://localhost:8080/university/selectLimit/2",
		async:true,
		dataType : "json",
		success : function(data){
			for (var i=0; i<data.length; i++) {
				$("#successCase").append("<div>"+
            		"<h3 class='ui header' title='"+data[i].universityCName+"'>"+data[i].universityEName+"</h3>"+
	                "<p title='"+data[i].cnDescription+"'>"+
	                	data[i].enDescription+
	                "</p>"+
	                "<a class='ui large button'>Go</a>"+
            	"</div>");
			}
		},
		error : function(){
			alert("error");
		}
	});
	
	/**
	 * getStartedBtn
	 */
	$("#getStartedBtn").click(function(){
		window.location = "community.html";
	});
});
