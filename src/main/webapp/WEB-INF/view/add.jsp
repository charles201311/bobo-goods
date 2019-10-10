<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/resource/mystyles.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
 
 
 //
    function add(){
    	//序列化表单数据带文件
    	 var formData = new FormData($( "#form1" )[0]);
    	
    	
	  $.ajax({
		  type:"post",
		  url:"/add",
		  data:formData,
		// 告诉jQuery不要去处理发送的数据
		  processData : false,
		  // 告诉jQuery不要去设置Content-Type请求头
		  contentType : false, 
		  success:function(flag){
			 if(flag){
				 alert("成功");
				 location.href="/selects";
			 } else{
				 alert("失败"); 
			 }
			  
		  }
		  
		  
		  
	  })
	 

	 }

 
 
 
</script>

</head>
<body>
	<form id="form1">
	   <input type="text" name="gname">
	   <input type="text" name="price">
	   <input type="file" name="file">
	<input type="button" value="增加" onclick="add()">
	</form>

</body>
</html>