import java.util.Scanner;
public class PengunjungCafe02 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
    daftarPengunjung("Ali", "Budi", "Citra");
    }
}   