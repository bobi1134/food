//文档加载完执行
$(function(){
	var canteenId = window.sessionStorage["canteenId"];
	//axxxxxxxxxxxxxxx
	$.ajax({
		type:"post",
		url:"http://localhost:8080/canteen/get/"+canteenId,
		async:true,
		dataType : "json",
		success : function(data){
			$("#canteenName").text(data.canteenName);
		},
		error : function(){
			alert("error");
		}
	});
	
	$.ajax({
		type:"post",
		url:"http://localhost:8080/dish/selectDishes/"+canteenId,
		async:true,
		dataType : "json",
		success : function(data){
			for(var i=0; i<data.length; i++){
				if(data[i].dishType == 1){
					$("#todaySpecial").append(
						"<div class='card'>"+
							"<div class='image'>"+
								"<img src='Semantic-UI/assets/images/wireframe/image.png'>"+
							"</div>"+
							"<div class='extra center aligned'>"+
								"<a href='javascript:void(0);' onclick='goDishFun("+data[i].id+");'>"+data[i].dishName+"</a>"+
							"</div>"+
						"</div>"
					);
				}else if(data[i].dishType == 2){
					$("#vegetables").append(
						"<div class='card'>"+
							"<div class='image'>"+
								"<img src='Semantic-UI/assets/images/wireframe/image.png'>"+
							"</div>"+
							"<div class='extra center aligned'>"+
								"<a href='javascript:void(0);' onclick='goDishFun("+data[i].id+");'>"+data[i].dishName+"</a>"+
							"</div>"+
						"</div>"
					);
				}else if(data[i].dishType == 3){
					$("#meat").append(
						"<div class='card'>"+
							"<div class='image'>"+
								"<img src='Semantic-UI/assets/images/wireframe/image.png'>"+
							"</div>"+
							"<div class='extra center aligned'>"+
								"<a href='javascript:void(0);' onclick='goDishFun("+data[i].id+");'>"+data[i].dishName+"</a>"+
							"</div>"+
						"</div>"
					);
				}else if(data[i].dishType == 4){
					$("#snack").append(
						"<div class='card'>"+
							"<div class='image'>"+
								"<img src='Semantic-UI/assets/images/wireframe/image.png'>"+
							"</div>"+
							"<div class='extra center aligned'>"+
								"<a href='javascript:void(0);' onclick='goDishFun("+data[i].id+");'>"+data[i].dishName+"</a>"+
							"</div>"+
						"</div>"
					);
				}
			}
		},
		error : function(){
			alert("error");
		}
	});
});

/**
 * 根据食堂id跳转到评论页面
 * @param {Object} id
 */
function goDishFun(id){
	//将id存储到sessionStorage
	var storage = window.sessionStorage;
	storage.dishId = id;
	window.location = "dish.html";
}
