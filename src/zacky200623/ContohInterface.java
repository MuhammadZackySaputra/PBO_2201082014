/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623;

/**
 *
 * @author TUF GAMING
 */
public class ContohInterface {
    public static void main(String[] Args){
        Line line1 = new Line (1,5,2,4);
        Line line2 = new Line (1,3,4,3);
        
        Relation line = new Line();
        System.out.println("Line1 > Line2 "+line.isGreater(line1, line2));
    }
}
