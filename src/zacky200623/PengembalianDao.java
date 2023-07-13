/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623;
import java.util.*;
/**
 *
 * @author TUF GAMING
 */
public class PengembalianDao {
    private List<Pengembalian> data = new ArrayList();
    
    public PengembalianDao(){
       
    }
    
    public void insert(Pengembalian Pengembalian){
        data.add(Pengembalian);
    }
    public void update(int index,Pengembalian Pengembalian){
        data.set(index,  Pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    public List<Pengembalian>getAll(){
        return data;
    }
}
