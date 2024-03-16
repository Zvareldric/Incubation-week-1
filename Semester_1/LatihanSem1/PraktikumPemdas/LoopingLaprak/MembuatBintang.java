package PraktikumPemdas.LoopingLaprak;

import java.util.Scanner;

public class MembuatBintang{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Dimulai dari user menginput n untuk menentukan jumlah baris yang diinginkan.
         */
        int n = in.nextInt();
        
        /*
         * Looping di bawah ini untuk mengatur jumlah baris pada segitiga.
         */
        for (int baris = 0; baris <= n; baris++) {
            /*
             * Looping pertama (spasi) digunakan untuk mencetak spasi sebelum karakter bintang
             * pada setiap baris. Jumlah spasi yang dicetak akan bertambah setiap kali loop luar
             * berjalan.
             */
            for (int spasi = 1; spasi <= baris; spasi++) {
                System.out.print(" ");
                
            }
            /*
             * Looping kedua (kolom) digunakan untuk mencetak karakter bintang (*) pada setiap
             * baris. Jumlah bintang yang dicetak akan berkurang seiring dengan bertambahnya
             * nomor baris, sehingga mengeluarkan output segitiga terbalik.
             */
            for (int kolom = n; kolom > baris; kolom--) {
                System.out.print("*");
            }
            System.out.println(""); // melakukan enter untuk pindah ke baris berikutnya.
        }
    }
}