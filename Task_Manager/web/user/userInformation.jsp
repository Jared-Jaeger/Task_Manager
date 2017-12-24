<%-- 
    Document   : userDetails
    Created on : Dec 4, 2017, 1:37:09 PM
    Author     : itzjs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
        <%@page import="model.Users"%>
        <% Users user = (Users) request.getAttribute("user");%>
        
        <title>My Profile</title>
    </head>
    <body>
        <div class="container-fluid">
        <%@ include file="../includes/userNavBar.jsp" %>

        <div class="row center-block">
            <div class="col-xs-12 col-sm-6 col-md-6">
                <div class="well well-sm">
                    <div class="row">
                        <div class="col-sm-6 col-md-4">
                            <img src="http://moziru.com/images/profile-clipart-generic-user-11.png" alt="" class="img-rounded img-responsive" />
                        </div>
                        <div class="col-sm-6 col-md-8">
                            <h3><%= user.getFirstName()%> <%= user.getLastName()%></h3>
                        
                            <p>
                                <i class="glyphicon glyphicon-envelope"></i> <%= user.getEmail()%>
                                <br>
                                <i class="glyphicon glyphicon-lock"></i> <%= user.getPasswd()%></p>
                            <!-- Split button -->
                            <a href="./updateUser" class="btn btn-success"> Update </a>
                            <a href="./deleteUser" class="btn btn-danger"> Delete </a>
                        </div>
                    </div>
                </div>
            </div>        
        </div>
                            
        <%@ include file="../includes/footer.jsp" %>
        </div>
    </body>
</html>