<%-- 
    Document   : arithmaticCalculator
    Created on : Sep 24, 2020, 9:18:55 PM
    Author     : 843327
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
       
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
        <label>First: </label>
        <input type="text" name="first_entry" value="${first}">
        <br>
        <label>Second: </label>
        <input type="text" name="second_entry" value="${second}">
        <br>
        
        <input type="submit" name="selected" value="add" >
        <input type="submit" name="selected" value="sub" >
        <input type="submit" name="selected" value="multi">
        <input type="submit" name="selected" value="div" >
       
        <p>Result: ${message}</p>
        <a href="age"> Age Calculator</a>
        </form>
    </body>
</html>
