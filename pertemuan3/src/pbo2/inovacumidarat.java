/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 *
 * @author Huawei
 */
public class inovacumidarat {

    public static void main(String[] args) {
        mobil inovacumidarat = new mobil();

        inovacumidarat.merkmobil = "Inova Reborn Venturer (Cumi Darat)";
        inovacumidarat.tahunbuat = 2021;
        inovacumidarat.warnamobil = "Hitam";
        inovacumidarat.pemilik1 = "1. Hilmi Mustofa ";
        inovacumidarat.pemilik2 = "2. Muhammad Hafizh ";
        
        System.out.println("Merk mobil      = " + inovacumidarat.merkmobil);
        System.out.println("Warna mobil     = " + inovacumidarat.warnamobil);
        System.out.println("Tahun pembuatan = " + inovacumidarat.tahunbuat);
        System.out.println("Pemilik Mobil   = " + inovacumidarat.pemilik1);
        System.out.println("                  " + inovacumidarat.pemilik2);
        inovacumidarat.mobilberjalan();
        inovacumidarat.mobilberhenti();
    }
}
