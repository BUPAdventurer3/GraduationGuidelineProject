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

@WebServlet(name = "CreateMedicalServlet", urlPatterns = "/createmedical")
public class CreateMedicalServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter w = response.getWriter();


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql;


        try{

            conn = myConnection.jdbcConnection.connectionMethod();
            w.println("Start");
            sql = "INSERT INTO MEDI_OFFICIAL_INFORMATION ("
                    +"MEDI_ID,FULL_NAME, SHORT_NAME, MEDI_TYPE, ESTABLISHED_DATE, MEDI_LOCATION,"
                    +"DIVISION, MOTTO, CAMPUS_AREA,AUDITORIUM,REGISTER_OFFICE, CONTACT, WEBSITE)"
                    +"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            w.println ("Before");
            ps = conn.prepareStatement(sql);

            w.println("After");

            ps.setString(1, request.getParameter("id"));
            ps.setString(2, request.getParameter("full_name"));
            ps.setString(3, request.getParameter("short_name"));
            ps.setString(4, request.getParameter("type"));
            ps.setString(5, request.getParameter("est_date"));
            ps.setString(6, request.getParameter("location"));
            ps.setString(7, request.getParameter("division"));
            ps.setString(8, request.getParameter("motto"));
            ps.setString(9, request.getParameter("campus_area"));
            ps.setString(10, request.getParameter("auditorium"));
            ps.setString(11, request.getParameter("register_office"));
            ps.setString(12, request.getParameter("contact"));
            ps.setString(13, request.getParameter("website"));

            ps.executeUpdate();

            w.println ("Data has been inserted Successfully");


        }
        catch (Exception e){

            //w.println(e.printStackTrace());
            e.printStackTrace();
        }
    }
}
