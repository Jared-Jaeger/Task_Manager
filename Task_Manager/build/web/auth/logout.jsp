<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
        
        <title>Task Manager | Logout</title>
    </head>
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/navBar.jsp" %>
            <h1>You have been logged out.</h1>
        
        <%
            session.invalidate();
            
                String url = "../index.jsp";
                
                response.sendRedirect(url);
        %>
        </div><!-- close main div -->
        <br><br>
        <%@ include file="../includes/footer.jsp" %>
    </body>
</html>
