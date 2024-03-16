package Pemdas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenjumlahanDanPerkalianArray2D {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        mainMenu();
    }

    static void mainMenu() {
        byte pilihan = 0;
        boolean cek = true;

        do {
            try{
                System.out.println("\n=== Program Penjumlahan dan Perkalian Matrix ===");
                System.out.println("Pilih Operasi :");
                System.out.println("1. Penjumlahan \n2. Perkalian \n0. Keluar");
                System.out.print("Masukkan pilihan Anda : ");
                pilihan = in.nextByte();
    
                switch (pilihan) {
                    case 1:
                        penjumlahanMenu();
                        break;
                    case 2:
                        perkalianMenu();
                        break;
                    case 0:
                        System.out.println("Anda berhasil keluar dari program");
                        break;
                    default:
                        System.out.println("Angka pilihan tidak valid");
                        break;
                }
            }catch(InputMismatchException e){
                System.out.println("\n!!! Input tidak valid !!!\n");
                in.nextLine();
                cek = false;
            }
        } while (pilihan != 0 || cek == false);
            System.out.println("=== Terima kasih telah menggunakan program dari " +
                                "ZVARSoft ===");
    }

    static void penjumlahanMenu() {  
        int[][] matrix1 = menuInputMatrix("Matriks ke-1");
        int[][] matrix2 = menuInputMatrix("Matriks ke-2");

        if (matrix1 != null && matrix2 != null) {
            if (validasiOrdoPenjumlahan(matrix1, matrix2)) {
                int[][] hasilPenjumlahan = penjumlahanMatrix(matrix1, matrix2);
                System.out.println("Hasil penjumlahan matrix:");
                formatMatrix(hasilPenjumlahan);
            } else {
                System.out.println("Dimensi matriks tidak sesuai untuk penjumlahan.");
            }
        }
    }

    static void perkalianMenu() {
        int[][] matrix1 = menuInputMatrix("Matriks ke-1");
        int[][] matrix2 = menuInputMatrix("Matriks ke-2");

        if (matrix1 != null && matrix2 != null) {
            if (validasiOrdoPerkalian(matrix1, matrix2)) {
                int[][] hasilPerkalian = perkalianMatrix(matrix1, matrix2);
                System.out.println("Hasil perkalian matrix:");
                formatMatrix(hasilPerkalian);
            } else {
                System.out.println("Dimensi matriks tidak sesuai untuk perkalian.");
            }
        }
    }

    static int[][] menuInputMatrix(String namaMatrix) {
        int[][] matrix;
        int baris = 0, kolom = 0;
        do{
            System.out.println("\nMasukkan ordo " + namaMatrix);
            System.out.print("Masukkan Baris : ");
            baris = in.nextInt();
            System.out.print("Masukkan Kolom : ");
            kolom = in.nextInt();

            if (baris <= 0 || kolom <= 0) {
                System.out.println("\nError: Ordo matriks harus lebih besar dari 0.\n");
            }
        } while (baris <= 0 || kolom <= 0);

        matrix = new int[baris][kolom];

        System.out.println("Masukkan nilai " + namaMatrix + ":");

        try {
            return inputMatrix(matrix);
        } catch (InputMismatchException e){
            System.out.println("Error: Input yang dimasukkan harus berupa bilangan bulat.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    static int[][] inputMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                try{
                    System.out.printf("Matrix [%d][%d] = ", i + 1, j + 1);
                    matrix[i][j] = in.nextInt();
                } catch (InputMismatchException e){
                    System.out.println("Error: Input yang dimasukkan harus berupa bilangan bulat.");
                    in.nextLine(); // Bersihkan buffer input
                    return null;
                }
            }
        }
        return matrix;
    }

    static int[][] penjumlahanMatrix(int[][] matrix_a, int[][] matrix_b) {
        int[][] hasil = new int[matrix_a.length][matrix_a[0].length];
        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_a[0].length; j++) {
                hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];
            }
        }
        return hasil;
    }

    static int[][] perkalianMatrix(int[][] matrix_a, int[][] matrix_b) {
        int[][] hasil = new int[matrix_a.length][matrix_b[0].length];

        for (int i = 0; i < matrix_a.length; i++) {
            for (int j = 0; j < matrix_b[0].length; j++) {
                int buffer = 0;
                for (int k = 0; k < matrix_a[0].length; k++) {
                    buffer += matrix_a[i][k] * matrix_b[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
        return hasil;
    }

    static boolean validasiOrdoPenjumlahan(int[][] matrix_a, int[][] matrix_b) {
        return matrix_a.length == matrix_b.length && matrix_a[0].length == matrix_b[0].length;
    }

    static boolean validasiOrdoPerkalian(int[][] matrix_a, int[][] matrix_b) {
        return matrix_a[0].length == matrix_b.length;
    }

    static void formatMatrix(int[][] matrix) {
        int baris = matrix.length;
        int kolom = matrix[0].length;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%d %s", matrix[i][j], "\t");
            }
            System.out.println();
        }
    }
}