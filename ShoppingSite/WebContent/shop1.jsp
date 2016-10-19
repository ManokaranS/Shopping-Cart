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
       <h3><label>Pick Your Items</label></h3>
 <br>
  </div>
  <div class="shop">
  
   <form:form action="shopping" method="post" commandName="pbean">
   
   <form:hidden path="page" value="shop2"/>
   
   <form:checkbox path="p1" value="Apple" class="check"/><b>Apple</b><br><br>
	<form:checkbox path="p2" value="Orange" class="check"/><b>Orange</b><br><br>
	<form:checkbox path="p3" value="Pinapple" class="check"/><b>PinApple</b><br><br>
 <br><br>
<h3>Go to next Shop</h3><br>
 <input type="submit" value="Go Next" class="login-button"/>
    
	</form:form>
    </div>
    <br>
  </div>


    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>
  
  </body>
</html>
