package Semester_1.LatihanSem1.KlinikKoding;

import java.util.Scanner;

public class JumlahSampaiDapatSatuAngka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        System.out.println(hitungN(n));
    }
    static int hitungN(int angka){
        int sum = 0;

        while (angka != 0) {
            sum += angka % 10;
            angka/= 10;
        }
        return sum;
    }
}
