<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.time.LocalDate, java.time.LocalTime"%>
<!DOCTYPE html>
<html>

	<body>
	    <%-- Including the resource : background.html --%>
	    
	    <%@ include file = "Background.html" %>
	    
	    <%--Defining some variable and a method --%>
	    <%!
	         int myAge = 25;
	         public String greetMe(String name)
	         {
	        	 return "Welcome " + name;
	         }
	    %>
	    
	    <%-- Displaying my age and greeting message in H1 style  --%>
	    <h1>My Age :  <%=myAge %></h1>
	    
	    <h1>My Age after 50 years : <%=(myAge + 50) %></h1>
	    
	    <h1>Greeting message: <%=greetMe("Jayesh") %></h1>
	    
	    <%--Displaying Hello in H1 style 5 times --%>
	    
	    <%
	         for(int a = 1; a<=5 ; a++){
	                   
	    %>
	    
	        <h1>Hello</h1>
	    <%
	         }
	    %>    
	    
	    <%--Displaying today's date(LocalDate) and current time (LocalTime) java.time  --%>
	    
	    <%
	        LocalDate today = LocalDate.now();
	        LocalTime now  = LocalTime.now();
	    %>
	    
	    <h1>Today's date : <%=today %></h1>
	     <h1>Today's date : <%=now %></h1>
	    
	</body>
	
</html>