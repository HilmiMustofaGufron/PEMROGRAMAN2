/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

/**
 *
 * @author Huawei
 */
public class statik {
    public static void luas(int panjang, int lebar) {
        int L = panjang * lebar;
        System.out.println("Luas = " + L);
    }

public static int keliling(int panjang, int lebar) {
        int K = 2 * (panjang + lebar);

        return K;
    }

    public static void main(String[] args) {
        luas(10,3);
        luas(20,7);
        System.out.println("Keliling = " + keliling(10,3));
        System.out.println("Keliling = " + keliling(20,7));
    }
}
