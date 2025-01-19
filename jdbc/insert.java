/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class insert {

    String prog;
    koneksi konek = new koneksi();

    public void insert(String nim, String nama, String alamat, String gender) {
        try {
            konek.jalankanKoneksi();
            Statement statement = konek.conn.createStatement();

            String sql = "insert into identitas values('" + nim + "','" + nama + "','" + alamat + "','" + gender + "');";

            statement.executeUpdate(sql);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

}
