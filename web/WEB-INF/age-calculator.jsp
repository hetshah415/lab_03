<%-- 
    Document   : age-calculator
    Created on : 25 May, 2022, 7:56:38 PM
    Author     : het
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
         <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label> Enter your age: </label> 
            <input type="text" name="age" value="${number}"> <br> <br>
            <input type="submit" name="submit" value="Age next birthday">

               
        </form>   
         <p>
             ${message} ${value} ${error}
         </p>
         <br>
         <a href="Arithmetic">Arithmetic Calculator</a>
    </body>
</html>
