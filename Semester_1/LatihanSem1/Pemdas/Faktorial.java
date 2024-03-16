package Pemdas;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, angka, hasil = 1;
        System.out.println("Program menghitung faktorial");
        System.out.print("Masukkan nilai n! = ");
        n = input.nextInt();
        if (n <= 0){
            System.out.println("Nilai n harus lebih dari 0");
        }else if(n == 1){
            System.out.println(n);
        }else if (n >= 0) {
            System.out.print(n + "! = ");
            for (angka = n; angka >= 1; angka--) {
                hasil = hasil *  angka;
                System.out.print(angka);
                if (angka > 1) {
                    System.out.print(" x ");
                }
            }
            System.out.println(" = " + hasil);
            System.out.println(n + "! = " + hasil);
        }
    }
}
