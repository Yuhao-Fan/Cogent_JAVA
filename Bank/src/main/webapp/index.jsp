<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form name="loginForm" method="post" action="AddCustomer">
    ID: <input type="text" name="id"/> <br/>
    Name: <input type="text" name="name"/> <br/>
    <input type="submit" value="AddCustomer" />
</form>
</div>
<br>
<div align="center">
<form name=" " method="get" action="ReadCustomer">
    
    <input type="submit" value="ReadCustomer" />
</form>
</div>

<div align="center">
<form name=" " method="post" action="DeleteCustomer">
    Delete Name: <input type="text" name="deletename"/> <br/>
    <input type="submit" value="DeleteCustomer" />
</form>
</div>




</body>
</html>
