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
import java.sql.*;
@WebServlet(name = "ShowUniversityServlet", urlPatterns = "/showUniversity")
public class ShowUniversityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Connection conn = myConnection.jdbcConnection.connectionMethod();
        String sql, admin_id, admin_pass;

        PreparedStatement ps = null;
        ResultSet rs = null;

        PrintWriter w = response.getWriter();

        w.println("<html>\n" +
                "<head>\n" +
                "    <title>Title</title>\n" +
                "    <style>\n" +
                "        body{\n" +
                "            background-color: green;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        a{\n" +
                "            font-size: 40px;\n" +
                "            background: yellow;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>");


        String varsity=null;

        try{

            sql = "select Full_name from uni_official_information order by full_name";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            w.println("<select name=varsity>");
            while(rs.next()){

               // w.println("<a href="+rs.getString("full_name") +" name="+rs.getString("full_name") +">"+rs.getString("full_name")+"</a>");
            //w.println("<br><br><br>");

            w.println(" <option>" +rs.getString("full_name")+"</option>");

            //varsity = rs.getString("full_name");
            }
            w.println("</select>");
//
  //          response.sendRedirect("User/detailsUniversityServlet.java");





        }
        catch (Exception e){
            e.printStackTrace();
        }

        w.println("<br><br><br>");
        w.println("<form action=/bup>");
        w.println("<input type=submit value=Show>");
        w.println("</form>");
        w.println("</body>");
        w.println("</html>");

    }
}
