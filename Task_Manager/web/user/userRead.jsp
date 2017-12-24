<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
        

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
        <title>My Tasks</title>
    </head>
    
     <% String taskTable = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/userNavBar.jsp" %>

            <div class="main"> <!-- main div -->
                <h1>My Tasks</h1>
                <br><br>
                <%= taskTable %>
            </div><!-- close main div -->
 
            <br><br>
            <%@ include file="../includes/footer.jsp" %>
        </div><!-- close wrap div -->
    </body>
</html>
