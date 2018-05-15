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

@WebServlet(name = "MediAdmission",urlPatterns = "/mediAdmission")
public class MediAdmission extends HttpServlet {
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

            sql = "INSERT INTO MEDICAL_ADMISSION ("
                    +"SSC_GROUP,SSC_GPA,SSC_YEAR,HSC_GROUP,HSC_GPA,HSC_YEAR)"
                    +"VALUES (?, ?, ?, ?, ?, ?) ";

            ps = conn.prepareStatement(sql);



            ps.setString(1, request.getParameter("sgroup"));
            ps.setString(2, request.getParameter("sgpa"));
            ps.setString(3, request.getParameter("syear"));
            ps.setString(4, request.getParameter("hgroup"));
            ps.setString(5, request.getParameter("hgpa"));
            ps.setString(6, request.getParameter("hyear"));


            ps.executeUpdate();

            w.println ("Data has been inserted Successfully");


        }
        catch (Exception e){

            //w.println(e.printStackTrace());
            e.printStackTrace();
        }
    }
}
