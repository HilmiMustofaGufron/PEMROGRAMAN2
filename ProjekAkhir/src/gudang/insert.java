/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gudang;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class insert {
    String prog;
    Koneksi konek = new Koneksi();

    public void insert(String idbarang, String namabarang, String brandbarang, String jumlah, String harga) {
        try {
            konek.koneksi();
            Statement statement = (Statement) konek.conn.createStatement();

            String sql = "insert into stok values('" + idbarang + "','" + namabarang + "','" + brandbarang + "','" + jumlah + "','" + harga +"');";

            statement.executeUpdate(sql);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
