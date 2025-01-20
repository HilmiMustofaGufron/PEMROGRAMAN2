/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gudang;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Huawei
 */
public class update {
    Koneksi konek = new Koneksi();

    public void Update(String idbarang, String namabarang, String brandbarang, String jumlah, String harga) {
        try {
            konek.koneksi();
            java.sql.Statement statement = konek.conn.createStatement();

            String sql_idbarang = "update stok set `idbarang` = '"+ idbarang +"' where `idbarang` = '"+ idbarang +"'";
            String sql_namabarang = "update stok set `namabarang` = '"+ namabarang +"' where `idbarang` = '"+ idbarang +"'";
            String sql_brandbarang = "update stok set `brandbarang` = '"+ brandbarang +"' where `idbarang` = '"+ idbarang +"'";
            String sql_jumlah = "update stok set `jumlah` = '"+ jumlah +"' where `idbarang` = '"+ idbarang +"'";
            String sql_harga = "update stok set `harga` = '"+ harga +"' where `idbarang` = '"+ idbarang +"'";

            statement.executeUpdate(sql_idbarang);
            statement.executeUpdate(sql_namabarang);
            statement.executeUpdate(sql_brandbarang);  
            statement.executeUpdate(sql_jumlah);
            statement.executeUpdate(sql_harga);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diedit");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    
}
