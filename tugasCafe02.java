import java.util.Scanner;
public class tugasCafe02 {

    public static void inputPenjualan(int[][] penjualan, Scanner sc) {
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan penjualan untuk menu " + (i + 1) + " (7 hari):");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    public static void tampilkanPenjualan(int[][] penjualan) {
        System.out.println("\nRekap Penjualan:");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void menuTerlaris(int[][] penjualan) {
        int maxPenjualan = 0;
        int menuTerlaris = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi adalah Menu " + (menuTerlaris + 1) + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualan(int[][] penjualan) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println("Menu " + (i + 1) + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] penjualan = new int[5][7];
        inputPenjualan(penjualan, sc);
        tampilkanPenjualan(penjualan);
        menuTerlaris(penjualan);
        rataRataPenjualan(penjualan);

    
    }
}
