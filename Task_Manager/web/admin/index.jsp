<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
        
        <title>Task Manager | Admin</title>
    </head>
    
     
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/adminNavBar.jsp" %>

            <div class="main"> <!-- main div -->
                <h1>Hello Admin!</h1> <h3>${pageContext.request.userPrincipal.name}</h3>
                <hr>
                <h5> Admin Functionality </h5><hr>
                <p>As an administrator you can manage other users and view all tasks as well as view and manage your individual tasks. Try not to abuse your power. I know that is asking a lot.</p>
                
            </div><!-- close main div -->
            <br><br>
            <%@ include file="../includes/footer.jsp" %>
        </div><!-- close wrap div -->
    
    </body>
</html>
