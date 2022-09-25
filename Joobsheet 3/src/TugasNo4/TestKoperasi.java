package TugasNo4;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

       Peminjam donny = new Peminjam("111333444", "Donny",  5000000);

       System.out.println("Nama Anggota: " +donny.getNama());
       System.out.println("Limit Pinjaman: " +donny.getLimitPinjaman());

        System.out.println("Masukan Jumlah Pinjaman :");
        int pinjam = input.nextInt();
        donny.pinjam(pinjam);
        

       System.out.println("Jumlah Pinjaman Saat ini " +donny.getJumlahPeminjaman());

       System.out.println("Jumlah Pinjaman Saat ini " +donny.getJumlahPeminjaman());

       System.out.println("\nMembayar angsuran :"); 
        int angsur = input.nextInt();
        donny.angsur(angsur);
       System.out.println("Jumlah Pinjaman Saat ini " +donny.getJumlahPeminjaman()); 

    }
   
    
}