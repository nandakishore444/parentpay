<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>HITECH School</title>
<meta charset="UTF-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value = "/style/style.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value = "/style/style2.css"/>" />
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: inline-block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111;
}

.vertical-menu {
	width: 200px;
}

.vertical-menu a {
	background-color: #eee;
	color: black;
	display: block;
	padding: 12px;
	text-decoration: none;
}

.vertical-menu a:hover {
	background-color: #ccc;
}

.vertical-menu a.active {
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>

	<form:form action="/MySchool/login" method="POST" modelAttribute="main">
		<div id="page">
			<div id="header">
				<div id="section" style="margin: 10px;">
					<div>
						<h4 style="color: white; font-size: 45px;">
							Logged in as Admin
							</h1>
					</div>
				</div>
			</div>
			<div>
				<ul>
					<li><a href="#home">Planning</a></li>
					<li><a href="#home">My Class</a></li>
					<li><a href="#home">Reports</a></li>
					<li><a href="#home">Employee Services Management</a></li>
				</ul>
			</div>
			<table>
				<tr>
					<td>
						<div class="vertical-menu" width="25%">
							<a href="#" class="active">Profile</a> <a href="#">Branches</a> <a
								href="#">Classes</a> <a href="#">Students</a> <a href="#">Teachers</a>
						</div>
					</td>
					<td>
						<div width="75%">
							<p></p>
						</div>
					</td>
				</tr>
			</table>

			<div id="footer">
				<div>
					<div id="connect">
						<a href="#"><img
							src="<c:url value = "/images/icon-facebook.gif"/>" alt="" /></a> <a
							href="#"><img
							src="<c:url value = "/images/icon-youtube.gif"/>" alt="" /></a> <a
							href="#"><img
							src="<c:url value = "/images/icon-twitter.gif"/>" alt="" /></a>
					</div>
				</div>
			</div>
		</div>
	</form:form>
</body>
</html>