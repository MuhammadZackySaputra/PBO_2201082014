/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623.controller;
import zacky200623View.FromPengembalian;
import zacky200623.Pengembalian;
import zacky200623.PengembalianDao;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF GAMING
 */
public class PengembalianController {
     private FromPengembalian fromPengembalian;
    private Pengembalian Pengembalian;
    private PengembalianDao pengembalianDao;
    
    public PengembalianController(FromPengembalian fromPengembalian){
        this.fromPengembalian = fromPengembalian;
        pengembalianDao = new PengembalianDao();
        
    }
    public void clearForm(){
        fromPengembalian.gettxtkodeanggota().setText("");
        fromPengembalian.gettxtnamaanggota().setText("");
        fromPengembalian.gettxtkodebuku().setText("");
        fromPengembalian.gettxtjudulbuku().setText("");
        fromPengembalian.gettxttanggalpinjam().setText("");
        fromPengembalian.gettxttanggalkembali().setText("");
        fromPengembalian.gettxtdikembalikan().setText("");
        fromPengembalian.gettxttelat().setText("");
        fromPengembalian.gettxtdenda().setText("");
       
      
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               fromPengembalian.gettabelkembali().getModel();
       tabelModel.setRowCount(0);
       List<Pengembalian> list =pengembalianDao.getAll();
       for (Pengembalian a : list){
        Object [] row ={
            a.getKodeAnggota(),
            a.getNamaAnggota(),
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getTanggalPinjam(),
            a.getTanggalKembali(),
            a.getTanggalDikembalikan(),
            a.getTerlambat(),
            a.getDenda(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void savePengembalian(){
        Pengembalian = new Pengembalian();
        Pengembalian.setKodeAnggota(fromPengembalian.gettxtkodeanggota().getText());
        Pengembalian.setNamaAnggota(fromPengembalian.gettxtnamaanggota().getText());
        Pengembalian.setKodeBuku(fromPengembalian.gettxtkodebuku().getText());
        Pengembalian.setJudulBuku(fromPengembalian.gettxtjudulbuku().getText());
        Pengembalian.setTanggalPinjam(fromPengembalian.gettxttanggalpinjam().getText());
        Pengembalian.setTanggalKembali(fromPengembalian.gettxttanggalkembali().getText());
        Pengembalian.setTanggalDikembalikan(fromPengembalian.gettxtdikembalikan().getText());
        Pengembalian.setTerlambat(fromPengembalian.gettxttelat().getText());
        Pengembalian.setDenda(fromPengembalian.gettxtdenda().getText());
       
        pengembalianDao.insert(Pengembalian);
        JOptionPane.showMessageDialog(fromPengembalian,"insert OK");
        
    }
    
    public void updatepengembalian(){
        int index = fromPengembalian.gettabelkembali().getSelectedRow();
        Pengembalian = pengembalianDao.getPengembalian(index);
        Pengembalian.setKodeAnggota(fromPengembalian.gettxtkodeanggota().getText());
        Pengembalian.setNamaAnggota(fromPengembalian.gettxtnamaanggota().getText());
        Pengembalian.setKodeBuku(fromPengembalian.gettxtkodebuku().getText());
        Pengembalian.setJudulBuku(fromPengembalian.gettxtjudulbuku().getText());
        Pengembalian.setTanggalPinjam(fromPengembalian.gettxttanggalpinjam().getText());
        Pengembalian.setTanggalKembali(fromPengembalian.gettxttanggalkembali().getText());
        Pengembalian.setTanggalDikembalikan(fromPengembalian.gettxtdikembalikan().getText());
        Pengembalian.setTerlambat(fromPengembalian.gettxttelat().getText());
        Pengembalian.setDenda(fromPengembalian.gettxtdenda().getText());
        pengembalianDao.update(index, Pengembalian);
        JOptionPane.showMessageDialog(fromPengembalian,"Update OK");
    }
    
    public void getPengembalian(){
        int index = fromPengembalian.gettabelkembali().getSelectedRow();
        Pengembalian = pengembalianDao.getPengembalian(index);
        if(Pengembalian!=null){
            fromPengembalian.gettxtkodeanggota().setText(Pengembalian.getKodeAnggota());
            fromPengembalian.gettxtnamaanggota().setText(Pengembalian.getNamaAnggota());
            fromPengembalian.gettxtkodebuku().setText(Pengembalian.getKodeBuku());
            fromPengembalian.gettxtjudulbuku().setText(Pengembalian.getJudulBuku());
            fromPengembalian.gettxttanggalpinjam().setText(Pengembalian.getTanggalPinjam());
            fromPengembalian.gettxttanggalkembali().setText(Pengembalian.getTanggalKembali());
            fromPengembalian.gettxtdikembalikan().setText(Pengembalian.getTanggalDikembalikan());
            fromPengembalian.gettxttanggalkembali().setText(Pengembalian.getTerlambat());
            fromPengembalian.gettxttanggalkembali().setText(Pengembalian.getDenda());
           
            
        }
    }
    
    public void deletePengembalian(){
        int index = fromPengembalian.gettabelkembali().getSelectedRow();
        pengembalianDao.delete(index);
         JOptionPane.showMessageDialog(fromPengembalian,"Delete OK");  
    }
    
}
