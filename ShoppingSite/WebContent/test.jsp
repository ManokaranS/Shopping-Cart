<%@page import="dbmanagment.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    autoFlush="false"
    buffer="1kb"
    errorPage="error.jsp"
    %>
<%@ include file="header.jsp" %>
<jsp:include page="header.jsp">
<jsp:param value="manokaran" name="mano"/></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Servion global solutions.....
you can pass param in jsp include</h1>
<%
String uname=request.getParameter("uname");
String upass=request.getParameter("upass");

LoginBean lbean=new LoginBean();
lbean.setUname(uname);
lbean.setUpass(upass);
session.setAttribute("lbean", lbean);
%>
<jsp:useBean id="lbean2" class="dbmanagment.LoginBean" scope="session">
	<jsp:setProperty name="lbean2" property="*"/>
</jsp:useBean>
<jsp:forward page="next.jsp"/>
</body>
</html>