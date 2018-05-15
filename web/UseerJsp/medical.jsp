<%--
  Created by IntelliJ IDEA.
  User: Al Shariar
  Date: 5/15/2018
  Time: 4:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            font-size: 28px;
        }

        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
            position: -webkit-sticky; /* Safari */
            position: sticky;
            top: 0;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: #111;
        }

        .active {
            background-color: #4CAF50;
        }
    </style>
</head>
<body>

<div class="header">
    <h2>Scroll Down</h2>
    <p>Scroll down to see the sticky effect.</p>
</div>

<ul>
    <li><a class="active" href="home.jsp">Home</a></li>
    <li><a href="medical.jsp">Mdical</a></li>
    <li><a href="national.jsp">National</a></li>
    <li><a href="university.jsp">University</a></li>
    <li style="float:right"><a href="index.jsp">LogIN</a></li>

</ul>


</body>
</html>

</body>
</html>
