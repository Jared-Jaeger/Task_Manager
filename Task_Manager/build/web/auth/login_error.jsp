<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
        
        <title>Task Manager | Login Error</title>
    </head>
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/navBar.jsp" %>
            <div class="row-fluid">
                <div class="col-md-offset-4 col-md-4" id="box">
                    <h2 class="text-danger">Login Error</h2>
                    <p class="text-danger">You did not log in successfully.</p>
                    <hr>
                    <form action="j_security_check" method="post" class="form-horizontal" id="contact_form">
                        <fieldset>
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input name="j_username" placeholder="Email" class="form-control" type="text" autofocus="autofocus">
                                    </div>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input name="j_password" placeholder="Password" class="form-control" type="text">
                                    </div>
                                </div>
                            </div>
                            
                            <div class="form-group">
                                <div class="col-md-12">
                                    <div class="input-group">
                                        <button type="submit" class="btn btn-md btn-success pull-right">Login </button>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>     
        </div><!-- close main div -->
        <br><br>
        <%@ include file="../includes/footer.jsp" %>
    </body>
</html>
