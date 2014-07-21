<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%-- <jsp:output omit-xml-declaration="yes"/> --%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Home page</title>
</head>
<body>
	<h2>Welcome to SpringWebflow Homepage</h2>
	<ul>
		<c:forEach var="value" items="${maocaiMusts}">
			<li>${value}</li>
		</c:forEach>
	</ul>
	<a href="flows/pizza">click me</a>
	<sf:form>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<input type="submit" name="_eventId_identifyCustomer"
			value="Order Pizza" />
	</sf:form>
	
	<a href="_flowExecutionKey=${flowExecutionKey}&_eventId=IdentifyCustomer">Order Pizza</a>
</body>
</html>