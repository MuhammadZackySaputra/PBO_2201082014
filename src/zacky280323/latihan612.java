/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky280323;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF GAMING
 */
public class latihan612 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter exam1 score:");
        double exam1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter exam2 score:");
        double exam2 = Double.parseDouble(input2);

        String input3 = JOptionPane.showInputDialog("Enter exam3 score:");
        double exam3 = Double.parseDouble(input3);

        double average = (exam1 + exam2 + exam3) / 3.0;

        String message = "Average score: " + average + "\n";

        if (average >= 60.0) {
            message += ":)";
        } else {
            message += ":(";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
