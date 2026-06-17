<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

     <body>
     
        <%--Retrieving a bean of type person with ID: pers from session scope and fetching its property values --%>

                
           <jsp:useBean id = "pers" class ="example.bean.Person" scope = "session"/>
           
           <h1><jsp:getProperty property="name" name="pers"/></h1>
            <h1><jsp:getProperty property="age" name="pers"/></h1>
            <h1><jsp:getProperty property="weight" name="pers"/></h1>
           
           

     </body>
     
</html>