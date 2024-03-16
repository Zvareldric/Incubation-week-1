package Semester_1.LatihanSem1;
import java.util.Scanner;
public class Latihan1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Masukkan panjang deret angka: ");
        int n = scanner.nextInt();

        // Menerima input keterangan urutan (ASC atau DESC)
        System.out.print("Masukkan keterangan urutan (ASC atau DESC): ");
        String keterangan = scanner.next();

        // Menerima input deret angka
        System.out.print("Masukkan deret angka hingga ke-" + n + ": ");
        int[] deretAngka = new int[n];
        for (int i = 0; i < n; i++) {
            deretAngka[i] = scanner.nextInt();
        }

        // Mengurutkan deret angka sesuai keterangan urutan
        if (keterangan.equals("ASC")) {
            deretAngka = mangUjang(deretAngka);
        } else if (keterangan.equals("DESC")) {
            deretAngka = mangUdin(deretAngka);
        } else {
            System.out.println("Keterangan urutan tidak valid. Program dihentikan.");
            System.exit(0);
        }

        // Menampilkan deret angka yang telah diurutkan
        System.out.print("Deret angka yang diurutkan hingga ke-" + n + ": ");
        for (int angka : deretAngka) {
            System.out.print(angka + " ");
        }

        // Menutup scanner
        scanner.close();
    }

    // Metode untuk mengurutkan deret angka secara ascending menggunakan Bubble Sort
    private static int[] mangUjang(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Tukar angka jika angka ke-j lebih besar dari angka ke-(j+1)
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // Metode untuk mengurutkan deret angka secara descending menggunakan Bubble Sort
    private static int[] mangUdin(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Tukar angka jika angka ke-j lebih kecil dari angka ke-(j+1)
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
}
}