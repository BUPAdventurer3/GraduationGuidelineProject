package Admin;

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

@WebServlet(name = "CreateNUFacultyServlet",urlPatterns = "/createNUFacultyprofile")
public class CreateNUFacultyServlet extends HttpServlet {
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
            w.println("Start");
            sql = "INSERT INTO NU_FACULTY (NU_FACULTY_NAME )"
                    +"VALUES (?) ";
            w.println ("Before");
            ps = conn.prepareStatement(sql);

            w.println("After");

            ps.setString(1, request.getParameter("nu_faculty_name"));

            ps.executeUpdate();

            w.println ("Data has been inserted Successfully");



        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
