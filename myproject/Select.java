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
public class Select
{
    public static ResultSet getData(String query)
    {
        ResultSet set=null;
        try
        {
            Connection con=ConnectToDb.connect();
            PreparedStatement p=con.prepareStatement(query);
            set=p.executeQuery();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return set;
    }
}
