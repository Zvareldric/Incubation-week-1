package Pemdas;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [][] matrix;
        int baris, kolom;

        System.out.println("Masukkan ordo matrix");
        System.out.print("Masukkan Baris : ");
        baris = in.nextInt();
        System.out.print("Masukkan Kolom : ");
        kolom = in.nextInt();
        
        matrix = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("Matrix [%d][%d] = ", i+1,j+1);
                matrix [i][j] = in.nextInt();
            }
        }
        System.out.println("Matrik yang anda masukkan: ");
        cetakMatrixUser(matrix);
        in.close();
    }
    static void cetakMatrixUser(int matrix [][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
