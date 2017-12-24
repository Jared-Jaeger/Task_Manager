<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="../bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../style.css" />
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  
  </script>
        <%@page import="model.Tasks"%>
        <% Tasks task = (Tasks) request.getAttribute("task");%>
        <title>Task Details</title>
    </head>
    
    <% String taskTable = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/userNavBar.jsp" %>


            <div class="row center-block">
                <div class="col-xs-12 col-sm-6 col-md-6">
                    <div class="well well-sm">
                        <div class="row">
			    <div class="col-sm-6 col-md-4">
                                <img src="http://shmector.com/_ph/18/890806926.png" alt="" class="img-rounded img-responsive"/>
                            </div>
			<div class="col-sm-6 col-md-8">
                            <h3><%= task.getTaskName()%></h3>
                            
                            <p>
                                <input type="hidden" name="taskID" class="form-control input-sm" value="<%= task.getTaskID()%>">
                                <i class="glyphicon glyphicon-calendar"></i> <%= task.getTaskduedate()%>
                                <br>
                                <i class="glyphicon glyphicon-folder-open"></i> <%= task.getTaskcat()%>
                                <br>
                                <i class="glyphicon glyphicon-menu-hamburger"></i> <%= task.getTaskdetails()%>
                                <br>
                                <i class="glyphicon glyphicon-plus"></i> <%= task.getDateAdded()%>
                                <br>
                                <i class="glyphicon glyphicon-pencil"></i> <%= task.getDateUpdated()%>
                            </p>
                            
                            <a href="updateTask?taskID=<%= task.getTaskID()%>" class="btn btn-success"> Update </a>
                            <a href="deleteTask?taskID=<%= task.getTaskID()%>" onclick="return confirm('Are you sure you want to delete this task?');" class="btn btn-danger"> Delete </a>
                                
			</div>
                        </div>
                    </div>
    		</div>
            </div>
           
            <%@ include file="../includes/footer.jsp" %>
        </div><!-- close wrap div -->
    </body>
</html>

