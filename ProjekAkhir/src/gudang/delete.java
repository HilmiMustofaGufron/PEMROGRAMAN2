/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gudang;

import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class delete {
    Koneksi konek = new Koneksi();

    public void Delete(String idbarang, String namabarang, String brandbarang, String jumlah, String harga) {
        try {
            konek.koneksi();
            java.sql.Statement statement = konek.conn.createStatement();

            String sql = "delete from stok where nim = '" + idbarang + "','" + namabarang + "','" + brandbarang + "','" + jumlah + "','" + harga +"');";

            statement.executeUpdate(sql);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
