<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:output omit-xml-declaration="yes"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Pizza</h2>
	<sf:form commandName="pizza">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey }"/>
		
		<b>Size: </b><br/>
		<br/>
		<br/>
		<b>Toppings:</b>
		<sf:checkboxes path="toppings" items="${toppingsList }" delimiter="&lt;br/&gt;"/><br/><br/>
		<input type="submit" class="button" name="_eventId_addPizza" value="Continue"/>
		<input type="submit" class="button" name="_eventId_cancel" value="Cancel"/>
	</sf:form>
</body>
</html>