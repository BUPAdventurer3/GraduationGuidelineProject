<%--
  Created by IntelliJ IDEA.
  User: Al Shariar
  Date: 5/14/2018
  Time: 5:27 PM
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
    h3{
      font-family: "Times New Roman", Times, serif;
    }
  </style>
</head>
<body>

<h3>BD GRADUATION GUIDELINE</h3>

<ul>
  <li><a class="active" href="medical/home.jsp">Home</a></li>
  <li><a href="/medicalList">Medical</a></li>
  <li><a href="/nulist">National</a></li>
  <li><a href="/showUniversity">University</a></li>
  <li style="float:right"><a href="Admin/adminLogin.jsp">Login</a></li>

</ul>


</body>
</html>

</body>
</html>
