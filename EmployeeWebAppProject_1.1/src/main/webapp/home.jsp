<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>

    <body>
        <form action="addEmployee">
            <label for="eid">Enter Employee ID: </label>
            <input type="number" name="eid"><br>
            <label for="ename">Enter Employee Name: </label>
            <input type="text" name="ename"><br>
            <label for="edesig">Enter Designation: </label>
            <input type="text" name="edesig"><br>
            <input type="submit">
        </form>
    </body>

    </html>