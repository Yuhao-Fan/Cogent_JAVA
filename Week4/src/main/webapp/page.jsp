<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.cogent.entity.Persons" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>

<%   
String username=request.getParameter("username");  
out.print("welcome your registration on Going "+username);  

//////

//create Objects of some user defined -- JAVA files 

Persons persons= new Persons();
persons.showimports();
persons.setName(username);
out.print(persons.getName());  

%>  
</h1>


</body>
</html>
