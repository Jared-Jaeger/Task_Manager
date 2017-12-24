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
    $( "#datepicker" ).datepicker({
        onClose:function(){
            valid();
        }
    });
  } );
  
  </script>
        <%@page import="model.Tasks"%>
        <% Tasks task = (Tasks) request.getAttribute("task");%>
        <title>My Tasks | Task Manager</title>
    </head>
    
    <% String taskTable = (String) request.getAttribute("table"); %>
    
    <body>
        <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="../includes/userNavBar.jsp" %>


            <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
			    <h3 class="panel-title">Update Task</h3>
			</div>
			<div class="panel-body">
                            <form action="./submitTaskUpdate" method="post" role="form">

                                <div class="form-group">
                                    <input type="hidden" name="taskID" class="form-control input-sm" value="<%= task.getTaskID()%>" >
			    	</div>
                                
                                
			    	<div class="form-group">
                                    <input type="text" name="taskname" class="form-control input-sm" value="<%= task.getTaskName()%>" autofocus="autofocus" required>
			    	</div>
                                
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <select name="taskcat" required class="form-control">
                                                <option value="" selected> -category- </option>
                                                <option value="School">School</option>
                                                <option value="Work">Work</option>
                                                <option value="Personal">Personal</option>
                                            </select>
			    		</div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
			    		<div class="form-group">
                                            <input type="text" name="taskduedate" id="datepicker" class="form-control input-sm" value="<%= task.getTaskduedate()%>">
			    		</div>
                                    </div>
			    	</div>
                                
                                <div class="form-group">
                                    <input type="text" name="taskdetails" class="form-control input-sm" value="<%= task.getTaskdetails()%>" >
			    	</div>
			    			
			    	<input type="submit" value="Update" id="submit" class="btn btn-success btn-block">
			    		
			    </form>
			</div>
                    </div>
    		</div>
            </div>
           
            <%@ include file="../includes/footer.jsp" %>
        </div><!-- close wrap div -->
    </body>
</html>

