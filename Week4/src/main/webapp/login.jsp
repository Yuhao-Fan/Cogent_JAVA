<!DOCTYPE html>


<html>
  <head>
    <title>Login Page</title>
  </head>
  <body>
    <h1>Login</h1>
    <form action="success.jsp" method="post">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username"><br><br>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password"><br><br>
      <input type="submit" value="Submit">
    </form>
    <%-- <jsp:include page="jdbc.jsp" />  --%>
    <%-- <jsp:include page="getData.jsp" />  --%>
	<%@ include file="jdbc.jsp" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	    <c:set var="income" scope="session" value="${4000*4}" />
		<c:if test="${income > 8000}">
			<p>
				My income is:
				<c:out value="${income}" />
			<p>
		</c:if>
    


  </body>
</html>
