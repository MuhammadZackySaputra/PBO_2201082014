/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky280323;

/**
 *
 * @author TUF GAMING
 */
public class Grade {
    public static void main (String[] args){
        int grade = 92;
        switch(grade){
            case 100 : 
                        System.out.println("Excelent!");
                        break;
            case 90 : 
                        System.out.println("Good Job!");
                        break;
            case 80 : 
                        System.out.println("Study harder!");
                        break;
            default :   System.out.println("sorry, you failed");
                        break;
        }
    }
}
