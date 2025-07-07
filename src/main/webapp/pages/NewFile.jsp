<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Information</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 40px;
        }

        h2 {
            color: #333;
        }

        form {
            background-color: #fff;
            padding: 25px;
            border-radius: 8px;
            width: 300px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        label {
            font-weight: bold;
        }

        input[type="text"], input[type="submit"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        a {
            display: inline-block;
            margin-top: 15px;
            text-decoration: none;
            color: #4CAF50;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<center>
    <h2>Register Student</h2>
    <form action="submit" method="post">
        
        <label>Name:</label><br/>
        <input type="text" name="name" required/><br/><br/>

        <label>Grade:</label><br/>
        <input type="text" name="grade" required/><br/><br/>
        
        <label>Department:</label><br>
        <input type="text" name="department" required/><br/>

        <input type="submit" value="Submit"/>
    </form>

    <br/>
    <a href="view">View All Students</a>
</center>
</body>
</html>