<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Take Payment</title>
</head>
<body>
	<h2>Payment Summary</h2>
	<sf:form commandName="paymentDetails">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
		<sf:hidden path="totalCost" value="${totalCost}"/>
		<b>Total Cost is : ${totalCost}</b>
		<br />
		<b>Pay by</b>
		<sf:select path="paymentType" items="${paymentsList}"/>
		<input type="submit" class="button" name="_eventId_paymentSubmitted" value="Continue"/>
		<input type="submit" class="button" name="_eventId_cancel" value="Cancel"/>
	</sf:form>
</body>
</html>