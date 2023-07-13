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
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku ("112","banci blagu","annisa","dini"));
        data.add(new Buku("113","kancil","dini","Annisa"));
        
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku>getAll(){
        return data;
    }
}
