package PraktikumPemdas;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class WarungBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pesanan;
        int jumlahPesanan;
        double hargaPesanan;
        double totalPesanan;

        pesanan = input.nextInt();
        jumlahPesanan = input.nextInt();

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("id", "ID"));
        symbols.setGroupingSeparator('.');
        DecimalFormat df = new DecimalFormat("#,###", symbols);

        switch (pesanan) {
            case 1:
                if (jumlahPesanan >= 2 && jumlahPesanan <= 20) {
                    System.out.println("Nama Pesanan = Nasi Goreng");
                    System.out.println("Jumlah Pesanan = " + jumlahPesanan);
                    hargaPesanan = 20000;
                    System.out.println("Harga Pesanan = " + df.format(hargaPesanan));
                    totalPesanan = (jumlahPesanan * hargaPesanan);
                    System.out.println("Total Pesanan = " + df.format(totalPesanan));
                    break;

                } else if ((jumlahPesanan > 20)) {
                    System.out.println("Nama Pesanan = Nasi Goreng");
                    System.out.println("Jumlah Pesanan = " + jumlahPesanan);
                    hargaPesanan = 20000;
                    System.out.println("Harga Pesanan = " + df.format(hargaPesanan));
                    totalPesanan = (jumlahPesanan * hargaPesanan);
                    double diskon = totalPesanan * 0.2;
                    double totalSetelahDiskon = totalPesanan - diskon;
                    System.out.println("Total Pesanan = " + df.format(totalSetelahDiskon));
                    break;

                } else {
                    System.out.println("Nama Pesanan = Nasi Goreng");
                    System.out.println("Jumlah Pesanan = " + jumlahPesanan);
                    hargaPesanan = 20000;
                    System.out.println("Harga Pesanan = " + df.format(hargaPesanan));
                    totalPesanan = jumlahPesanan * hargaPesanan;
                    System.out.println("Total Pesanan = " + df.format(totalPesanan));
                    System.out.println("belanja lagi dong");
                }
                break;

            case 2:
                if (jumlahPesanan >= 2 && jumlahPesanan <= 20) {
                    System.out.println("Nama Pesanan = Mie Goreng");
                    System.out.println("Jumlah Pesanan = " + jumlahPesanan);
                    hargaPesanan = 30000;
                    System.out.println("Harga Pesanan = " + df.format(hargaPesanan));
                    totalPesanan = jumlahPesanan * hargaPesanan;
                    System.out.println("Total Pesanan = " + df.format(totalPesanan));
                    break;

                } else if ((jumlahPesanan > 20)) {
                    System.out.println("Nama Pesanan = Mie Goreng");
                    System.out.println("Jumlah Pesanan = " + jumlahPesanan);
                    hargaPesanan = 30000;
                    System.out.println("Harga Pesanan = " + df.format(hargaPesanan));
                    totalPesanan = jumlahPesanan * hargaPesanan;
                    double diskon = totalPesanan * 0.2;
                    double totalSetelahDiskon = totalPesanan - diskon;
                    System.out.println("Total Pesanan = " + df.format(totalSetelahDiskon));
                    break;

                } else {
                    System.out.println("Nama Pesanan = Mie Goreng");
                    System.out.println("Jumlah Pesanan = " + jumlahPesanan);
                    hargaPesanan = 30000;
                    System.out.println("Harga Pesanan = " + df.format(hargaPesanan));
                    totalPesanan = jumlahPesanan * hargaPesanan;
                    System.out.println("Total Pesanan = " + df.format(totalPesanan));
                    System.out.println("belanja lagi dong");
                }
                break;

            default:
                System.out.println("Pesanan tidak valid.");
                break;
        }
    }
}
