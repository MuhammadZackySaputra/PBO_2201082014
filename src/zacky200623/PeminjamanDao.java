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
public class PeminjamanDao {
    private List<Peminjaman> data = new ArrayList();
    
    public PeminjamanDao(){
       
        
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index,Peminjaman peminjaman){
        data.set(index,  peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman>getAll(){
        return data;
    }
}
