/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class TestDb {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/practice";
        String name = "root";
        String pass = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, name, pass);
            String query = "insert into study values(210,4,current_date);";
            PreparedStatement psmt = con.prepareStatement(query);
            int i=psmt.executeUpdate();
            
        if(i>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failuer");
        }
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
