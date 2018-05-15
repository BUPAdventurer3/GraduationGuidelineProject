<%--
  Created by IntelliJ IDEA.
  User: Al Shariar
  Date: 5/15/2018
  Time: 3:58 AM
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
<form action="/mediExamDurationServlet" method="get" class="medical">
    <h1> Medi_Exam_Duration_Servlet</h1>
    Exam date:
    <input type="text" name="examdate">
    <br>
    <br>
    Exam Duration:
    <input type="text" name="examduration">
    <br>
    <br>
    Prospectus:
    <input type="text" name="prospectus">
    <br>
    <br>

    <input type="submit" value="Insert">
</form>
</body>
</html>
