<%@page import="in.ashish.hostelapp.dtao.Admin"%>
<%@page import="in.ashish.hostelapp.dtao.Resident"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Header</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
        integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/js/all.min.js"
        integrity="sha512-b+nQTCdtTBIRIbraqNEwsjB6UvL3UEMkXnhzd8awtCYh0Kcsjl9uEgwVFVbhoj3uu1DO1ZMacNvLoyJJiNfcvg=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
        rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">  
        <style>
        * {
            font-family: "Montserrat Alternates", sans-serif;
        }

        body {
            padding: 0px;
            margin: 0px;

        }

        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px;
            background-color: #FFB823;
            /* width: 100%; */
            height: 75px;
            /* position: fixed; */
            border-radius: 0px 0px 20px 20px;
        }

        .details {
            display: flex;
            align-items: center;
            margin-right: 30px;
        }

        .details a {
            text-decoration: none;
            color: #FFF1CA;

            /* border:1px solid #FFF1CA; */
            border-radius: 5px;
            /* background-color: #708A58; */
            font-size: large;
            padding: 0px 5px;
            font-weight: 500;
            margin-right: 10px;
        }

        .details a:hover {
            /* text-decoration: underline; */
            text-shadow: 0px 0px 5px rgb(120, 104, 104);
        }

        .logo {
            width: 100px;
            display: flex;
            justify-content: space-around;
            margin-left: 10px;
            /* margin-top: 5px; */
        }

        .logo a {
            text-decoration: none;
        }

        .logo h1 {
            color: #FFF1CA;
            margin-left: 10px;
            font-size: xx-large;
            display: flex;
            margin-top: 15px;

            /* font-weight: 800; */
            /* text-shadow: 0px 0px 5px rgb(120, 104, 104); */
        }

        .logo h1:hover {
            cursor: pointer;
            text-shadow: 0px 0px 5px rgb(120, 104, 104);
        }

        .logo span {
            color: #708A58;
            font-weight: 800;
        }

        .logo img {
            height: 50px;
            width: 50px;
            /* margin-top: 15px; */ 
            border: 1px solid brown;
            border-radius: 20%;
            box-shadow: 0px 0px 10px rgb(120, 104, 104);
            transition: height 0.5s, width 0.5s transform 0.5s;

        }

        .logo img:hover {
            height: 53px;
            width: 53px;
            transform: rotate(-20deg);
        }

        .loginbtn {
            height: 33px;
            width: 130px;
            border-radius: 5px;
            border: none;
            font-size: medium;
            font-weight: 500;
            color: #FFF1CA;
            background-color: #708A58;

        }

        .loginbtn:hover {
            background-color: #2D4F2B;
            cursor: pointer;
            box-shadow: 0px 0px 10px rgb(120, 104, 104);
        }

        .logoutbtn {
            height: 33px;
            width: 110px;
            border-radius: 5px;
            border: none;
            font-size: medium;
            font-weight: 500;
            border: none;

            background-color: red;
            color: beige;

        }

        .logoutbtn:hover {
            background-color: rgb(205, 30, 30);
            cursor: pointer;
            box-shadow: 0px 0px 10px rgb(120, 104, 104);
        }

        #search-bar {
            outline: none;
            border: none;
            width: 30px;
            height: 30px;
            border-radius: 50%;
            transition: border-radius 2s, width 2s;
            /* padding: 0px 20px; */
        }

        #search-bar:hover {
            width: 150px;
            border-radius: 30px;
        }

        #search-icon {
            color: black;
            position: relative;
            right: 27px;

        }
    </style>
</head>
<body>
	<header>
		<div class="logo">
			<a href="home.jsp"><img src="images/logo.jpeg" alt="logo"></a>
			<a href="home.jsp"><h1>
					R <span>oo</span>msy
				</h1></a>
		</div>
		<div class="details">
			<div>
				<input type="search" name="" id="search-bar"
					onmouseover="searchBarChange()"> <i
					class="fa-solid fa-magnifying-glass" id="search-icon"></i>
			</div>

			<!-- <a href="#">About Us</a>
            <a href="#">Contact Us</a> -->
			<a href="home.jsp">Home</a>

			<!-- admin -->
			<%
			if (session.getAttribute("adminLogin") != null) {
				Admin a = (Admin)session.getAttribute("adminLogin");
			%>
			<a href="residentDetails.jsp">Resident</a> 
			<a href="">Leave Approval</a> 
			<a href="">Room</a>
			<a href="">Room Assignment</a> 
			<a href="">Notice Board</a> 
			<a href="">Maintenance</a>

			<div class="dropdown">
				<a class="nav-link dropdown-toggle d-flex align-items-center"
					 id="navbarProfileDropdown" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
					class="fa-solid fa-user mx-2"></i><%=a.getUsername() %>
				</a>
				<ul class="dropdown-menu profile-dropdown "
					aria-labelledby="navbarProfileDropdown">
					
						<li><a class="dropdown-item text-dark" href="adminProfile.jsp">My Profile</a></li>
						<li>
							<form action="logoutAdmin" method="post" class="">
								<input type="hidden"> <input type="submit"
									value="Logout" class="logoutbtn">
							</form>
						</li>

					
				</ul>
			</div>
			<%
			}

			/*              <!-- resident -->*/
			else if (session.getAttribute("loginSuccess") != null) {
				Resident r = (Resident)session.getAttribute("loginSuccess");
			%>
			<a href="">Room Details</a> 
			<a href="">Leave</a> 
			<a href="">Maintenance</a>

			<div class="dropdown">
				<a class="nav-link dropdown-toggle d-flex align-items-center"
					 id="navbarProfileDropdown" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> 
					<i class="fa-solid fa-user mx-2"></i><%=r.getName() %>
				</a>
				<ul class="dropdown-menu profile-dropdown "
					aria-labelledby="navbarProfileDropdown">
					
						<li><a class="dropdown-item text-dark" href="residentProfile.jsp">My Profile</a></li>
						<li>
							<form action="logoutResident" method="post" class="">
								<input type="hidden"> <input type="submit"
									value="Logout" class="logoutbtn">
							</form>
						</li>

					
				</ul>
			</div>
		

			<%
			}

			else {
			%>
			<a href="login.jsp"><button class="loginbtn">Login/SignUp</button></a>

			<%
			}
			%>
		</div>

	</header>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>

</html>