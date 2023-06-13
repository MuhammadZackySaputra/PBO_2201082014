/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF GAMING
 */
public class latiha82 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <number1> <number2>");
            return;
        }

        // mengambil dua bilangan dari argumen baris perintah
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // melakukan operasi aritmatika
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        // mencetak hasil operasi aritmatika
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = " + product);
        System.out.println("quotient = " + quotient);
    }
}

