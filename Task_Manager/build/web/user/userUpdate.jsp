<%-- 
    Document   : updateUserDetails
    Created on : Dec 4, 2017, 2:05:21 PM
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
        
        <title>Update My Profile</title>
    </head>
    <body>
        <div class="container-fluid">
        <%@ include file="../includes/userNavBar.jsp" %>

        <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
			    <h3 class="panel-title">Update My Profile</h3>
			</div>
			<div class="panel-body">
                            <form action="./uUD" method="post" role="form">

			    	<div class="form-group">
                                    <input type="email" name="email" id="email" class="form-control input-sm" value="<%= user.getEmail()%>" autofocus="autofocus" readonly>
			    	</div>
                                
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="text" name="firstName" id="first_name" class="form-control input-sm" value="<%= user.getFirstName()%>" required>
			    		</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="text" name="lastName" id="last_name" class="form-control input-sm" value="<%= user.getLastName()%>">
			    		</div>
                                    </div>
			    	</div>
                                
			    	<div class="row">
                                    <div class="col-xs-12 col-sm-12 col-md-12">
			    		<div class="form-group">
                                            <input type="text" name="passwd" id="password" class="form-control input-sm" value="<%= user.getPasswd()%>">
			    		</div>
                                    </div>
			    	</div>
			    			
			    	<input type="submit" value="Update" class="btn btn-success btn-block">
			    		
			    </form>
			</div>
                    </div>
    		</div>
            </div>
        <%@ include file="../includes/footer.jsp" %>
        </div>
    </body>
</html>