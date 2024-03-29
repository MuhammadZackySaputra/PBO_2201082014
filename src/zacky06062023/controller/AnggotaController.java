/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky06062023.controller;
import zackyView.*;
import zacky06062023.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author TUF GAMING
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController (FormAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDao();
    }
    
    public void clearForm(){
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
        formAnggota.getCboJenisKelamin().removeAllItems();
        formAnggota.getCboJenisKelamin().addItem("P");
        formAnggota.getCboJenisKelamin().addItem("L");
        
        
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTabelAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAll();
        for (Anggota a : list) {
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.insert(anggota);
        JOptionPane.showMessageDialog(formAnggota,"Insert OK");
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTabelAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.update(index,anggota);
        JOptionPane.showMessageDialog(formAnggota,"Update OK");
    }
    
    public void getAnggota(){
        int index = formAnggota.getTabelAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJenisKelamin().addItem(anggota.getJenisKelamin());
        }
    }
    public void deleteAnggota(){
        int index = formAnggota.getTabelAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota,"Delete OK");
    }
}
