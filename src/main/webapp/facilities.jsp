<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
        rel="stylesheet">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">

    <title>Facilities</title>

    <style>
        * {
            font-family: "Montserrat Alternates", sans-serif;
        }

        body {
            padding: 0px;
            margin: 0px;
            background-color: #FFF1CA

        }

        .info-cards {
            height: 400px;
            width: 85%;
            background-color: #ffb923a7;
            margin: 10px auto;
            border-radius: 20px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;

        }

        .info-cards div{
            display: flex;
            margin-bottom: 10px;
        }

        .info-box {
            height: 150px;
            width: 230px;
            background-color: #708a58c0;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            margin: 10px 20px;
            border-radius: 20px;
            box-shadow: 0 1px 10px black;
            padding: 10px;
            text-align: center;
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .info-box:hover{
            transform: translateY(-10px);
            box-shadow: 0 3px 20px black;
            
        }

    </style>
</head>

<body>
    <div class="h1 m-4 ">Facilities:</div>
    <div class="info-cards">
        <div>
            <div class="info-box"><h2>Free Wifi</h2></div>
            <div class="info-box"><h2>24/7 Water supply</h2></div>
            <div class="info-box"><h2>3 time meal</h2></div>
        </div>
        <div>
            <div class="info-box"><h2>AC</h2></div>
            <div class="info-box"><h2>CCTV Secured</h2></div>
            <div class="info-box"><h2>Lift</h2></div>
        </div>


    </div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>

</html>