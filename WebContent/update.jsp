<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Donar's Details</title>
<style>
body{
 background-image:url(" download.jpg");
  background-repeat:no-repeat;
color:white;
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
<center><h1> Update Donar's Details</h1>
<hr></center>
<h2><a href="Index.jsp">Home</a></h2>
<center><form name="update" method="post" action="Update">
		<div>Donar's ID  <input type="text" name="Id" id="Id"/></div>
		<br/>
		<div> Donar's Updated Name  <input type="text" name="name" id="name"/></div>
		<br/>
		<div><input type="image" src="insert.png" value="submit" width="50" height="50"/></div>
	</form>
	</center>
	<footer>
 <b>Name: Divyanshu Mishra<br>
  Contact information: <a href="divyanshu.mishra8@gmail.com">
 divyanshu.mishra8@gmail.com</a><br>Contact Detail: 8318811781<br></b>
</footer>
</body>
</html>