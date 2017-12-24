<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="style.css" />	
        
        <title>Group 4 Task Manager</title>
    </head>
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="includes/navBar.jsp" %>

            <div class="main"> <!-- main div -->
                <h1>Welcome!</h1>
                <br>
                <p>This Task Manager was created as a group project for the Fall 2017 Software Design and Development class. You are currently looking at Group 4's project. We do not promise that this is the best task manager that you have ever used but we do promise that we put a lot of effort into it. We may have hit our heads against a few tables or walls along the way but here it is. Please be nice while you judge our work for we put our heart and soul into this (not literally). The members of group 4 include Kate Anderson, Jared Jaeger, and Orestes Franco.</p>
                <br>
                <p>Here are a few things that you can do using our Task Manager:</p>
                <ul>
                    <li>Login- this way you don't have to worry about filtering through other people's tasks</li>
                    <li>Add tasks</li>
                    <li>Delete tasks</li>
                    <li>Update tasks</li>
                    <li>View in depth details abut a task</li>
                    <li>Mark a task as complete</li>
                </ul>
       
            </div><!-- close main div -->
            <br><br>
            <%@ include file="includes/footer.jsp" %>
        </div><!-- close wrap div -->
    </body>
</html>