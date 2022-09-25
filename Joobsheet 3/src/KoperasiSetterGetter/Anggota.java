package KoperasiSetterGetter;

public class Anggota {
    private String nama ;
    private String alamat;
    private float simpanan;

    Anggota (String nama, String Alamat){
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    //setter,getter,nama dan alamat
    
    public void setNama(String nama){
        this.nama = nama;

    }
    public void setAlamat(String alamat){
        this.alamat = alamat;

    }
    public String getNama(){
        return nama;
    }
    public String GetAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return simpanan;
    }
    public void setor  (float uang){
        simpanan += uang;

    }
    public void pinjam(float uang){
        simpanan = uang;
    }
    
}
