package PraktikumPemdas.SoalUTP;
import java.util.Scanner;
import java.io.*;

public class KopiEnak {
    public static void main(String[] args) throws IOException{

        Scanner i = new Scanner(System.in);
       
        String nama, pesanan = "";
        int jumlahCangkir = 0;
        byte nomorMeja = 0;
        double harga = 0, diskon = 0, totalA = 0, totalB = 0, totalC = 0, totalPesanan = 0;

        nama = i.nextLine();
        nomorMeja = i.nextByte();
        jumlahCangkir = i.nextInt();
        
        if(nomorMeja % 2 == 0 || nomorMeja % 3 == 0 || nomorMeja % 5 == 0){

            System.out.println("Selamat datang di KopiEnak!");
            System.out.printf("Nama Pelanggan : %s \n", nama);
            System.out.printf("Nomor Meja : %d \n", nomorMeja);
            System.out.println("");

            if(jumlahCangkir > 5){
                    System.out.printf("|%-20s|%-10s|%-15s|%-10s|%-15s|\n", "NAMA PESANAN",
                                        "JUMLAH", "HARGA", "DISKON", "SUB TOTAL");
                        if(nomorMeja % 2 == 0){
                            pesanan = "Kopi Hitam";
                            harga = 10; // 10.000
                            diskon = 10.0/100;
                            totalA = (harga - (harga * diskon)) * jumlahCangkir;
                            System.out.printf("|%-20s|%-10d|%s %-12.3f|%-10s|%s %-12.3f|\n", pesanan, jumlahCangkir, "Rp", harga, "10%", "Rp", totalA);
                        }
                        if(nomorMeja % 3 == 0){
                            pesanan = "Cappuccino";
                            harga = 15; // 15.000
                            diskon = 10.0/100;
                            totalB = (harga - (harga * diskon)) * jumlahCangkir;
                            System.out.printf("|%-20s|%-10d|%s %-12.3f|%-10s|%s %-12.3f|\n", pesanan, jumlahCangkir, "Rp", harga, "10%", "Rp", totalB);
                        }
                        if(nomorMeja % 5 == 0){
                            pesanan = "Moccaccino";
                            harga = 20; // 20.000
                            diskon = 10.0/100;
                            totalC = (harga - (harga * diskon)) * jumlahCangkir;
                            System.out.printf("|%-20s|%-10d|%s %-12.3f|%-10s|%s %-12.3f|\n", pesanan, jumlahCangkir, "Rp", harga, "10%", "Rp", totalC);
                        }
            } else{
                    System.out.printf("|%-20s|%-10s|%-15s|%-10s|%-15s|\n", "NAMA PESANAN",
                                    "JUMLAH", "HARGA", "DISKON", "SUB TOTAL");
                        if(nomorMeja % 2 == 0){
                            pesanan = "Kopi Hitam";
                            harga = 10;
                            totalA = harga * jumlahCangkir;
                            System.out.printf("|%-20s|%-10d|%s %-12.3f|%-10s|%s %-12.3f|\n", pesanan, jumlahCangkir, "Rp", harga, "-", "Rp", totalA);
                        }
                        if(nomorMeja % 3 == 0){
                            pesanan = "Cappuccino";
                            harga = 15;
                            totalB = harga * jumlahCangkir;
                            System.out.printf("|%-20s|%-10d|%s %-12.3f|%-10s|%s %-12.3f|\n", pesanan, jumlahCangkir, "Rp", harga, "-", "Rp", totalB);
                        }
                        if(nomorMeja % 5 == 0){
                            pesanan = "Moccaccino";
                            harga = 20;
                            totalC = harga * jumlahCangkir;
                            System.out.printf("|%-20s|%-10d|%s %-12.3f|%-10s|%s %-12.3f|\n", pesanan, jumlahCangkir, "Rp", harga, "-", "Rp", totalC);
                        }
            }
            System.out.println("");
            totalPesanan = totalA + totalB + totalC;
            System.out.printf("Total Pesanan : %s %.3f", "Rp", totalPesanan);
        } else{
                System.out.println("Tidak Ada Pesanan");
        }
    }
}