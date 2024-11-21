import java.util.Scanner;
public class hitungTotalHarga02 {
    public static int hitungTotalHarga(int pilihMenu, int banyakItem, String kodePromo){
        int[] hargaItems = {15000, 20000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihMenu- 1] * banyakItem;
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = (int)(hargaTotal * 0.5);  // Diskon 50%
            System.out.println("Berikan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = (int)(hargaTotal * 0.7);  // Diskon 30%
            System.out.println("Berikan diskon 30%");
        } else {
            System.out.println("Kode promo tidak valid");
        }
        return hargaTotal;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMasukkan menu yang ingin Anda pesan");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.next();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda : Rp" + totalHarga);
    }
}