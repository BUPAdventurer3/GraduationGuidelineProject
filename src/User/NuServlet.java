package User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "NuServlet",urlPatterns = "/nulist")
public class NuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter w = response.getWriter();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;


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

            w.println ("</tr>");

            conn = myConnection.jdbcConnection.connectionMethod();
            sql = "SELECT * from nu_general_information";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next())
            {
                w.println("<tr>");
                w.println("<td>"+rs.getString(1) +"</td>");
                w.println("<td>"+rs.getString(2) +"</td>");
                w.println("<td>"+rs.getString(3) +"</td>");
                w.println("<td>"+rs.getString(4) +"</td>");
                w.println("<td>"+rs.getString(5) +"</td>");
                w.println("<td>"+rs.getString(6) +"</td>");
                w.println("<td>"+rs.getString(7) +"</td>");
                w.println("<td>"+rs.getString(8) +"</td>");


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
