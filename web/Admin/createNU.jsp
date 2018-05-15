<%--
  Created by IntelliJ IDEA.
  User: Pabel
  Date: 5/15/2018
  Time: 12:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>National University General Information</title>
    <style>
        body{
            background-color: green;
        }
        .nu_general_info
        {
            text-align: center;
            background: yellow;
        }
    </style>
</head>
<body>
<div class="nu_general_info">
<form action="/createNUprofile" method="get">
    <center>
    <h1> Create National University General Profile</h1>
    National University  Chancellor:
    <input type="text" name="nu_chancellor" value="President Abdul Hamid">
    <br>
    <br>
    National University  Vice Chancellor:
    <input type="text" name="nu_vc" value="Harun-or-Rashid">
    <br>
    <br>
    National University  Location:
    <input type="text" name="nu_location">
    <br>
    <br>
    National University  Type:
    <select name="nu_type">
        <option value="Public">Public</option>
        <option  value="Private">Private</option>
    </select>
    <br>
    <br>
    National University  Established Date:
    <input type="text" name="nu_est_date" value="1992">
    <br>
    <br>
    National University  Campus Area:
    <input type="text" name="nu_campus" value="2,254 affiliated colleges">
    <br>
    <br>
    National University  Contact:
    <input type="text" name="nu_contact">
    <br>
    <br>
    National University Website:
    <input type="text" name="nu_website">
    <br>
    <br>

    <input type="Submit" value="INSERT" name="insert">


    </center>
</form>
</div>

</body>
</html>
