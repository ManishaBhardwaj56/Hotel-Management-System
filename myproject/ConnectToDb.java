/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Amarjeet
 */
public class ConnectToDb 
{
    static Connection con;
    public static Connection connect()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/student_management";
            String user="root";
            String pass="AMAR76#sharma23";
            con=DriverManager.getConnection(url,user,pass);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return con;
    }
    
}
