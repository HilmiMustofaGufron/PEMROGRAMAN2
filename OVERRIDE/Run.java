/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OVERRIDE;

/**
 *
 * @author Huawei
 */
public class Run {
    public static void main(String[] args) {
        Hewan H = new Hewan();
        Anjing A = new Anjing();
        Kucing K = new Kucing();
        Serigala S = new Serigala();
        Singa SI = new Singa();
        
        H.tidur();
        A.tidur();
        A.suaraA();
        K.tidur();
        K.suaraK();
        S.tidur();
        S.suaraS();
        SI.tidur();
        SI.suaraSI();
    }
}
