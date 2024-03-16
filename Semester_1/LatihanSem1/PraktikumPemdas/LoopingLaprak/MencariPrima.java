package PraktikumPemdas.LoopingLaprak;

import java.util.Scanner;
public class MencariPrima {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int n, angka, mencariPrima;
        /*
         * inputan dari user untuk menentukan jumlah bilangan
         * prima yang diinginkan user 
         */
        n = in.nextInt(); // mengambil input dari user untuk menentukan jumlah bilangan prima yang diinginkan
        
        /*
         * variabel mrncariPrima adalah untuk memulai loop untuk mencari
         * bilangan prima dengan jumlah yang diinginkan oleh user
         */
        angka = 2;
        mencariPrima = 0;

        /*
         * Di bawah ini looping untuk mencari dan menampilkan bilangan prima hingga
         * mencapai jumlah yang diinginkan oleh user
         */
        while (mencariPrima < n) {
            boolean prima = true;
            /*
             * Dibawah ini untuk menentukan apakah suatu angka adalah bilangan prima
             * dengan menggunakan inisiasi angka awal adalah 2(Karena bilangan prima mulai dari 2)
             * hingga akar kuadrat dari bilangan yang sedang di periksa. Jika ditemukan pembagi
             * selain dari 1 dan dirinya sendiri, maka bilangan tersebut ukan bilangan prima.
             */
            for (int i = 2; i <= Math.sqrt(angka); i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }
            /*
             * Jika bilangan dinyatakan sebagai prima berdasarkan hasil looping di atas,
             * maka bilangan tersebut akan dicetak dan variabel mencariPrima akan menambah 1 (increment).
             */
            if (prima) {
                System.out.print(angka + " ");
                mencariPrima++;
            }
            angka++;
        }
    }
}