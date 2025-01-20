/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Huawei
 */
public class koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    String statuskoneksi = "";
    
    /*public static void main(String[] args) {
        try{
            //register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            //buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //buat objek statement
            stmt = (Statement) conn.createStatement();
            JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
            
            stmt.close();
            conn.close();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Koneksi Karena " + e);    
        }

    }
}*/
   public String jalankanKoneksi(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            statuskoneksi = "Koneksi JDBC Berhasil";
    } catch (Exception e){
    statuskoneksi = "Gagal Koneksi Karena " + e;
    }
        return statuskoneksi;
    }
}
