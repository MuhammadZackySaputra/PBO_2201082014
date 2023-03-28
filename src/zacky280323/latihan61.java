/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky280323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author TUF GAMING
 */
public class latihan61 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter exam1 score: ");
        double exam1 = Double.parseDouble(reader.readLine());

        System.out.print("Enter exam2 score: ");
        double exam2 = Double.parseDouble(reader.readLine());

        System.out.print("Enter exam3 score: ");
        double exam3 = Double.parseDouble(reader.readLine());

        double average = (exam1 + exam2 + exam3) / 3.0;

        System.out.println("Average score: " + average);

        if (average >= 60.0) {
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
    }
}
