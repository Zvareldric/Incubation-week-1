package PraktikumPemdas.ArrayLaprak;

import java.util.Scanner;

public class PerkalianArrayMultiDimensi {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int baris, kolom;
        
        // Memasukkan jumlah baris dan kolom
        baris = in.nextInt();
        kolom = in.nextInt();

        /*
         * deklarasi array integer untuk batas array yang ditampung, 
         * panjang array sesuai dengan input baris dan kolom yang dilakukan oleh user
         */
        int[][] matrix = new int[baris][kolom];

        /*
         * nestead loop untuk memasukkan nilai-nilai matrix oleh user
         * sesuai dengan jumlah baris dan kolom yang diinput oleh user
         */
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // Menghitung hasil perkalian setiap baris
        for (int i = 0; i < baris; i++) {
            int hasilPerkalian = 1; //  kenapa bukan 0? karena untuk inisialisasi perkalian
            for (int j = 0; j < kolom; j++) {
                // Menghitung hasil perkalian setiap baris
                hasilPerkalian *= matrix[i][j];
                // Menampilkan nilai array dan hasil perkalian di setiap baris, jika sudah lebih dari baris dia akan meng-enter
                System.out.print(matrix[i][j] + " ");
            }
            
            // print hasil perkalian setiap baris
            System.out.println("=> " + hasilPerkalian);
        }
    }
}