/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

/**
 *
 * @author Huawei
 */
public class method {

    int panjang = 5;
    int lebar = 3;
    int L;

    void luas() {
        L = panjang * lebar;
        System.out.println("Luas = " + L);
    }

    int keliling() {
        int K = 2 * (panjang + lebar);

        return K;
    }

    public static void main(String[] args) {
        method m = new method();
        m.luas();
        System.out.println("Keliling = " + m.keliling());
    }
}
