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
 
  function add(){
	  
	  location.href="/add";
  }
 
 </script>

</head>
<body>
	<form action="/selects" method="post">
		商品名称: <span id="my"></span> <br> 店面名称:<input type="text"
			name="name" value="${name}"> <input type="submit" value="查询">
		<input type="button" value="增加" onclick="add()">

	</form>
	<br>

	<div>
		<c:forEach items="${goods}" var="g">
			<div style="float: left">
				<dl>
					<dt>
						<img alt="" src="/pic/${g.url}">
					</dt>
					<dd>${g.price }</dd>
					<dd>${g.pinp.pname }${g.gname }</dd>
					<dd>${g.type.tname }</dd>
				</dl>

			</div>

		</c:forEach>
		
	 <div style="clear: both;">
	 	${page }
	 </div>



	</div>
	
	

</body>
</html>