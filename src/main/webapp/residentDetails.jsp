<%@page import="in.ashish.hostelapp.dtao.Resident"%>
<%@page import="in.ashish.hostelapp.dao.ResidentDAOImpl"%>
<%@page import="in.ashish.hostelapp.dao.ResidentDAO"%>
<%@page import="java.util.ArrayList"%>

<%@page import="in.ashish.hostelapp.dtao.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
        rel="stylesheet">


    <title>Resident Details</title>

    <style>
        * {
            font-family: "Montserrat Alternates", sans-serif;
        }

        body {
            padding: 0px;
            margin: 0px;
            background-color: #FFF1CA;
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

	<%@include file="header.jsp" %>
	<%
	if (session.getAttribute("adminLogin") != null) {
		Admin a = (Admin)session.getAttribute("adminLogin");
		
		ResidentDAO dao = new ResidentDAOImpl();
		ArrayList<Resident> rl = dao.getAll();
	%>

			<%
		if (request.getAttribute("success") != null) {
		%>
		<h3 class="success"><%=request.getAttribute("success")%></h3>
		<%
		}
		%>
		<%
		if (request.getAttribute("error") != null) {
		%>
		<h3 class="error"><%=request.getAttribute("error")%></h3>
		<%
		}
		%>
	
    <div class="h2 text-center m-3 ">Resident Details</div>
    <table class="table   table-hover  table-bordered table-light">
        
        <thead>
            <tr>
                <th>Resident Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone no.</th>
                <th>Gender</th>
                <th>DOB</th>
                <th>Address</th>
                <th>Registration date</th>
                <th>Remove</th>
            </tr>
        </thead>
        <tbody>
       	<%for(Resident r : rl){ %>
            <tr>
                <td><%=r.getResidentId() %></td>
                <td><%=r.getName() %></td>
                <td><%=r.getEmail() %></td>
                <td><%=r.getPhone() %></td>
                <td><%=r.getGender() %></td>
                <td><%=r.getDob() %></td>
                <td><%=r.getAddress() %></td>
                <td><%=r.getRegistrationDate() %></td>
                <td>
                    <form action="deleteResident" method="post">
                        <input type="hidden" name="id" value="<%=r.getResidentId() %>">
                        <input type="submit" value="Delete" class="btn btn-danger">
                    </form>
                </td>

            </tr>
           <%} %>
        </tbody>
    </table>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
        
  <%}
    else{
    		request.setAttribute("error", "Session Expired!");
			RequestDispatcher rd = request.getRequestDispatcher("adminLogin.jsp");
			rd.forward(request, response);
	}%>
</body>

</html>