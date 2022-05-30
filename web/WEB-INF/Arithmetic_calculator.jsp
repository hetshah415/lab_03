<%-- 
    Document   : Arithmetic_calculator
    Created on : 25 May, 2022, 9:40:07 PM
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
        <h1>Arithmetic calculator</h1>
        <form method="post" action="Arithmetic">
            <label> First:  </label> 
            <input type="text" name="first" value="">
            <label> Second:  </label> 
            <input type="text" name="second" value="">
            <br>
            <br>
             <input type="submit" class="Maths" name="+" value="+" style="height:20px; width: 20px">
             <input type="submit" class="Maths"  name="-" value="-" style="height:20px; width: 20px">
             <input type="submit" class="Maths"  name="*" value="*" style="height:20px; width: 20px">
             <input type="submit" class="Maths"  name="/" value="/" style="height:20px; width: 20px">
        </form>
            <p>
                Result--${Result}${Message}
            </p>
            
            <a href="age">Age Calculator</a>
    </body>
</html>
