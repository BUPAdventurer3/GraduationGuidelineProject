<%--
  Created by IntelliJ IDEA.
  User: Al Shariar
  Date: 5/14/2018
  Time: 11:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .body{
            background-color: green;
        }
        .medical{
            text-align: center;
            background: yellow;



        }


    </style>
</head>
<body class="body">

    <form action="/createmedical" method="get" class="medical">



        <h1>Create Medical</h1>
        Medi Id:
        <input type="text" name="id">
        <br>
        <br>
        Medi Full name:
        <input type="text" name="full_name">
        <br>
        <br>
        Medi Short Name:
        <input type="text" name="short_name">
        <br>
        <br>
        Medi   Type:
        <select>
            <option name="type" value="public">Public</option>
            <option name="type" value="private">Private</option>
        </select>
        <br>
        <br>

        Medi  Established Date:
        <input type="text" name="est_date">
        <br>
        <br>
        Medi  Location:
        <input type="text" name="location">
        <br>
        <br>
        Medi  Division:
        <select>
            <option name="division" value="Barishal">Barishal</option>
            <option name="division" value="Chittagong">Chittagong</option>
            <option name="division" value="Dhaka">Dhaka</option>
            <option name="division" value="Khulna">Khulna</option>
            <option name="division" value="Mymenshingh">Mymensingh</option>
            <option name="division" value="Rajshahi">Rajshahi</option>
            <option name="division" value="Rangpur">Rangpur</option>
            <option name="division" value="Sylhet">Sylhet</option>
        </select>
        <br>
        <br>
        Medical  Motto:
        <input type="text" name="motto">
        <br>
        <br>
        Campus area:
        <input type="text" name="campus_area" >
        <br>
        <br>
        Auditorium:
        <input type="text" name="auditorium" >
        <br>
        <br>

        Register Office
        <input type="text" name="register_office" >
        <br>
        <br>


        Medi  Contact Information:
        <input type="text" name="contact">
        <br>
        <br>
        Medi Website:
        <input type="text" name="website">
        <br>
        <br>

        <input type="submit" value="INSERT" name="insert">
    </form>







</body>
</html>
