package Semester_2.PBO.Pertemuan1.Tugas1;

import java.util.Scanner;

public class Hitung {
    static double sisi;
    static Scanner in = new Scanner(System.in);
      public static void main(String[] args) {
          
        short pilihan;
        do{
            System.out.println("\nPilih yang ingin anda hitung pada persegi");
            System.out.println("1. Keliling \n2. luas \n3. Panjang diagonal \n0. Keluar");
            System.out.print("Pilih salah satu : ");
            pilihan = in.nextShort();

            switch (pilihan) {
                case 1 :
                    keliling();
                    break;
                case 2 :
                    luas();
                    break;
                case 3 : 
                    diagonal();
                    break;
                case 0:
                    System.out.println("Terima Kasih telah menggunakan program");
                    System.exit(0);
                break;
                default:
                    System.out.println("Pilihan tidak valid");
                break;
            }
        }while(pilihan != 0);
    } 

    static void menuKkelilingDanLuas(){
        System.out.print("Masukkan panjang sisi(cm): ");
        sisi = in.nextDouble();
    }
    static void keliling(){
        menuKkelilingDanLuas();
        double keliling = 4 * sisi;
        System.out.print("Keliling persegi = " + keliling);
    }
    static void luas(){
        menuKkelilingDanLuas();
        double luas = sisi * sisi;
        System.out.print("Luas persegi = " + luas);
    }
    static void diagonal(){
        menuKkelilingDanLuas();
        double diagonal = sisi * Math.sqrt(2);
        System.out.print("Panjang diagonal = " + diagonal);
    }
}
