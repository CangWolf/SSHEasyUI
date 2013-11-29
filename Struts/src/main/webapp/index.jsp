<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html;charset=utf-8"/>
    <title>Struts Hello </title>
</head>
<body>
<h1>Welcome to Struts2</h1>

<p><a href="<s:url action="hello"/> "/>hello</p>
<p><a href="<s:url action="world"/> "/>world</p>
</body>
</html>