<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<center><h1>Delete Donar's Record</h1>
<hr></center>
<h2><a href="Index.jsp">Home</a></h2>
<center><form name="Delete" method="post" action="Delete">
		<div> Donor Id:   <input type="text" name="id" id="id"/></div>
		<br/>
		<div><input type="image" src="insert.png" value="submit" width="50" height="50"/></div>
	</form>
	</center>
	<footer>
  <p>Designed by LGID: AEN101 <br> EmpID: 1437713 <br> Name: Divyanshu Mishra</p>
  <p>Contact information: <a href="divyanshu.m@tcs.com">
 divyanshu.m@tcs.com</a></p>
</footer>
</body>
</html>