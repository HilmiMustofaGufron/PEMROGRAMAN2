/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package INHERITENCE;

/**
 *
 * @author Huawei
 */
public class pocong extends enemy {
    void jump(){
        System.out.println("Loncat-Loncat!");
    }
    @Override
    void attack(){
        System.out.println("Serang Zombie!");
    }
}
