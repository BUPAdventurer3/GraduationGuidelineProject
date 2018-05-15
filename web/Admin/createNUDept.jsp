<%--
  Created by IntelliJ IDEA.
  User: Pabel
  Date: 5/15/2018
  Time: 3:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>National University Department Information</title>
    <style>
        body{
            background-color: green;
            text-align: center;
        }
       .nu {
            font-size: 40px;
            background: yellow;



        }

    </style>
</head>
<body>

<form action="/createNUDeptprofile" method="get" class="nu">
    <h1>National University Department Information</h1>

    Department Name:
    <input type="text" name="nu_department_name">
    <br>
    <br>

    <input type="Submit" name="insert" value="INSERT">
</form>

</body>
</html>
