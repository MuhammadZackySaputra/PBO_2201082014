/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623;

/**
 *
 * @author TUF GAMING
 */
public class Peminjaman {
    private String kodeAnggota;
    private String namaAnggota;
    private String kodeBuku;
    private String judulBuku;
    private String tanggalPinjam;
    private String tanggalKembali;
    
    
    public Peminjaman (){
    }
    
    public Peminjaman (String kodeAnggota,String namaAnggota, String kodeBuku, String judulBuku, String tanggalPinjam, String tanggalKembali){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;   
    }
    public String getKodeAnggota (){
        return kodeAnggota;
    }
    
    public void setKodeAnggota (String kodeAnggota){
        this.kodeAnggota = kodeAnggota;
    }
    public String getNamaAnggota (){
        return namaAnggota;
    }
    
    public void setNamaAnggota (String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
     public String getKodeBuku (){
        return kodeBuku;
    }
    
    public void setKodeBuku (String kodeBuku){
        this.kodeBuku = kodeBuku;
    }
    public String getJudulBuku (){
        return judulBuku;
    }
    
    public void setJudulBuku (String judulBuku){
        this.judulBuku = judulBuku;
    }
     public String getTanggalPinjam (){
        return tanggalPinjam;
    }
    
    public void setTanggalPinjam (String tanggalPinjam){
        this.tanggalPinjam = tanggalPinjam;
    }
     public String getTanggalKembali (){
        return tanggalKembali;
    }
    
    public void setTanggalKembali (String tanggalKembali){
        this.tanggalKembali = tanggalKembali;
    }
}
