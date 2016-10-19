<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="/WEB-INF/username.tld" prefix="servion" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@page import="java.util.ResourceBundle" %>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Responsive Login Form</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">   
    <link href='http://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'/>
  </head>

  <body>
<div class="login">
  <div class="login-header">
        <h3><label>Your Purchased Items Are</label></h3><br><br>
 <br>
  </div>
  <div class="shop">
  
 <%
 
 
 Enumeration<String> e=session.getAttributeNames();
 
 while(e.hasMoreElements())
 {
	 String pa=e.nextElement().toString();
	 
	 String value=session.getAttribute(pa).toString();
	 
	if(pa.equalsIgnoreCase("username") || pa.equalsIgnoreCase("rb"))
	{
		
	}
	else{
	 out.println(value+" : "+pa);
	 out.println("<br>");
	}
	 
 }
 
 
 %>
<br><br>
<jsp:include page="logout.jsp"></jsp:include>
  
    </div>
    <br>
  </div>


    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
  
  </body>
</html>
