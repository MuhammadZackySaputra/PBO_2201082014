/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky040423;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author TUF GAMING
 */
public class latihan772 {        
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] angka = new int[10];
        
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Input Nilai ke---> " + (i+1) + ":");
            angka[i] = Integer.parseInt(input);
        }
        
        int max = angka[0];
        for (int i = 1; i < 10; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        
        JOptionPane.showMessageDialog(null, "Nomor terbesar yang dimasukkan adalah " + max);
    }
}

