<%--
  Created by IntelliJ IDEA.
  User: Al Shariar
  Date: 5/15/2018
  Time: 3:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-color: green;
        }
        .medical{
            text-align: center;
            background: yellow;



        }


    </style>
</head>
<body>
<form action="/mediAcademicCurriculumnServlet" method="get" class="medical">

    <h1> Medical_Academic_Curriculumn</h1>
    PROF:
    <input type="text" name="prof">
    <br>
    <br>
    COURSES:
    <input type="text" name="courses">
    <br>
    <br>

    <input type="submit" value="Insert">

</form>
</body>
</html>
