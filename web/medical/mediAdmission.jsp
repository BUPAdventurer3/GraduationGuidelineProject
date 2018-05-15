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
<form action="/mediAdmission" method="get" class="medical">

    <h1> Medical_Admission</h1>
    SSC_GROUP:
    <input type="text" name="sgroup">
    <br>
    <br>
    SSC_GPA:
    <input type="text" name="sgpa">
    <br>
    <br>
    SSC_YEAR:
    <input type="text" name="syear">
    <br>
    <br>
    HSC_GROUP:
    <input type="text" name="hgroup">
    <br>
    <br>
    HSC_GPA:
    <input type="text" name="hgpa">
    <br>
    <br>
    HSC_YEAR:
    <input type="text" name="hyear">
    <br>
    <br>
    <input type="submit" value="Insert">

</form>

</body>
</html>
