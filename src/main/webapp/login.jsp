<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/js/all.min.js" integrity="sha512-b+nQTCdtTBIRIbraqNEwsjB6UvL3UEMkXnhzd8awtCYh0Kcsjl9uEgwVFVbhoj3uu1DO1ZMacNvLoyJJiNfcvg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <style>
        *{
            font-family: "Montserrat Alternates", sans-serif;
        }
     body{
            margin: 0;
            padding: 0;
            background-image: url("photo_6258206871911516135_x.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-color: #FFF1CA
        
        }

        /* .back {
            height: 540px;
            width: 1000px;
            background-color: white;
            margin: 100px auto;
            border-radius: 15px;
            display: flex;

            /* justify-content: center;
            align-items: center; */
        /* } */

        /* .back img {
            border-radius: 15px;
        } */ 

        .container {
            width: 600px;
            height: 430px;
            margin: 60px auto;
            display: flex;
            flex-direction: column;
            padding: 10px;
            box-shadow: 0 0 10px black;
            border-radius: 20px;
            background-color: #fec345;
            /* justify-content: center; */
            align-items: center;
        }

        .logo {
            display: flex;
            /* margin-left: 55px; */
        }

        .logo h1 {
            font-size: 30px;
            margin-top: 0;
            
        }

        /* #txt1 {
            color: rgb(22, 142, 182);
        }

        #txt2 {
            color: rgb(204, 19, 19);
        } */

        .btn1 {

            display: flex;
            justify-content: center;
            
        }

        #login,
        #signup {
            /* width: 150px; */
            height: 35px;
            border-radius: 5px;
            border: none;
            font-weight: 500;


        }

        #signup {
            background-color: #708A58;
            color: #FFF1CA;
            width: 160px;
            cursor: pointer;




        }

        #login {
            background-color: #2D4F2B;
            color: #FFF1CA;
            width: 155px;
            position: relative;
            /* left: 10px; */
            right: 10px;


        }


         label {
            margin: 20px 0 5px 10px;
            font-size: medium;
            font-weight: 500;
            

        }
        .details{
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
        .txt{
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .btn2 {
            height: 40px;
            width: 350px;
            font-weight: 500;
            border-radius: 5px;
            border: none;
            background-color: #617a4a;
            color: #FFF1CA;
            cursor: pointer;
            /* margin: 10px auto; */
        }
        .btn2:hover{
            background-color: #2D4F2B;
            box-shadow: 0px 0px 10px rgb(120, 104, 104);
        }

        .symbol {
            position: relative;
            /* top: 100px; */
            left: 280px;
            /* bottom: 10px; */
            color: #708A58;
            font-size: 30px;
            background-color: #FFF1CA;
            padding: 1px 5px 0.5px;
            border-radius: 50%;
           
        }
        .symbol:hover{
            color: #2D4F2B;
            
        }

        .txt p a{
            font-size: medium;
            color: #2D4F2B;
            text-decoration: none;
        }
        .txt p a:hover{
            text-decoration: underline;
            text-shadow: 0px 0px 5px rgb(120, 104, 104);
        }
        
        .links{
            display: flex;
            justify-content: flex-end;
            text-align: center;
            /* margin-top: 10px; */
        }
        .links p{
            margin:20px 30px 0 30px;
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



        <div class="container">
            <a href="home.jsp" class="symbol"><i class="fa-solid fa-circle-xmark"></i></a>
            <div class="logo">
                <h1 id="txt1">Resident Login</h1>
              <!--   <h1 id="txt2">Login</h1> -->
            </div>

            <div class="btn1">
				<a href="adminLogin.jsp"><button id="signup">Admin Login</button></a>
                <button id="login">Resident Login</button>
                
            </div>
            
            <%if(request.getAttribute("success") != null){ %>
			<h3 class = "success"><%= request.getAttribute("success") %></h3>
			<%} %>
			<%if(request.getAttribute("error") != null){ %>
			<h3 class = "error"><%= request.getAttribute("error") %></h3>
			<%} %>
            <form action="login" method="post">
                <table class="details">
 
                    <tr>
                        <td><label>Enter your Mail ID: </label></td>
                        <td><input type="email" name="mail" required id="txtbox"></td>
                    </tr>
   
                    <tr>
                        <td><label>Enter the Password: </label></td>
                        <td><input type="password" name="password" required id="txtbox" ></td>
                    </tr>
     
                    
                </table>

                
                <div class="txt">
                    <input type="submit" value="Login" class="btn2">
                    <div class="links">
                        <p>Don't have an account? <a href="signup.jsp">Sign Up</a></p>
                        <p><a href="password.html">Forgot password?</a></p>
                    </div>
                    
                </div>

            </form>

        </div>
    <!-- </div> -->
</body>
</html>