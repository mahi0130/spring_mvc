<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header"></tiles:insertAttribute>


	</div>
	<div id="body">
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
	</div>

	<div id="footer">
		<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	</div>




</body>
</html>