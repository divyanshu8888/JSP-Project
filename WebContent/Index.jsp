<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
   background-image:url("download1.jpg");
  background-repeat:no-repeat;
 background-size: 1400px 600px;
   
    }
    h1  {
      color: salmon;
      font-size:30px ;
     	
    }
    img{
     border-radius: 80%;}
    h3{
    color: yellow;
    font-size:20px;
    }
    p  {
      color: white;
    }
  
    #contentinfo{ 
      
  position:absolute;
   top:10px;
   bottom:20px;
   left:20px;   
   margin: 30px;
   color: red; 
}
 #as{ 
    background-color: rgba(100, 76, 76, 0.3) ;
    top:20px;
     position:absolute;
   width:1150px;
   height:180px;
   left:180px;
   margin: auto;
  
}
#menu{ 
    background-color: rgba(100, 76, 76, 0.3) ;
   position:absolute;
   margin: 30px;
   padding-bottom: 20px; 
   text-align: justify;
   width: 400px;
   color: red; 
   top:280px;
   position: center;
}

a:link {
    color: green;
}

a:visited {
    color: yellow;
}


a:hover {
    
    color: red; background: blue;
     font-size: larger;
}


a:active {
    color: yellow;
} 

footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: yellow;
   color: blue;
   text-align: center;
}

   </style>
</head>
<body>
<center><div id="contentinfo"><img src="a.jpg"  height="120px" width="120px"></div>
<div id="as"><h1>Save Life Donor Camp</h1><p>Save Life organization was established in 1990 for the social welfare.</p><p>Organizing blood donation camps is the perfect way to cater to the demand of blood. Everyone wants to contribute towards the society and save lives. You, as a camp organizer, are giving everyone a chance to do so. Organize these camps regularly and bring smiles to many faces</p></div></center>
<hr>

<div id="menu">
<ol>
		<li><h3><a href="insert.jsp">New Blood Donor Registration Form</a></h3></li>
		<li><h3><a href="Read.jsp">View Donor's Profile</a></h3></li>
		<li><h3><a href="update.jsp">Update Donor's Record</a></h3></li>
		<li><h3><a href="delete.jsp">Delete Donor's Record</a></h3></li>
		

</ol>
</div>

<footer>
   <b>Name: Divyanshu Mishra<br>
  Contact information: <a href="divyanshu.mishra8@gmail.com">
 divyanshu.mishra8@gmail.com</a><br>Contact Detail: 8318811781<br></b>
</footer>
</body>
</html>