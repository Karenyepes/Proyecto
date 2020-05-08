package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConexionBd {

    public static final String BaseDatos = "Proyecto";
    public static final String URL = "jdbc:mysql://localhost:3306/" + BaseDatos;
    public static final String USERNAME = "root";
    public static final String PASWORD = "karen1909";
    PreparedStatement ps;
    ResultSet res;

    public static Connection getConnection() {
        Connection con = null;
        try {

            con = DriverManager.getConnection(URL, USERNAME, PASWORD);
          //  JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
    