<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Registered Students</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 40px;
        }

        h2 {
            color: #333;
        }

        table {
            width: 70%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        th, td {
            border: 1px solid #ddd;
            padding: 12px;
            text-align: center;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #e6f7ff;
        }

        a {
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
            margin: 0 5px;
        }

        a:hover {
            text-decoration: underline;
        }

        .action-links a {
            margin: 0 5px;
        }
    </style>
</head>
<body>
<center>
    <h2>List of Registered Students</h2>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Grade</th>
            <th>Department</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.grade}</td>
                <td>${student.department}</td>
                <td class="action-links">
                    <a href="${pageContext.request.contextPath}/edit/${student.id}">Edit</a>
<a href="${pageContext.request.contextPath}/delete/${student.id}" onclick="return confirm('Are you sure you want to delete this student?');">Delete</a>
                    
                </td>
            </tr>
        </c:forEach>
    </table>

    <br/>
    <a href="home">Back to Home</a>
    <br/>
    <a href="logout">Logout</a>
</center>
</body>
</html>
