/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INHERITENCE;

/**
 *
 * @author Huawei
 */
public class main {
    public static void main(String[] args) {
        enemy monster = new enemy();
        zombie zombi = new zombie();
        pocong hantu = new pocong();
        burung bur = new burung();
        
        hantu.attack();
        monster.attack();
        zombi.attack();
        bur.attack();
    }
}
