public class kafe02 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang, " + namaPelanggan);
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Berikan diskon 50%");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Berikan diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }
    }
        public static void main(String[] args){
        Menu("Andi", true, "DISKON50"); 
        Menu("Budi", false, "DISKON30"); 
        Menu("Cici", true, "DISKON20"); 
            System.out.println("===== MENU RESTO KAFE =====");
            System.out.println("1. Kopi Hitam - RP 15,000");
            System.out.println("2. Cappuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");
            System.out.println("============================");
            System.out.println("Silahkan pilih meni yang Anda inginkan.");
        
    }
}
    
