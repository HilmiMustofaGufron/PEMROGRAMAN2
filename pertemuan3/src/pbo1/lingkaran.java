/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author Huawei
 */
public class lingkaran {

    public static void main(String[] args) {
        rumus L = new rumus();

        L.phi = 3.14;
        L.jari2 = 20;

        L.luas = L.phi * (L.jari2 * L.jari2);

        System.out.println("Phi             = " + L.phi);
        System.out.println("Jari-Jari       = " + L.jari2);
        System.out.println("Luas            = " + L.luas);
    }
}
