<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <html>

        <head>
            <title>View Employees</title>
        </head>

        <body>
            <table>
                <thead>
                    <tr>
                        <th>Employee ID</th>
                        <th>Employee Name</th>
                        <th>Employee Designation</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>${emp.eid}</td>
                        <td>${emp.ename}</td>
                        <td>${emp.edesig}</td>
                    </tr>
                </tbody>
            </table>
        </body>

        </html>