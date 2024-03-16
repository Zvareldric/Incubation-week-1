package PraktikumPemdas.SoalUAP;
import java.util.Scanner;

public class TombolEnterRusak {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int batas = in.nextInt();
        in.nextLine(); // Membersihkan buffer

        String kalimat = in.nextLine();
        String[] kata = kalimat.split(" ");

        int count = 0;
        for (String ubahKalimat : kata) {
            // untuk line 1
            if (count + ubahKalimat.length() <= batas) {
                System.out.print(ubahKalimat + " ");
                count += ubahKalimat.length() + 1;
                //untuk line 2
            } else {
                System.out.println();
                System.out.print(ubahKalimat + " ");
                count = ubahKalimat.length() + 1; 
            }
        }
    }
}
