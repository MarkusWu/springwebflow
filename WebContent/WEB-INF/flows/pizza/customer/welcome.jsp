<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:output omit-xml-declaration="yes"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Spizza</title>
</head>
<body>
	<h2>Welcome to Spizza!!!</h2>
	<sf:form>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<input type="text" name="phoneNumber" />
		<br />
		<input type="submit" name="_eventId_phoneEntered"
			value="Lookup Customer" />
	</sf:form>
</body>
</html>