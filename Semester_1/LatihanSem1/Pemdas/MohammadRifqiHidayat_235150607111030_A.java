package Pemdas;
import java.util.*;
import java.io.*;
public class MohammadRifqiHidayat_235150607111030_A {
    public static void main(String[] args)  throws IOException {
        // kode soal A
        Scanner input = new Scanner(System.in);
        double rupiah, konversi, nilaiTukar;
        
        System.out.println("Aplikasi konversi rupiah ke dollar1");
        System.out.print("Masukkan nilai rupiah anda : ");
        rupiah = input.nextDouble();

        nilaiTukar = 15371.35;
        konversi = rupiah / nilaiTukar ;

        System.out.println("hasil konversi ke us dollar : " + konversi);
    }
}
