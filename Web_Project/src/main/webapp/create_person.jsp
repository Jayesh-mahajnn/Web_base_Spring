<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

        <body>
        <%--Instantiating a bean of type person , putting into session scope and setting values for all properties --%>
        
        <jsp:useBean id = "pers" class ="example.bean.Person" scope = "session"/>
        
        <jsp:setProperty property="*" name="pers"/>
        
        <h1>
            Person created . to view details 
            <a href="show_person.jsp">click here</a>
        </h1>

       </body>

</html>