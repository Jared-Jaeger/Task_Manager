<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
        
        <title>User Manager</title>
        
        <script>
            function confirm_decision(email){
                if(confirm("you want to delete the user?")) // this will pop up confirmation box and if yes is clicked it call servlet else return to page
                {
                    window.location=deleteUser?email=email; 
                    return confirmAction(); 
                }else{
                    return false;
                }
                return true;
            }
        </script>
    </head>
    
    <% String userTable = (String) request.getAttribute("userTable"); %>
    
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/adminNavBar.jsp" %>
            <h1>Manage Site Users</h1>
            <br><br>
            
            <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
			    <h3 class="panel-title">New Users</h3>
			</div>
			<div class="panel-body">
                            <form action="./newUser" method="post" role="form">

			    	<div class="form-group">
                                    <input type="email" name="email" id="email" class="form-control input-sm" placeholder="Email Address" autofocus="autofocus" required>
			    	</div>
                                
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="text" name="firstName" id="first_name" class="form-control input-sm" placeholder="First Name" required>
			    		</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="text" name="lastName" id="last_name" class="form-control input-sm" placeholder="Last Name">
			    		</div>
                                    </div>
			    	</div>
                                
			    	<div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="password" name="passwd" id="password" class="form-control input-sm" placeholder="Password">
			    		</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <select name="role" required class="form-control">
                                                <option value="" selected> -choose option- </option>
                                                <option value="user">User</option>
                                                <option value="admin">Administrator</option>
                                            </select>
			    		</div>
                                    </div>
			    	</div>
			    			
			    	<input type="submit" value="Add" class="btn btn-success btn-block">
			    		
			    </form>
			</div>
                    </div>
    		</div>
            </div>
            <div>
                <br><br>
                <h3>All Users</h3>
                <hr>
                <%= userTable %>
            </div><!-- close main div -->
            <br><br>
            <%@ include file="../includes/footer.jsp" %>
        </div><!-- close wrap div -->
    </body>
</html>
