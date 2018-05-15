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

@WebServlet(name = "CreateNUServlet",urlPatterns = "/createNUprofile")
public class CreateNUServlet extends HttpServlet {
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
            sql = "INSERT INTO NU_GENERAL_INFORMATION ("
                    +"NU_CHANCELLOR , NU_VC , NU_LOCATION , NU_TYPE , NU_ESTABLISHED_DATE , NU_CAMPUS_AREA ,"
                    +"NU_CONTACT , NU_WEBSITE )"
                    +"VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
            w.println ("Before");
            ps = conn.prepareStatement(sql);

            w.println("After");

            ps.setString(1, request.getParameter("nu_chancellor"));
            ps.setString(2, request.getParameter("nu_vc"));
            ps.setString(3, request.getParameter("nu_location"));
            ps.setString(4, request.getParameter("nu_type"));
            ps.setString(5, request.getParameter("nu_est_date"));
            ps.setString(6, request.getParameter("nu_campus"));
            ps.setString(7, request.getParameter("nu_contact"));
            ps.setString(8, request.getParameter("nu_website"));

            ps.executeUpdate();

            w.println ("Data has been inserted Successfully");


        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
