<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
  color: green;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body href="style.css">
    <%-- Retrieve the username and password from the request object --%>
    <% String username = request.getParameter("username"); %>
    <% String password = request.getParameter("password"); %>

    <%-- Display the username and password using the out object --%>
    <% if (username != null && password != null) { %>
      <% out.print(username+", we got your infomation!"); %>
      <p>Username: <%= username %></p>
      <p>Password: <%= password %></p>
    <% } else { %>
      <p>Please enter your username and password.</p>
    <% } %>
</body>
</html>