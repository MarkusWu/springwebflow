<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:output omit-xml-declaration="yes"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Spizza</title>
</head>
<body>
	<h2>Thank you for your order!</h2>
	<![CDATA[
	<a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>
	]]>
</body>
</html>