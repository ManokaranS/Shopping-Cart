<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<h2 align="center">Welcome Returned User <%=session.getAttribute("username") %></h2>
 
<form action="login.do" method="POST">
<a href="shop1.jsp">Click here to Shopping</a>
<jsp:include page="logout.jsp"></jsp:include>
  
</form>
  </body>
  </html>

