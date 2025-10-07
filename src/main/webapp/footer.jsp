<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/js/all.min.js" integrity="sha512-b+nQTCdtTBIRIbraqNEwsjB6UvL3UEMkXnhzd8awtCYh0Kcsjl9uEgwVFVbhoj3uu1DO1ZMacNvLoyJJiNfcvg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
   
    <title>Footer</title>

    <style>

        *{
            font-family: "Montserrat Alternates", sans-serif;
        }
        
        body{
            padding: 0px;
            margin: 0px;
            /* background-color: #FFF1CA; */
        }
          footer{
            display: flex;
            padding: 20px 80px;
            flex-direction: column;
            
            /* width: 80%; */
            height: 370px;
            margin: 0 auto;
            background-color: #FFB823;
            border-radius: 30px 30px 0px 0px;
        }

        .footerheading{
            display: flex;
            justify-content: space-between;
            margin: 10px 0;
            
        }
        .footerlogo{
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            
        }
                .logo{
            width: 100px;
            display: flex;
            justify-content: space-around;
            margin-left: 10px;
        }
        .logo a{
            text-decoration: none;
        }
        .logo h1{
            color: #FFF1CA;
            margin-left: 10px;
            font-size: xx-large;
            display: flex;
        
            /* font-weight: 800; */
            /* text-shadow: 0px 0px 5px rgb(120, 104, 104); */
        }
        .logo h1:hover{
            cursor: pointer;
            text-shadow: 0px 0px 5px rgb(120, 104, 104);
        }
        .logo span{
            color: #708A58;
            font-weight: 800;
        }
        .logo img{
            height: 50px;
            width: 50px;
            margin-top: 15px;
            border: 1px solid brown;
            border-radius: 20%;
            
            /* transition: height 0.5s, width 0.5s; */
            
        }
        .logo img:hover{
            /* height: 55px;
            width: 55px; */
            box-shadow: 0px 0px 10px rgb(120, 104, 104);
        }
        
        .logoicon{
            display: flex;
        }
        .logoicon h1{
            margin-left: 3px;
        }

        .appicons{
            margin-bottom: 20px;
        }

        .appicons img{
            width: 150px;
            height: 40px;
            margin-right: 10px;
            border-radius: 5px;
        }



   


        .footer1{
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }
        .footerLinks{
            display: flex;
            margin-bottom:0;
        }
        .footerLinks a{
            margin-left: 35px;
        }

        .footer2{
            display: flex;
            justify-content: flex-end;
            margin-top: 0;
            margin-bottom: 75px;
            
        }
        .footer2 p{
            margin-left: 35px;
            margin-top: 0;
            color: #2D4F2B;
            word-spacing: 2px;
            
        }

        .footer1 a, .footer2 a{

            text-decoration: none;
            color: #2D4F2B;

        }
        .footer1 a:hover, .footer2 a:hover{
            text-decoration: underline 1px solid black;
        }

        .icons{
            margin: 10px 0;
        }
        .icons a{
            font-size: 20px;
            color: #2D4F2B;
            margin-right: 10px;
        }
        .footerLinks p, .footer2 p{
            font-size: 13px;
        }

        .contact{
            color: #2D4F2B;
            margin-top: 0px;
        }
        .contact-info p{
            margin: 10px 0px;
        }
        .contact-info p a{
            text-decoration: none;
            color: #2D4F2B;
        }

    </style>
</head>

<body>
    <footer>
        <div class="footerheading">
            <div class="footerlogo">
                   <div class = "logo">
                        <a href="home.jsp"><img src="images/logo.jpeg" alt="logo"></a>
                        <a href="home.jsp"><h1>R <span>oo</span>msy</h1></a>
                    </div>

<!-- 
                <div class="appicons">
                    <a href="#"><img src="images/astore.jpg" alt=""></a>
                    <a href="#"><img src="images/gplay.jpg" alt=""></a>
                </div> -->
            </div>
        </div>

        <div class="contact">
                <h3>Contact:</h3>
                <div class="contact-info">
                    <p><i class="fas fa-phone me-2"></i>+91 7896554211</p>
                    <p><i class="fas fa-envelope me-2"></i><a href="mailto:ashishdevajan2@gmail.com"> needhelp@roomsy.com</a> </p>
                    <p><i class="fas fa-map-marker-alt me-2"></i> 66 Brooklyn Golden Street Line, Bangalore</p>
                </div>
        </div>
        <div class="footer1">
            <div class="icons">
                <a href="www.facebook.com"><i class="fa-brands fa-square-facebook"></i></a>
                <a href="www.twitter.com"><i class="fa-brands fa-x-twitter"></i></a>
                <a href="www.instagram.com"><i class="fa-brands fa-instagram"></i></a>
            </div>
            <div class="footerLinks">
                <a href="#">
                    <p>Privacy Policy</p>
                </a>
                <a href="#">
                    <p>Terms</p>
                </a>
    
                <a href="#">
                    <p>Do not sell or share my personal information</p>
                </a>
            </div>
        </div>

        <div class="footer2">
            <p>This site is protected by reCAPTCHA and the Google <a href="#">Privacy Policy</a> and <a href="#">Terms of Service</a> apply.</p>
            <p>&copy;2025 Roomsy Inc. All Rights Reserved.</p>
        </div>


    </footer>
</body>

</html>