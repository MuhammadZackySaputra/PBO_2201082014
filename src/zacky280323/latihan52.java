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
public class latihan52 {
    public static void main(String[] args){
        String word1 = JOptionPane.showInputDialog("enter word1");
        String word2 = JOptionPane.showInputDialog("enter word2");
        String word3 = JOptionPane.showInputDialog("enter word3");
        
        String message = word1 + "" + word2 + "" + word3;
        
        JOptionPane.showMessageDialog(null,message);
    }
}
