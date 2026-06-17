<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <%
          Object currentUser = session.getAttribute("loggedInUser");
      %>
      <h1>Hey ! <%=currentUser %></h1>
     <h1 style = "color:green"> Welcome to our Tech Application</h1>
 
</body>
</html>