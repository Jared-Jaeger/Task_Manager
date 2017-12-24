<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
	<div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
		<span class="sr-only">Toggle navigation</span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="../admin/index.jsp">Fall 2017 Task Manager</a>
	</div>

	<!-- Collect the nav links, forms, and other content for toggling -->
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
		<li><a href="../admin/index.jsp">Home</a></li>
		<li><a href="${pageContext.request.contextPath}/admin/usermanager">Manage Users</a></li>
                <li><a href="${pageContext.request.contextPath}/admin/readAllTasks">View all Tasks </a></li>
                <li><a href="${pageContext.request.contextPath}/admin/readMyTasks">View my Tasks </a></li>
                <li><a href="${pageContext.request.contextPath}/admin/addTask.jsp">Add a Task </a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="<%=request.getContextPath()%>/auth/logout.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
            </ul>
	</div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav><!-- close navigation bar -->