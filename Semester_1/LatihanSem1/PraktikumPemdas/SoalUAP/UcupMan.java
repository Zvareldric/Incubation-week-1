package PraktikumPemdas.SoalUAP;
import java.util.Scanner;

public class UcupMan {

    /* If the user inputs:
     * p = 5 for length
     * l = 2 for width
     * k = 6 for thickness
     * The expected output is:
     * UU  UU
     * UU  UU
     * UU  UU
     * UUUUUU
     * UUUUUU
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int p, l, k;

        p = in.nextInt();
        l = in.nextInt();
        k = in.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < p; j++) {
                if (i < l - 1) {
                    if (j == p - 1) {
                        System.out.print("U");
                    } else {
                        System.out.print("U ");
                    }
                } else {
                    System.out.print("U");
                }
            }
            System.out.println();
        }
    }
}
