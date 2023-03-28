/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky280323;
import java.util.Scanner;
/**
 *
 * @author TUF GAMING
 */
public class latihan62 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a Number Between 1 and 10 : ");
        int number = scanner.nextInt();
        
        String word;
        if (number == 1){
            word = "one";
        }else if (number == 2){
            word = "two";
        }else if (number == 3){
            word = "three";
        }else if (number == 4){
            word = "four";
        }else if (number == 5){
            word = "five";
        }else if (number == 6){
            word = "six";
        }else if (number == 7){
            word = "seven";
        }else if (number == 8){
            word = "eight";
        }else if (number == 9){
            word = "nine";
        }else if (number == 10){
            word = "ten";
        }  else{
            word = "invalid number";
        }  
        
        System.out.println(word);
    }    
}
