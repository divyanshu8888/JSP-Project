<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,model.DonorBean" %> 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<style>
body{
 background-image:url(" download.jpg");
  background-repeat:no-repeat;
  color: white; 

   background-size:cover;
 }
  a:link {
    color: green;
}

a:visited {
    color: green;
}


a:hover {
    
    color: white; background: blue;
}
footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: yellow;
   color: red;
   text-align: center;
}
</style>
</head>
<body>

<center><h1>Donor's Details</h1></center>
<hr>
<h2><a href="Index.jsp">Home</a></h2>
<%
  
 List<DonorBean> DonList = (List<DonorBean>)request.getAttribute("DonList");	
 		
%>
	
	<center>
	<table border="1">
		<tr><th>DONOR ID</th><th>NAME</th><th>DOB</th><th>ADDRESS</th><th>PHONE</th><th>GENDER</th><th>BLOODGROUP</th></tr>
		<% for(DonorBean don : DonList){ %>
		<tr><td><%=don.getDonorID() %></td>
			<td><%=don.getName() %></td>
			<td><%=don.getDOB() %></td>
			<td><%=don.getAddress() %></td>
			<td><%=don.getPhone() %></td>
			<td><%=don.getGender() %></td>
			<td><%=don.getBloodGroup() %></td>
		</tr><% } %>
	</table>
	</center>
	<footer>
  <p>Designed by LGID: AEN101 <br> EmpID: 1437713 <br> Name: Divyanshu Mishra</p>
  <p>Contact information: <a href="divyanshu.m@tcs.com">
 divyanshu.m@tcs.com</a></p>
</footer>
</body>
</html>