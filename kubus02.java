import java.util.Scanner;
public class kubus02 {
public static int hitungVolume(int sisi) {
    return sisi * sisi * sisi;
}
public static int hitungLuasPermukaan(int sisi) {
    return 6 * (sisi * sisi);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi kubus: ");
    int sisi = sc.nextInt();
    int volume = hitungVolume(sisi);
    int luasPermukaan = hitungLuasPermukaan(sisi);
    System.out.println("Panjang sisi kubus: " + sisi);
    System.out.println("Volume kubus: " + volume);
    System.out.println("Luas permukaan kubus: " + luasPermukaan);

    sc.close();
}
}