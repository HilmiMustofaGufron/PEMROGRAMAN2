/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 *
 * @author Huawei
 */
public class player {

    String nama;
    int speed;
    int healtpoint;

    void run() {
        System.out.println(nama + "is running....");
        System.out.println("Speed : " + speed);
    }

    boolean mati() {
        if (healtpoint <= 0) {
            return true;
        }
        return false;
    }
}
