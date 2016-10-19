<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="/WEB-INF/username.tld" prefix="servion" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
  <head>
    <meta charset="UTF-8">
    <title>Responsive Login Form</title>
    
    
    
    <link rel='stylesheet prefetch' href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css'>

        <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">
		    <link href='http://fonts.googleapis.com/css?family=Ubuntu:500' rel='stylesheet' type='text/css'>
  </head>

  <body>


<div class="login">
  <div class="login-header">

  </div>
 
<form:form action="logout" method="post" commandName="lbean">
    <input type="submit" value="<servion:getText key="logout"/>" class="login-button">
	</form:form>   
  </div>


    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
  
  </body>
</html>
