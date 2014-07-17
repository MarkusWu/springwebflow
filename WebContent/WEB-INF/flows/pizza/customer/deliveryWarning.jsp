<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:output omit-xml-declaration="yes"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Deliver Warning</title>
</head>
<body>
	<h2>Delivery Unavailable</h2>
	<p>The address is outside of our delivery area. You may
	still place the order, but you will need to pick it up
	yourself.</p>
	<![CDATA[
	<a href="${flowExecutionUrl}&_eventId=accept">
	Continue, I'll pick up the order</a> |
	<a href="${flowExecutionUrl}&_eventId=cancel">Never mind</a>
	]]>
</body>
</html>