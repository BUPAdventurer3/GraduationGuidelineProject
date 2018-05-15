package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class test {

    public static void main (String args []){

        Scanner in = new Scanner (System.in);


        Connection conn = myConnection.jdbcConnection.connectionMethod();
        String sql, admin_id, admin_pass, uname, pass;

        System.out.println ("Name:");
        uname = in.nextLine();
        System.out.println ("pass:");
        pass = in.nextLine();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            sql = "SELECT * from uni_official_information";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

           /* admin_id = rs.getString("admin_name");
            admin_pass = rs.getString("admin_pass");*/
           while (rs.next()){

               System.out.println(rs.getInt(1));
               System.out.println(rs.getString(2));
               System.out.println(rs.getString(3));
               System.out.println(rs.getString(4));
               System.out.println(rs.getString(5));
               System.out.println(rs.getString(6));
               System.out.println(rs.getString(7));
               System.out.println(rs.getString(8));

           }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    }


