<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>变量</title>
</head>
<body>
	<h3>简单变量</h3>
	<p>
		<#assign x=1> <#--创建变量x-->
		${x}<br>
		<#assign x=x+3> <#--替换变量x-->
		${x}
	</p>
</body>
</html>