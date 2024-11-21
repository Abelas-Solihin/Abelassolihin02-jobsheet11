import java.util.Scanner;
public class tugas3 {
        public static void inputNilai(int[][] nilai, Scanner sc) {
            for (int i = 0; i < nilai.length; i++) {
                System.out.println("Masukkan nilai untuk Mahasiswa ke-" + (i + 1) + ":");
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print("Tugas ke-" + (j + 1) + ": ");
                    nilai[i][j] = sc.nextInt();
                }
            }
        }
        public static void tampilkanNilai(int[][] nilai) {
            System.out.println("\nRekap Nilai Mahasiswa:");
            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Mahasiswa ke-" + (i + 1) + ": ");
                for (int j = 0; j < nilai[i].length; j++) {
                    System.out.print(nilai[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void mahasiswaNilaiTertinggi(int[][] nilai) {
            int maxNilai = 0;
            int mahasiswaTerbaik = 0;
    
            for (int i = 0; i < nilai.length; i++) {
                int totalNilai = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    totalNilai += nilai[i][j];
                }
                if (totalNilai > maxNilai) {
                    maxNilai = totalNilai;
                    mahasiswaTerbaik = i;
                }
            }
    
            System.out.println("\nMahasiswa dengan nilai tertinggi adalah Mahasiswa ke-" + (mahasiswaTerbaik + 1) +
                    " dengan total nilai " + maxNilai);
        }
        public static void rataRataNilai(int[][] nilai) {
            System.out.println("\nRata-rata nilai per mahasiswa:");
            for (int i = 0; i < nilai.length; i++) {
                int totalNilai = 0;
                for (int j = 0; j < nilai[i].length; j++) {
                    totalNilai += nilai[i][j];
                }
                double rataRata = (double) totalNilai / nilai[i].length;
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + rataRata);
            }
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan jumlah mahasiswa: ");
            int jumlahMahasiswa = sc.nextInt();
    
            System.out.print("Masukkan jumlah tugas: ");
            int jumlahTugas = sc.nextInt();
            int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];
            inputNilai(nilai, sc);
            tampilkanNilai(nilai);
    
            mahasiswaNilaiTertinggi(nilai);
            rataRataNilai(nilai);
    
            sc.close();
        }
    }
    

