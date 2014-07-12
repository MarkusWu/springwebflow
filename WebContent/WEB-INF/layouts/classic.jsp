<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>
	<tiles:getAsString name="title"/>
</title>
</head>
<body>
	<table>
		<tr>
			<td colspan="2">
				<tiles:insertAttribute name="header"/>
			</td>
		</tr>
		<tr>
			<td>
				<tiles:insertAttribute name="menu"/>
			</td>
			<td>
				<tiles:insertAttribute name="body"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<tiles:insertAttribute name="footer"/>
			</td>
		</tr>
	</table>
</body>
</html>