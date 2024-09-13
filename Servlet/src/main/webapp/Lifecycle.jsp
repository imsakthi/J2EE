<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!public void jspInit() {
		System.out.println("this is init method");
	}%>
	<%!public void jspDestroy() {
	System.out.println("this is Destroy method");
}%>
	<%
	System.out.println("this is service method");
	%>
	
	<%  Date d=new Date();
	 %>
	 <h1>current Date and time=<%=d %></h1>
</body>
</html>