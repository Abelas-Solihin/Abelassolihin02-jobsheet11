import java.util.Scanner;
public class PengunjungCafe02 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
    daftarPengunjung("Ali", "Budi", "Citra");
    }
}   