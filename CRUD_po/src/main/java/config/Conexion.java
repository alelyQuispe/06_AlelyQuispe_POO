/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alely
 */
public class Conexion {
    Connection con;
    
    public Conexion() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud?characterEncoding=UTF-8", "root", "admin");
    } catch (Exception e) {
        System.out.println("Error conexion: " + e);
    }
}
    
    public Connection getConnection(){
        return con;
    }
}
