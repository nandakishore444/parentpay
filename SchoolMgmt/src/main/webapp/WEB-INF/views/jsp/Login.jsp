<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="free-educational-responsive-web-template-webEdu">
	<meta name="author" content="webThemez.com">
	<title>MY SCHOOL</title>

	<link rel="stylesheet" href="<c:url value = "/images/favicon.png"/>" />
	
	<link rel="stylesheet" href="<c:url value = "/style/login.css"/>" />
	<link rel="stylesheet" href="<c:url value = "/style/bootstrap.min.css"/>"  media="screen"/>
	<link rel="stylesheet" href="<c:url value = "/style/font-awesome.min.css"/>" />
	<link rel="stylesheet" href="<c:url value = "/style/bootstrap-theme.css"/>"  media="screen"/>
	<link rel="stylesheet" href="<c:url value = "/style/style.css"/>" />
	<link rel="stylesheet" href="<c:url value = "/style/isotope.css"/>" />
	
	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	
	
</head>

<body>
<form:form action="/MySchool/login" method="POST" modelAttribute="main">

<!-- Fixed navbar -->
	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
				<a class="navbar-brand" href="index.jsp">
					<img src="<c:url value = "/images/logo.png"/>" alt="Techro HTML5 template"></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right mainNav">
					<li class="c1"><a href="index.jsp">Home</a></li>
					<li class="c2"><a href="about.jsp">About</a></li>
					<li class="c3"><a href="courses.jsp">Courses</a></li>
					<li class="c4"><a href="price.jsp">Price</a></li>
					<li class="c5"><a href="videos.jsp">Videos</a></li>
					<li class="c6 dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">Dummy Link1</a></li>
							<li><a href="#">Dummy Link2</a></li>
							<li><a href="#">Dummy Link3</a></li>
						</ul>
					</li>
					<li class="c7"><a href="contact.html">Contact</a></li>
					<li class="c8 dropdown active">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Login <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="login.jsp">Parent</a></li>
							<li><a href="login.jsp">Teacher</a></li>
							<li><a href="login.jsp">Admin</a></li>
						</ul>
					</li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<!-- /.navbar -->

		<header id="head" class="secondary">
            <div class="container">
                    <h1>Welcome to School App </h1>
              <!--      <p>Welcome  </p> -->
                </div>
    </header>



<div class="login-block">
    <h1>Login</h1>
    <input type="text" value="" placeholder="Username" id="username" />
    <input type="password" value="" placeholder="Password" id="password" />
    <button>Submit</button>
</div>
</form:form>
</body>
<html>