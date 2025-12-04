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
public class InUpDel 
{
    public static void setData(String query,String msg)
    {
        try
        {
            Connection con=ConnectToDb.connect();
            PreparedStatement p=con.prepareStatement(query);
            int r=p.executeUpdate();
            if(r>0 && !msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
