<%--
  Created by IntelliJ IDEA.
  User: Pabel
  Date: 5/15/2018
  Time: 2:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>National University Faculty Information</title>
    <style>
        .faculty_department
        {
            text-align: center;
            background: yellow;
        }
        body{
            background-color: green;
            text-align: center;
        }

    </style>
</head>
<body>
<div class="faculty_department">
<form action="/createNUFacultyprofile" method="get">

        <h1> National University Faculty Information</h1>
        Faculty Name:
        <input type="text" name="nu_faculty_name" >
        <br>
        <br>

        <input type="Submit" name="inset" value="INSERT">



</form>
</div>

</body>
</html>
