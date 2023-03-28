/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky280323;

/**
 *
 * @author TUF GAMING
 */
public class latihan43 {
    public static void main(String[] args){
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        int max = 0;
        
        max = (number1 > number2) ? number1 : number2;
        max = (max > number3) ? max : number3;
        
        System.out.println("number 1 = "+number1);
        System.out.println("number 2 = "+number2);
        System.out.println("number 3 = "+number3);
        System.out.println("nilai tertingginya adalah angka = "+max);
        
    }
    
}
