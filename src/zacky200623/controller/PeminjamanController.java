/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623.controller;
import zacky200623View.FromPeminjaman;
import zacky200623.Peminjaman;
import zacky200623.PeminjamanDao;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF GAMING
 */
    
/**
 *
 * @author rizky
 */
public class PeminjamanController {
    private FromPeminjaman fromPeminjaman;
    private Peminjaman Peminjaman;
    private PeminjamanDao peminjamanDao;
    
    public PeminjamanController(FromPeminjaman fromPeminjaman){
        this.fromPeminjaman = fromPeminjaman;
        peminjamanDao = new PeminjamanDao();
        
    }
    public void clearForm(){
        fromPeminjaman.gettxtkodeanggota().setText("");
        fromPeminjaman.gettxtnamaanggota().setText("");
        fromPeminjaman.gettxtkodebuku().setText("");
        fromPeminjaman.gettxtjudulbuku().setText("");
        fromPeminjaman.gettxttanggalpinjam().setText("");
        fromPeminjaman.gettxttanggalkembali().setText("");
       
      
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               fromPeminjaman.gettabelpinjam().getModel();
       tabelModel.setRowCount(0);
       List<Peminjaman> list =peminjamanDao.getAll();
       for (Peminjaman a : list){
        Object [] row ={
            a.getKodeAnggota(),
            a.getNamaAnggota(),
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getTanggalPinjam(),
            a.getTanggalKembali(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void savePeminjaman(){
        Peminjaman = new Peminjaman();
        Peminjaman.setKodeAnggota(fromPeminjaman.gettxtkodeanggota().getText());
        Peminjaman.setNamaAnggota(fromPeminjaman.gettxtnamaanggota().getText());
        Peminjaman.setKodeBuku(fromPeminjaman.gettxtkodebuku().getText());
        Peminjaman.setJudulBuku(fromPeminjaman.gettxtjudulbuku().getText());
        Peminjaman.setTanggalPinjam(fromPeminjaman.gettxttanggalpinjam().getText());
        Peminjaman.setTanggalKembali(fromPeminjaman.gettxttanggalkembali().getText());
       
        peminjamanDao.insert(Peminjaman);
        JOptionPane.showMessageDialog(fromPeminjaman,"insert OK");
        
    }
    
    public void updatePeminjaman(){
        int index = fromPeminjaman.gettabelpinjam().getSelectedRow();
        Peminjaman = peminjamanDao.getPeminjaman(index);
        Peminjaman.setKodeAnggota(fromPeminjaman.gettxtkodeanggota().getText());
        Peminjaman.setNamaAnggota(fromPeminjaman.gettxtnamaanggota().getText());
        Peminjaman.setKodeBuku(fromPeminjaman.gettxtkodebuku().getText());
        Peminjaman.setJudulBuku(fromPeminjaman.gettxtjudulbuku().getText());
        Peminjaman.setTanggalPinjam(fromPeminjaman.gettxttanggalpinjam().getText());
        Peminjaman.setTanggalKembali(fromPeminjaman.gettxttanggalkembali().getText());
        peminjamanDao.update(index, Peminjaman);
        JOptionPane.showMessageDialog(fromPeminjaman,"Update OK");
    }
    
    public void getPeminjaman(){
        int index = fromPeminjaman.gettabelpinjam().getSelectedRow();
        Peminjaman = peminjamanDao.getPeminjaman(index);
        if(Peminjaman!=null){
            fromPeminjaman.gettxtkodeanggota().setText(Peminjaman.getKodeAnggota());
            fromPeminjaman.gettxtnamaanggota().setText(Peminjaman.getNamaAnggota());
            fromPeminjaman.gettxtkodebuku().setText(Peminjaman.getKodeBuku());
            fromPeminjaman.gettxtjudulbuku().setText(Peminjaman.getJudulBuku());
            fromPeminjaman.gettxttanggalpinjam().setText(Peminjaman.getTanggalPinjam());
            fromPeminjaman.gettxttanggalkembali().setText(Peminjaman.getTanggalKembali());
           
            
        }
    }
    
    public void deletePeminjaman(){
        int index = fromPeminjaman.gettabelpinjam().getSelectedRow();
        peminjamanDao.delete(index);
         JOptionPane.showMessageDialog(fromPeminjaman,"Delete OK");  
    }
    
}

