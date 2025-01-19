/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 *
 * @author Huawei
 */
public class game {

    public static void main(String[] args) {
        player petani = new player();

        petani.nama = "Hilmi Mustf";
        petani.speed = 173;
        petani.healtpoint = 0;

        petani.run();

        if (petani.mati()) {
            System.out.println("Game Over!");
        }
    }
}
