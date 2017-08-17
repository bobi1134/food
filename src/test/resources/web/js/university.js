//文档加载完执行
$(function(){
	var universityId = window.sessionStorage["universityId"];
	//根据universityId查询对应的University
	$.ajax({
		type:"post",
		url:"http://localhost:8080/university/get/"+universityId,
		async:true,
		dataType : "json",
		success : function(data){
			$("#universityCName").text(data.universityCName);
			$("#cnDescription").text(data.cnDescription);
			$("#enDescription").text(data.enDescription);
		},
		error : function(){
			alert("error");
		}
	});
	
	//根据universityId查询对应的University下面所属的食堂
	$.ajax({
		type:"post",
		url:"http://localhost:8080/canteen/selectCanteens/"+universityId,
		async:true,
		dataType : "json",
		success : function(data){
			for (var i=0; i<data.length; i++) {
				$("#canteens").append(
					"<div class='card'>"+
						"<div class='image'>"+
							"<img src='Semantic-UI/assets/images/wireframe/image.png'>"+
						"</div>"+
						"<div class='extra center aligned'>"+
							"<a href='javascript:void(0);' onclick='goCanteenFun("+data[i].id+");'>"+data[i].canteenName+"</a>"+
						"</div>"+
					"</div>"
				);
			}
		},
		error : function(){
			alert("error");
		}
	});
});

/**
 * 根据id跳转到相应的食堂
 * @param {Object} id
 */
function goCanteenFun(id){
	//将id存储到sessionStorage
	var storage = window.sessionStorage;
	storage.canteenId = id;
	window.location = "canteen.html";
}
