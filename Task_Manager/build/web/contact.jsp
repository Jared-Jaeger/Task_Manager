<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="XA-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
        
	<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="style.css" />
        
        <title>Contact Us</title>
    </head>
    <body>
         <div class="container-fluid"> <!-- div to hold all other divs -->
            <%@ include file="includes/navBar.jsp" %>

            <div class="main"> <!-- main div -->
                <h1>Group 4</h1>
                <p>If you have any questions about or Task Manager, do not hesitate to ask! You can send an email to any one of us and we will be happy to answer your question at our earliest convenience. If you are having problems, we are sorry for the inconvenience. Be sure to tell us the problem in the subject line so that we can try and fix it. Please keep in mind that we are students and it may take us some time to figure out how to fix the problem.</p>
                <br>
                <div class="jumbotron">
                  <div class="row">
                      
                      <div class="col-md-4 col-xs-12 col-sm-12 col-lg-4">
                          <div class="container" style="border-bottom:1px solid black">
                            <h2>Jared Jaeger</h2>
                          </div>
                            <hr>
                          <ul class="container details">
                            <li><p><span class="glyphicon glyphicon-envelope one" style="width:25px;"></span>jared-jaeger@uiowa.edu</p></li>
                            <li><p><span class="glyphicon glyphicon-map-marker one" style="width:25px;"></span>University of Iowa</p></li>
                          </ul>
                      </div>
                     
                      <div class="col-md-4 col-xs-12 col-sm-12 col-lg-4">
                          <div class="container" style="border-bottom:1px solid black">
                            <h2>Orestes Franco</h2>
                          </div>
                            <hr>
                          <ul class="container details">
                            <li><p><span class="glyphicon glyphicon-envelope one" style="width:25px;"></span>orestes-franco@uiowa.edu</p></li>
                            <li><p><span class="glyphicon glyphicon-map-marker one" style="width:25px;"></span>University of Iowa</p></li>
                          </ul>
                      </div>
                      
                      <div class="col-md-4 col-xs-12 col-sm-12 col-lg-4">
                          <div class="container" style="border-bottom:1px solid black">
                            <h2>Kate Anderson</h2>
                          </div>
                            <hr>
                          <ul class="container details">
                            <li><p><span class="glyphicon glyphicon-envelope one" style="width:50px;"></span>kate-anderson@uiowa.edu</p></li>
                            <li><p><span class="glyphicon glyphicon-map-marker one" style="width:50px;"></span>University of Iowa</p></li>
                          </ul>
                      </div>
                  </div>
                </div>
                
            </div><!-- close main div -->
            
            <br><br>
            <%@ include file="includes/footer.jsp" %>
        </div><!-- close wrap div -->
    </body>
</html>
