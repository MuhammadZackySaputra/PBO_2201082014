/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623.controller;
import zacky200623View.FromBuku;
import zacky200623.BukuDao;
import zacky200623.Buku;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF GAMING
 */
public class BukuController {
     private FromBuku fromBuku;
    private Buku buku;
    private BukuDao BukuDao;
    
    public BukuController(FromBuku fromBuku){
        this.fromBuku = fromBuku;
        BukuDao = new BukuDao();
        
    }
    public void clearForm(){
        fromBuku.gettxtkode().setText("");
        fromBuku.gettxtjudul().setText("");
        fromBuku.gettxtpengarang().setText("");
        fromBuku.gettxtpenerbit().setText("");
        
        
      
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               fromBuku.gettabelbuku().getModel();
       tabelModel.setRowCount(0);
       List<Buku> list =BukuDao.getAll();
       for (Buku a : list){
        Object [] row ={
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getPengarang(),
            a.getPenerbit(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(fromBuku.gettxtkode().getText());
        buku.setJudulBuku(fromBuku.gettxtjudul().getText());
        buku.setPengarang(fromBuku.gettxtpengarang().getText());
        buku.setPenerbit(fromBuku.gettxtpenerbit().getText());
       
        BukuDao.insert(buku);
        JOptionPane.showMessageDialog(fromBuku,"insert OK");
        
    }
    
    public void updateBuku(){
        int index = fromBuku.gettabelbuku().getSelectedRow();
        buku = BukuDao.getBuku(index);
        buku.setKodeBuku(fromBuku.gettxtkode().getText());
        buku.setJudulBuku(fromBuku.gettxtjudul().getText());
        buku.setPengarang(fromBuku.gettxtpengarang().getText());
        buku.setPenerbit(fromBuku.gettxtpenerbit().getText());
       
        BukuDao.update(index, buku);
        JOptionPane.showMessageDialog(fromBuku,"Update OK");
    }
    
    public void getBuku(){
        int index = fromBuku.gettabelbuku().getSelectedRow();
        buku = BukuDao.getBuku(index);
        if(buku!=null){
            fromBuku.gettxtkode().setText(buku.getKodeBuku());
            fromBuku.gettxtjudul().setText(buku.getJudulBuku());
            fromBuku.gettxtpengarang().setText(buku.getPengarang());
            fromBuku.gettxtpenerbit().setText(buku.getPenerbit());
            
        }
    }
    
    public void deleteBuku(){
        int index = fromBuku.gettabelbuku().getSelectedRow();
        BukuDao.delete(index);
         JOptionPane.showMessageDialog(fromBuku,"Delete OK");  
    }
    
}
