package Semester_2.PBO.Pertemuan1.Tugas1;

import java.util.Scanner;

public class Persegi {
    //attribute
    private double sisi;

    //behavior
    public double luas(double s) {
        return s * s;
    }

    public double keliling(double s) {
        return s * 4;
    }

    public double diagonal(double s) {
        return Math.sqrt(2 * s * s);
    }

    public void display() {
        System.out.println("Luas = " + luas(sisi));
        System.out.println("Keliling = " + keliling(sisi));
        System.out.println("Diagonal = " + diagonal(sisi));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi: ");
        double sisi = scanner.nextDouble();

        Persegi hitung = new Persegi();
        hitung.sisi = sisi;
        hitung.display();

        scanner.close();
    }
}
