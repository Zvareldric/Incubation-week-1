package PraktikumPemdas;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        
        // Cara pertama
        // String[] nama;
        // nama = new String[3];

        // Cara kedua
        // String nama[];
        // nama = new String[3];

        //Cara langsung
        // String[] nama = new String[3];

        // Cara mengisi Nilai pada array 1
        // nama[0] = "Ao"; // untuk Scanner
        // nama[1] = "Shiro";
        // nama[2] = "Kuro";

        // Cara mengisi Nilai pada array 2
        String[] nama = {"Ao", "Shiro", "Kuro"}; // untuk static
        // String[] nama = new String[] {"Ao", "Shiro", "Kuro"}; // atau bisa begini

        System.out.println(nama[0]);
        System.out.println(nama[2]);

        nama[0] = "Aka"; // Mengubah ke data baru di dalam array
        System.out.println(nama[0]);

        System.out.println(nama.length); // Mencetak panjang Array (buka index)

        // Cara mencetak seluruh data di dalam array 1
        // for (int i = 0; i < nama.length; i++) {
        //     System.out.println("Nama index ke-" + i  + " : " + nama[i]);
        // }
        
        // Cara mencetak seluruh sata di dalam array 2
        for(String value : nama){
            System.out.println(value); // tetapi kelemahannya kita tidak bisa tahu index keberapa
        }
    }
}
