package User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "bupServlet", urlPatterns = "/bup")
public class bupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter w = response.getWriter();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;

/*
        try {

            conn = myConnection.jdbcConnection.connectionMethod();

            sql = "select * from uni_official_information";
            ps = conn.prepareStatement(sql);

            w.println ("<head>");
            w.println ("<title> Displaying from Database </title>");
            w.println ("<style>");
            w.println ("body {background-color:red}");
            w.println ("caption, table, th, td { ");
            w.println ("border:2px solid black;");
            w.println ("border-collapse:collapse;");
            w.println ("color:white;");
            w.println ("font-family:courier new;");
            w.println ("font-size:120%; }");
            w.println ("</style>");
            w.println ("</head>");
            w.println ("<body>");
            w.println ("<hr>");
            w.println ("<table align=center>");
            //w.println ("<caption> Student Record: </caption>");
            w.println ("<tr>");
            w.println ("<th>Uni Id</th>\n" +
                    "        <th>Full Name</th>\n" +
                    "        <th>Short Name</th>\n" +
                    "        <th>Uni type</th>\n" +
                    "        <th>Uni category</th>\n" +
                    "        <th>Established date</th>\n" +
                    "        <th>Uni location</th>\n" +
                    "        <th>Division</th>\n" +
                    "        <th>Motto</th>\n" +
                    "        <th>Chancellor</th>\n" +
                    "        <th>VC</th>\n" +
                    "        <th>Campus area</th>\n" +
                    "        <th>Contact</th>\n" +
                    "        <th>Website</th>");
            w.println("</tr>");

            while (rs.next()){


                w.println ("<tr>");
                w.println ("<td>" +rs.getInt("UNI_ID") +"</td>");
                w.println ("<td>" +rs.getString("FULL_NAME") +"</td>");
                w.println ("<td>" +rs.getString("SHORT_NAME") +"</td>");
                w.println ("<td>" +rs.getString("UNI_TYPE") +"</td>");
                w.println ("<td>" +rs.getString("UNI_CATEGORY") +"</td>");
                w.println ("<td>" +rs.getString("ESTABLISHED_DATE") +"</td>");
                w.println ("<td>" +rs.getString("UNI_LOCATION") +"</td>");
                w.println ("<td>" +rs.getString("DIVISION") +"</td>");
                w.println ("<td>" +rs.getString("MOTTO") +"</td>");
                w.println ("<td>" +rs.getString("CHANCELLOR") +"</td>");
                w.println ("<td>" +rs.getString("VC") +"</td>");
                w.println ("<td>" +rs.getString("CAMPUS_AREA") +"</td>");
                w.println ("<td>" +rs.getString("CONTACT") +"</td>");
                w.println ("<td>" +rs.getString("WEBSITE") +"</td>");
                //w.println ("<td>" +rs.getString(15) +"</td>");

                w.println ("</tr>");

            }

            w.println ("</table>");

            w.println("DOFJDL");
            w.println ("<hr>");
            w.println ("</body>");
            w.println("</html>");

        }
        */



try{

    w.println ("<head>");
    w.println ("<title> Displaying from Database </title>");
    w.println ("<style>");
    w.println ("body {background-color:red}");
    w.println ("caption, table, th, td { ");
    w.println ("border:2px solid black;");
    w.println ("border-collapse:collapse;");
    w.println ("color:white;");
    w.println ("font-family:courier new;");
    w.println ("font-size:120%; }");
    w.println ("</style>");
    w.println ("</head>");
    w.println ("<body>");
    w.println ("<hr>");
    w.println ("<table align=center>");
    w.println ("<caption> University Profile: </caption>");
    w.println ("<tr>");
    w.println ("<th> Uni_ID </th>");
    w.println ("<th> Full_Name </th>");
    w.println ("<th> Short_Name </th>");
    w.println ("<th> University_Type </th>");
    w.println ("<th> University_Category </th>");
    w.println ("<th> Established_Date </th>");
    w.println ("<th> Location </th>");
    w.println ("<th> Division </th>");
    w.println ("<th> Motto </th>");
    w.println ("<th> Chancellor </th>");
    w.println ("<th> Vice Chancellor </th>");
    w.println ("<th> Campus Area </th>");
    w.println ("<th> Contact </th>");
    w.println ("<th> Website </th>");
    w.println ("</tr>");

    conn = myConnection.jdbcConnection.connectionMethod();
    sql = "SELECT * from uni_official_information";
    ps = conn.prepareStatement(sql);
    rs = ps.executeQuery();

    while(rs.next())
    {
        w.println("<tr>");
        w.println("<td>"+rs.getInt(1) +"</td>");
        w.println("<td>"+rs.getString(2) +"</td>");
        w.println("<td>"+rs.getString(3) +"</td>");
        w.println("<td>"+rs.getString(4) +"</td>");
        w.println("<td>"+rs.getString(5) +"</td>");
        w.println("<td>"+rs.getString(6) +"</td>");
        w.println("<td>"+rs.getString(7) +"</td>");
        w.println("<td>"+rs.getString(8) +"</td>");
        w.println("<td>"+rs.getString(9) +"</td>");
        w.println("<td>"+rs.getString(10) +"</td>");
        w.println("<td>"+rs.getString(11) +"</td>");
        w.println("<td>"+rs.getString(12) +"</td>");
        w.println("<td>"+rs.getString(13) +"</td>");
        w.println("<td>"+rs.getString(14) +"</td>");

        w.println("</tr>");
    }

    w.println ("</table>");
    w.println ("<hr>");
    w.println ("</body>");
}




        catch (Exception e){
            e.printStackTrace();
        }
    }
}
