package PraktikumPemdas;
import java.util.Scanner;

public class SotoSate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, pesanan;
        int jumlah, hargaNasi = 0, hargaSoto = 0, hargaSate = 0, total = 0, angkaUnik;

        nama = input.nextLine();
        angkaUnik = input.nextInt();
        jumlah = input.nextInt();

        if (angkaUnik % 2 == 0 || angkaUnik % 3 == 0 || angkaUnik % 5 == 0) {
            System.out.println("PROGRAM KASIR SOTO SATE CL");
            System.out.println("Nama Pemesan : " + nama + "\n");
            System.out.printf("|%-19s |%-15s|%20s|%n", "NAMA PESANAN", "JUMLAH", "HARGA");

            if (angkaUnik % 2 == 0) {
                pesanan = "Nasi";
                hargaNasi = jumlah * 3000;
                System.out.printf("|%-19s |%-15d|%20d|%n", pesanan, jumlah, hargaNasi );
            }

            if (angkaUnik % 3 == 0) {
                pesanan = "Soto";
                hargaSoto = jumlah * 7000;
                System.out.printf("|%-19s |%-15d|%20d|%n", pesanan, jumlah, hargaSoto);
            }

            if (angkaUnik % 5 == 0) {
                pesanan = "Sate";
                hargaSate = jumlah * 5000;
                System.out.printf("|%-19s |%-15d|%20d|%n", pesanan, jumlah, hargaSate);
            }
            System.out.println("");
            total = hargaNasi + hargaSoto + hargaSate;
            System.out.print("Total Pesanan : Rp " + total);
        } else {
            System.out.println("Tidak Ada Pesanan");
            System.exit(0);
        }
    }
    
}
