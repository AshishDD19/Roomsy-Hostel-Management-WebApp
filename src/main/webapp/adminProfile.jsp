<%@page import="in.ashish.hostelapp.dtao.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Profile</title>

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
    <style>
        * {
            font-family: "Montserrat Alternates", sans-serif;
        }

        body {
            margin: 0;
            padding: 0;
            background-image: url("photo_6258206871911516135_x.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-color: #FFF1CA
        }

        .back {
            height: 540px;
            width: 1000px;
            background-color: white;
            margin: 100px auto;
            border-radius: 15px;
            display: flex;

            /* justify-content: center;
            align-items: center; */
        }

        .back img {
            border-radius: 15px;
        }

        .container {
            width: 600px;
            height:430px;
            margin: 60px auto;
            display: flex;
            flex-direction: column;
            padding: 20px;
            box-shadow: 0 0 10px black;
            border-radius: 20px;
            background-color: #fec345;
            /* justify-content: center; */
            align-items: center;
        }

   

        .logo h1 {
            font-size: 35px;
            margin-top: 0;
        }









        label {
            margin: 20px 0 5px 10px;
            font-size: medium;
            font-weight: 500;


        }

        .details {
            margin: 20px;
        }

        .details input {
            height: 40px;
            width: 240px;
            border-radius: 5px;
            border: none;
            margin: 10px;
            box-shadow: 0 0 5px gray;
            /* background-color: rgb(224, 225, 225); */
            outline: none;
            /* margin-left: 10px; */
            padding: 0 15px;
            font-size: medium;

        }

        .txt {
            display: flex;
            justify-content: center;
        }

        .btn2 {
            height: 40px;
            width: 220px;
            font-weight: 500;
            border-radius: 5px;
            border: none;
            background-color: #617a4a;
            color: #FFF1CA;
            cursor: pointer;
            margin: 10px auto;
        }

        .btn2:hover {
            background-color: #2D4F2B;
            box-shadow: 0px 0px 10px rgb(120, 104, 104);
        }

        .btn2 a {
            text-decoration: none;
            color: #FFF1CA;
            font-size: 20px;
        }

        .symbol {
            position: relative;
            /* top: 100px; */
            left: 280px;
            /* bottom: 10px; */
            color: #708A58;
            font-size: 30px;
            background-color: #FFF1CA;
            padding: 1px 5px;
            border-radius: 50%;

        }

        .symbol:hover {
            color: #2D4F2B;

        }

        #address {
            width: 240px;
            height: 80px;
            border-radius: 5px;
            border: none;
            margin: 10px;
            box-shadow: 0 0 5px gray;
            /* background-color: rgb(224, 225, 225); */
            outline: none;
            /* margin-left: 10px; */
            /* padding: 10px 15px; */
            font-size: medium;
        }

        .gender-section {
            display: flex;
            /* padding: 10px 0; */
        }

        #gender {
            margin: 0 10px;
            width: 15px;
            height: 15px;
            border-radius: 50%;
            cursor: pointer;
        }
                 .success{
        	color:green;
        	margin-top: 10px;
        	padding: 0px;
        	font-size: medium;
        	font-weight: 500;
        }
        .error{
        	color: red;
        	text-align: center;
        	padding: 0px;
        		margin-top: 10px;
        	font-size: medium;
        	font-weight: 500;
        }
    </style>
</head>

<body>
    <!-- <div class="back"> -->

	<%
	if (session.getAttribute("adminLogin") != null) {
		Admin a = (Admin)session.getAttribute("adminLogin");
	%>

    <div class="container">
        <a href="home.jsp" class="symbol"><i class="fa-solid fa-circle-xmark"></i></a>
        <div class="logo">
            <h1 id="txt1">Admin Profile</h1>
            
        </div>

            <%if(request.getAttribute("success") != null){ %>
			<h3 class = "success"><%= request.getAttribute("success") %></h3>
			<%} %>
			<%if(request.getAttribute("error") != null){ %>
			<h3 class = "error"><%= request.getAttribute("error") %></h3>
			<%} %>

        <form action="#">
            <table class="details">
                <tr>

                    <td><label>Name: </label></td>
                    <td><input type="text" name="name" required id="txtbox" value="<%=a.getUsername()%>" readonly></td>
                </tr>
                <tr>
                    <td><label>Mail ID: </label></td>
                    <td><input type="email" name="mail" required id="txtbox" value="<%=a.getEmail()%>" readonly></td>
                </tr>

                <tr>
                    <td><label>Phone number: </label></td>
                    <td><input type="tel" name="phone" id="txtbox" value="<%=a.getPhone()%>" readonly></td>
                </tr>
                
            </table>



            <div class="txt">
                <button class="btn2"><a href="updateAdmin.jsp">Update Profile</a></button>
                <button class="btn2"><a href="changeAdminPassword.jsp">Change Password</a></button>
                
            </div>

        </form>

    </div>
    <%}
    else{
    		request.setAttribute("error", "Session Expired!");
			RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
			rd.forward(request, response);
	}%>
</body>

</html>