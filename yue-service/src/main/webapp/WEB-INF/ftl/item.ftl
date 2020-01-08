<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" />
	<title>产品详情页</title>
	
</head>

<body>
<table>
	<tr>
		<td>课程ID</td>
		<td>课程名称</td>
		<td>课程类型</td>
		<td>课时</td>
		<td>代课老师</td>
		<td>图片</td>
		<td>开课日期</td>
		<td>操作</td>
	</tr>
	<tr>
		<td>${ke.id}</td>
		<td>${ke.name}</td>
		<td>${ke.type}</td>
		<td>${ke.price}</td>
		<td>${ke.teacher}</td>
		<td>
			<img src="${ke.images}" width="100px" height="100px">
		</td>
		<td>${ke.kkDate}</td>
		<td>
			<a href="http://localhost:9101/buy.html#?id=${ke.id}">购买</a>
		</td>
	</tr>
</table>
</body>

</html>