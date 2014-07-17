<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:output omit-xml-declaration="yes"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Registration Form</title>
</head>
<body>
	<h2>Customer Registration</h2>
	<sf:form commandName="customer">
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
		<b>Phone number: </b>
		<sf:input path="phoneNumber" />
		<br />
		<b>First Name: </b>
		<sf:input path="firstName" />
		<br />
		<b>Last Name: </b>
		<sf:input path="lastName"/>
		<b>Street: </b>
		<sf:input path="address.street" />
		<br />
		<b>City: </b>
		<sf:input path="address.city" />
		<br />
		<b>State: </b>
		<sf:input path="address.state" />
		<br />
		<b>Zip Code: </b>
		<sf:input path="address.zipCode" />
		<br />
		<input type="submit" name="_eventId_submit" value="Submit" />
		<input type="submit" name="_eventId_cancel" value="Cancel" />
	</sf:form>
</body>
</html>