<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hi</title>
<style>
 body{
 background-image:url(" download.jpg");
  background-repeat:no-repeat;

   background-size:cover;
 }
    #ad{
     background-color: rgba(100, 76, 76, 0.3) ;
   
   left-margin: 20;
   padding-bottom: 20px; 
   text-align: justify;
   width: 750;
   height:20px;
    text-align:center;
   color:yellow; 
    }
    #add{
     background-color: rgba(60, 100, 30, 0.5) ;
   
   left-margin:130;
    padding-top: 40px; 
    left-margin:20;
   padding-bottom: 40px; 
   text-align: justify;
   
   margin-top:20px;
   margin-left:150;
   margin-right:20px;
font-size:20px;
   text-align:center;
   border:1px solid red;
   color: white; 
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
   position: relative;
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
<div id="ad"><h1>New Blood Donor Registration Form</h1></div>
<h2><a href="Index.jsp">Home</a></h2>
<div id="add">
<form name="insert" method="post" action="Insert">
		<div>Reg ID <input type="text" name="id" id="id"/></div>
		<br>
		<div>Name <input type="text" name="name" id="name"/></div>
		<br>
		<div>Date of Birth <input type="text" name="dob" id="dob"/></div>
		
		
		<br>
		<div>Gender <br>
			 <input type="radio" name="Gender" value="M" id="Gender"checked> Male
  			 <input type="radio" name="Gender" value="F" id="Gender" >Female<br></div>
		<br>
		<div>Contact number <input type="text" name="cno" id="cno"/></div>
		<br/>
		<div>Address <input type="text" name="address" id="address"/></div>
		<br/>
		<div>Blood Group 
		<select name="bloodgroup" id="bloodgroup">
  			<option value="O+">O+</option>
    		<option value="O-">O-</option>
      		<option value="AB+">AB+</option>
        	<option value="AB-">AB-</option>
          	<option value="A+" >A+</option>
            <option value="B+" >B+</option>
            <option value="A-" >A-</option>
            <option value="B-" >B-</option>  
		</select>
		</div>
		<br/>
		<div><input type="image" src="insert.png" value="submit" width="50" height="50"/></div>
		
	</form>
	</div>
	<footer>
  <p>Designed by LGID: AEN101 <br> EmpID: 1437713 <br> Name: Divyanshu Mishra</p>
  <p>Contact information: <a href="divyanshu.m@tcs.com">
 divyanshu.m@tcs.com</a></p>
</footer>
</body>
</html>