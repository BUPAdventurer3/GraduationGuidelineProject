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

@WebServlet(name = "MediAcademicCurriculumnServlet", urlPatterns = "/mediAcademicCurriculumnServlet")
public class MediAcademicCurriculumnServlet extends HttpServlet {
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
            sql = "INSERT INTO MEDI_ACADEMIC_CURRICULUMN("
                    +"PROF,COURSES"
                    +"VALUES (?, ?) ";
            w.println ("Before");
            ps = conn.prepareStatement(sql);

            w.println("After");

            ps.setString(1, request.getParameter("prof"));
            ps.setString(2, request.getParameter("courses"));

            ps.executeUpdate();

            w.println ("Data has been inserted Successfully");


        }
        catch (Exception e){

            //w.println(e.printStackTrace());
            e.printStackTrace();
        }
    }
}
