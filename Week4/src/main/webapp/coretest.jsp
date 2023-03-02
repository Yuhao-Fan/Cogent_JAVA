<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<c:set var="income" scope="session" value="${4000*4}" />
	<c:if test="${income > 8000}">
		<p>
			My income is:
			<c:out value="${income}" />
		<p>
	</c:if>
	<c:forEach var="j" begin="1" end="10">  
	   Item <c:out value="${j}"/><p>  
	</c:forEach> 

<%--    
    <c:set var="String" value="welcomejsp"/>  
	  <c:if test="${fn:endsWith(String,'come')}">  
	     <p> End with come <p/>  
	  </c:if>  
	  <c:if test="${fn:endsWith(String,'jsp')}">  
	     <p> End with jsp <p/>  
	  </c:if> --%> 
	      <c:set var="String" value="welcomejsp"/>  
	  <c:if test="${fn:contains(String,'omej')}">  
	     <p> Contains omej <p/>  
	  </c:if>  
	  <c:if test="${fn:contains(String,'omejw')}">  
	     <p> Contains omejw <p/>  
	  </c:if>   
	  

	

</body>
</html>