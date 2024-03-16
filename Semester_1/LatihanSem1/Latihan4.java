package Semester_1.LatihanSem1;
import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String keterangan = scanner.next();
        int[] deretAngka = new int[n];
        for (int i = 0; i < n; i++) {
            deretAngka[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((keterangan.equals("ASC") && deretAngka[j] > deretAngka[j + 1]) ||
                    (keterangan.equals("DESC") && deretAngka[j] < deretAngka[j + 1])) {
                    int temp = deretAngka[j];
                    deretAngka[j] = deretAngka[j + 1];
                    deretAngka[j + 1] = temp;
                }
            }
        }

        for (int angka : deretAngka) {
            System.out.print(angka + " ");
        }
    }
}