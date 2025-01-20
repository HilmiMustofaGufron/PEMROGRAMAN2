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
public class update {
    koneksi konek = new koneksi();

    public void Update(String nim, String nama, String alamat, String gender) {
        try {
            konek.jalankanKoneksi();
            java.sql.Statement statement = konek.conn.createStatement();

            String sql_nim = "update identitas set `nim` = '"+ nim +"' where `nim` = '"+ nim +"'";
            String sql_nama = "update identitas set `nama` = '"+ nama +"' where `nim` = '"+ nim +"'";
            String sql_alamat = "update identitas set `alamat` = '"+ alamat +"' where `nim` = '"+ nim +"'";
            String sql_jenis = "update identitas set `gender` = '"+ gender +"' where `nim` = '"+ nim +"'";

            statement.executeUpdate(sql_nim);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);  
            statement.executeUpdate(sql_jenis);

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diedit");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
