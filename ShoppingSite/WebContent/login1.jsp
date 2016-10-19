<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="/WEB-INF/username.tld" prefix="servion" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap Login &amp; Register Templates</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="<c:url value="resources/assets/bootstrap/css/bootstrap.min.css"></c:url>"/>
        <link rel="stylesheet" href="<c:url value="/resources/assets/font-awesome/css/font-awesome.min.css"></c:url>"/>
		<link rel="stylesheet" href="<c:url value="/resources/assets/css/form-elements.css"></c:url>">
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/style.css"></c:url>"/>
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<c:url value="/resources/assets/ico/apple-touch-icon-144-precomposed.png"></c:url>">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<c:url value="/resources/assets/ico/apple-touch-icon-144-precomposed.png"></c:url>">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<c:url value="/resources/assets/ico/apple-touch-icon-72-precomposed.png"></c:url>">
        <link rel="apple-touch-icon-precomposed" href="<c:url value="/resources/assets/ico/apple-touch-icon-57-precomposed.png"></c:url>">

    </head>
<style>
body{
float:right;
}
</style>
    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                	
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Bootstrap</strong> Login &amp; Register Forms</h1>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="col-sm-5">
                        	
                        	<div class="form-box">
	                        	<div class="form-top">
	                        		<div class="form-top-left">
	                        			<h3>Login to our site</h3>
	                            		<p>Enter username and password to log on:</p>
	                        		</div>
	                        		<div class="form-top-right">
	                        			<i class="fa fa-key"></i>
	                        		</div>
	                            </div>
	                            <div class="form-bottom">
				                    <form:form action="loginpage" method="post" commandName="userbean" role="form" class="login-form">
				                    	<div class="form-group">
				                    		<label class="sr-only" for="form-username"><servion:getText key="username"/></label>
				                        	<form:input type="text" path="username" name="form-username" required="required" placeholder="Username..." class="form-username form-control" id="form-username"/>
				                        </div>
				                        <div class="form-group">
				                        	<label class="sr-only" for="form-password"><servion:getText key="password"/></label>
				                        	<form:password type="password" path="password" name="password" required="required"  placeholder="eg. X8df!90EO" class="form-password form-control" id="form-password"/>
				                        </div>
				                        <button type="submit" class="btn"><servion:getText key="login"/></button>
				                    </form:form>
			                    </div>
		                    </div>                       
                        </div>
                        
                    </div>
				</div>	
            </div>
            
        </div>

        <!-- Javascript -->
        <script src="<c:url value="/resources/assets/js/jquery-1.11.1.min.js"></c:url>"></script>
        <script src="<c:url value="/resources/assets/bootstrap/js/bootstrap.min.js"></c:url>"></script>
        <script src="<c:url value="/resources/assets/js/jquery.backstretch.min.js"></c:url>"></script>
        <script src="<c:url value="/resources/assets/js/scripts.js"></c:url>"></script>
        
        <!--[if lt IE 10]>
            <script src="<c:url value="/resources/assets/js/placeholder.js"></c:url>"></script>
        <![endif]-->

    </body>

</html>