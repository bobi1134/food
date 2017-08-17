$(function(){
	//ajax加载所有大学
	$.ajax({
		type:"post",
		url:"http://localhost:8080/university/loadAll",
		async:true,
		dataType : "json",
		success : function(data){
			//console.log(data);
			for (var i=0; i<data.length; i++) {
				$("#universitys").append(
					"<div class='card'>"+
						"<div class='image'>"+
							"<img src='Semantic-UI/assets/images/wireframe/image.png'>"+
						"</div>"+
						"<div class='extra center aligned'>"+
							"<a href='javascript:void(0);' onclick='goUniversityFun("+data[i].id+")'>"+data[i].universityCName+"</a>"+
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
 * 根据id跳转到相应大学
 * @param {Object} id
 */
function goUniversityFun(id){
	//将id存储到sessionStorage
	var storage = window.sessionStorage;
	storage.universityId = id;
	window.location = "university.html";
}
