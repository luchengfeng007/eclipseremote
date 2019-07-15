<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>


</head>
<body>
	<form action="get" method="post">
		
	</form>
	<table class="table">
		<tr>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
		</tr>
		<#list page.list as fs >
			<tr>
			<td>${fs.sname}</td>
			<td>${fs.sex}</td>
			<td>${fs.age}</td>
		</tr>	
		</#list>
	</table>
</body>
<#include "page.ftl"/>
</html>