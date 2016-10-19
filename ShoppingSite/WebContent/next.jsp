<%@page import="dbmanagment.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>this is next page</p>
<%
LoginBean lbean=(LoginBean)session.getAttribute("lbean");
LoginBean lbean2=(LoginBean)session.getAttribute("lbean2");
out.println(lbean.getUname());
out.println(lbean.getUpass());
out.println(lbean2.getUname());
out.println(lbean2.getUpass());
%>
</body>
</html>