/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zacky200623;

/**
 *
 * @author TUF GAMING
 */
public class Pengembalian {
  private String kodeAnggota;
    private String namaAnggota;
    private String kodeBuku;
    private String judulBuku;
    private String tanggalPinjam;
    private String tanggalKembali;
    private String tanggalDikembalikan;
    private String terlambat;
    private String denda;
    
    
    public Pengembalian (){
    }
    
    public Pengembalian (String kodeAnggota,String namaAnggota, String kodeBuku, String judulBuku, String tanggalPinjam, String tanggalKembali,String tanggalDikembalikan,String terlambat,String denda){
        this.kodeAnggota = kodeAnggota;
        this.namaAnggota = namaAnggota;
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali; 
        this.tanggalDikembalikan = tanggalDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
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
    
      public String getTanggalDikembalikan (){
        return tanggalDikembalikan;
    }
    
    public void setTanggalDikembalikan (String tanggalDikembalikan){
        this.tanggalDikembalikan = tanggalKembali;
    } 
      public String getTerlambat(){
        return terlambat;
    }
    
    public void setTerlambat (String terlambat){
        this.terlambat = terlambat;
    } 
      public String getDenda (){
        return denda;
    }
    
    public void setDenda (String denda){
        this.denda = denda;
    } 
}
