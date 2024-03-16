package PraktikumPemdas.ArrayLaprak;

import java.util.Scanner;

public class MengurutkanAngka {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // memasukkan nilai n sebagi jumlah angka yang ingin di urutkan
        int n = in.nextInt();
        in.nextLine(); // membersihkan buffer

        // memasukkan keterangan kode ASC/DESC sebagai pengatur untuk pengurutan angka
        String keterangan = in.nextLine();

        // deklarasi array integer untuk batas array yang ditampung, panjang array sesuai dengan input n yang dilakukan oleh user
        int[] deret = new int[n];  
        /*
        * loop untuk memasukkan angka - angka yang ingin di urutkan oleh user (angka tidak boleh angka < n atau angka > n), 
        * kemudian angka disimpan ke dalam array 
        */
        for (int i = 0; i < n; i++) {
            deret[i] = in.nextInt();
        }

        /*
         * Seleksi kondisi kode untuk si user ingin mengurutkan angka dari yang terkecil ke terbesar atau sebaliknya
         * Kemudian program akan memanggil methodnya untuk mengurutkan angka  
         */
        if (keterangan.equals("ASC")) {
            urutAngkaTerkecilKeTerbesar(deret, n);
        } else if (keterangan.equals("DESC")) {
            urutAngkaTerbesarKeTerkecil(deret, n);
        }
    }

    // method untuk mengurutkan angka dari yang terkecil ke terbesar
    static void urutAngkaTerkecilKeTerbesar(int[] deret, int n) {

        /*
         * Loop pertama digunakan untuk mengontrol perulangan melalui array. Ini mengatur perulangan
         * kecuali untuk index terakhir karena dalam setiap perulangan index terbesar akan naik ke posisi yang benar di bagian kanan array.
         */
        for (int i = 0; i < n - 1; i++) {
            /*
             * Loop kedua digunakan untuk memeriksa setiap pasangan index, dimulai dari index pertama 
             * hingga sebelum index yang sudah terurut (yang berada di bagian kanan array setelah perulangan sebelumnya). 
             * Pada setiap loop ini, index-index dibandingkan dan ditukar 
             * jika diperlukan untuk memastikan index yang lebih besar bergerak ke posisi yang lebih tinggi dalam array.
             */
            for (int j = 0; j < n - i - 1; j++) {
                /*
                 * seleksi kondisi memeriksa dan membandingkan dua index berturut-turut dalam array. Jika index pada indeks j lebih besar daripada indeks j + 1, 
                 * maka keduanya ditukar posisinya untuk memastikan index yang lebih kecil bergerak ke posisi yang lebih tinggi dalam array.
                 */
                if (deret[j] > deret[j + 1]) {
                    // Menukar index jika urutannya salah
                    int hasil = deret[j]; // Menyimpan nilai sebelum pertukaran
                    deret[j] = deret[j + 1]; // Mengganti dengan nilai yang lebih kecil
                    deret[j + 1] = hasil; // Menggunakan nilai yang disimpan sebelumnya
                }
            }
        }
        
        // for-each loop Menampilkan deret yang telah diurutkan
        for (int angka : deret) {
            System.out.print(angka + " ");
        }
    } 
    
    // Method untuk mengurutkan angka dari yang terbesar ke terkecil
    static void urutAngkaTerbesarKeTerkecil(int[] deret, int n) {

        /*
         * Loop pertama digunakan untuk mengontrol perulangan melalui array. Ini mengatur perulangan
         * kecuali untuk index terakhir karena dalam setiap perulangan index terbesar akan naik ke posisi yang benar di bagian kanan array.
         */
        for (int i = 0; i < n - 1; i++) {
            /*
             * Loop kedua digunakan untuk memeriksa setiap pasangan index, dimulai dari index pertama 
             * hingga sebelum index yang sudah terurut (yang berada di bagian kanan array setelah perulangan sebelumnya). 
             * Pada setiap loop ini, index-index dibandingkan dan ditukar 
             * jika diperlukan untuk memastikan index yang lebih besar bergerak ke posisi yang lebih tinggi dalam array.
             */
            for (int j = 0; j < n - i - 1; j++) {
                /*
                 * seleksi kondisi memeriksa dan membandingkan dua index berturut-turut dalam array. Jika index pada indeks j lebih kecil daripada indeks j + 1, 
                 * maka keduanya ditukar posisinya untuk memastikan index yang lebih besar bergerak ke posisi yang lebih tinggi dalam array.
                 */
                if (deret[j] < deret[j + 1]) {
                    // Menukar index jika urutannya salah
                    int hasil = deret[j]; // Menyimpan nilai sebelum pertukaran
                    deret[j] = deret[j + 1]; // Mengganti dengan nilai yang lebih besar
                    deret[j + 1] = hasil; // Menggunakan nilai yang disimpan sebelumnya
                }
            }
        }
        // for - each loop Menampilkan deret yang telah diurutkan
        for (int angka : deret) {
            System.out.print(angka + " ");
        }
    }    
}
