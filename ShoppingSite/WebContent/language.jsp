<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
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
    <h2>Select Language</h2>
  </div>
  <div class="login-form">
  					   <form:form action="indexpage" method="post" commandName="lbean">
  					      <h3 class="h3">Select Language</h3><br><br>
					           <form:select path="lang" class="select">
					   
							<form:option value="ta" >Tamil</form:option>
							<form:option value="te" >Telugu</form:option>
							<form:option value="en" >English</form:option>
							
					       </form:select><br>
					   <br>
					   <input type="submit" value="Languange"/>
				</form:form>
  </div>
  <br><br>
</div>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js'></script>

        

    
    
  </body>
</html>
