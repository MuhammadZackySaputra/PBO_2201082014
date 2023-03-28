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
public class latihan642 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int angka, pangkat;
        
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();
        
        System.out.print("Masukkan pangkat: ");
        pangkat = input.nextInt();
        
        int hasil = 1;
        int i = 1;
        if (pangkat == 0) {
            hasil = 1;
        } else {
            do {
                hasil *= angka;
                i++;
            } while (i <= pangkat);
        }
        System.out.println("Hasil " + angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}