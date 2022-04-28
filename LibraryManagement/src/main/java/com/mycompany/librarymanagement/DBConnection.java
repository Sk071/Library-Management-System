/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shubh
 */
public class DBConnection {

    static String URL = "jdbc:mysql://localhost:3306/library";
    static String user = "shubham";
    static String pass = "12345678";
    static Connection con;

    // Loading driver
    public static Connection getDBcon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");

        try {
            con = DriverManager.getConnection(URL, user, pass);
            System.out.println("Connection Established");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error : " + ex.getMessage());
           // return con;
        }
 return con;
    }

}
