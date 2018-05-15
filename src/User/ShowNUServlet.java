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

@WebServlet(name = "ShowNUServlet")
public class ShowNUServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter w=response.getWriter();
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql;
        try{
            conn = myConnection.jdbcConnection.connectionMethod();
            sql="SELECT * FROM NU_GENERAL_INFORMATION";
            ps=conn.prepareStatement(sql);
            rs=ps.executeQuery();

            w.println("<h1> ID"+ "\t\t"+"Student's Name</h1>");
            while(rs.next()) {
                w.print("<h3><pre style:text-align='center'>" + rs.getString(1) + "\n" + rs.getString(2)
                        +"\n"+rs.getString(3)+ "</pre></h3>");

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
