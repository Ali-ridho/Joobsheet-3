package TugasNo4;



public class Peminjam {
    private String ktp;
    private String nama;
    private int limit;
    private int jumlahPinjam;
    private int angsur;

    
     
   

    Peminjam(String ktp ,String nama ,int limit){
        this.ktp = ktp;
        this.nama = nama;
        this.limit = limit;           
    }

    public int getAngsur(){
        return angsur;
    }
    public String getKtp(){
        return ktp;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limit;
    }

    public void pinjam (int pinjam){
        if (pinjam > limit){
            System.out.println("Maaf, jumlah pinjam melebihi limit");
        }
        else{
            jumlahPinjam += pinjam;
        }
    }

    public void angsur(int angsur){
        if (angsur >= 0.1 * jumlahPinjam){
        jumlahPinjam -= angsur;
        }else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

    public int getJumlahPeminjaman(){
        return jumlahPinjam;
    }


   
    

    
}
