/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class delete {
    koneksi konek = new koneksi();

    public void Delete(String nim, String nama, String alamat, String gender) {
        try {
            konek.jalankanKoneksi();
            java.sql.Statement statement = konek.conn.createStatement();

            String sql = "delete from identitas where nim = '" + nim + "','" + nama + "','" + alamat + "','" + gender + "');";

            statement.executeUpdate(sql);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
