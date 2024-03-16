package Pemdas;

import java.util.Scanner;

public class TugasPattern {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);


        System.out.print("Masukkan tinggi = ");
        pattern4();

        
        
    }
    static void pattern1(){
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi di awal setiap baris
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Mencetak karakter '*' dalam setiap baris
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris berikutnya
        }

    }
    static void pattern2(){
        int n;
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern3(){
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
    static void pattern4(){
        int n = in.nextInt(); // minimal 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Cetak karakter "X" jika i sama dengan j atau i sama dengan (tinggi - j - 1)
                if (i == j || i == (n - j - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Cetak spasi untuk bagian lain
                }
            }
            System.out.println(); // Pindah ke baris berikutnya setelah selesai satu baris X
        }

        // for (int baris = 1; baris <= n; baris++){
        //     if (baris == 1 || baris ==n){
        //         for (int kolom = 1; kolom <= n; kolom++){
        //             if (kolom == 1 || kolom ==n){
        //                 System.out.print("* ");
        //             }
        //             else {
        //                 System.out.println(" ");
        //             }
        //         }
                
        //     }
        //     if (baris == 2 || baris ==6){
        //         for (int kolom = 1; kolom <= n; kolom++){
        //             if (kolom == 2 || kolom ==6){
        //                 System.out.print("* ");
        //             }
        //             else {
        //                 System.out.println(" ");
        //             }
        //         }
                
        //     }
        //     if (baris == 3 || baris ==5){
        //         for (int kolom = 1; kolom <= n; kolom++){
        //             if (kolom == 3 || kolom ==5){
        //                 System.out.print("* ");
        //             }
        //             else {
        //                 System.out.print(" ");
        //             }
        //         }

            
        //     }
            
        //     if (baris == 4){
        //         for (int kolom = 1; kolom <= n; kolom++){
        //             if (kolom == 4 ){
        //                 System.out.print("* ");
        //             }
        //             else {
        //                 System.out.print(" ");
        //             }
        //         }
                
        //     }
        // }
    }

}
