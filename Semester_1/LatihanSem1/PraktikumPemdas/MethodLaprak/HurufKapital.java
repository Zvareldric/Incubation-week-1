package PraktikumPemdas.MethodLaprak;

import java.util.Scanner;

public class HurufKapital {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kalimat;

        kalimat = in.nextLine();

        ubahKalimat(kalimat);

        in.close();
    }
    static void ubahKalimat(String kataDepanKalimat) {
        String kataPertama;
        kataPertama = kataDepanKalimat.substring(0, 1).toUpperCase();
        System.out.print(kataPertama);

        for (int a = 1; a <= kataDepanKalimat.length() - 1; a++) {
            if (kataDepanKalimat.substring(a - 1, a).equals(" ")) {
                String kalimatBerubah = kataDepanKalimat.substring(a, a + 1).toUpperCase();
                System.out.print(kalimatBerubah);
            } else {
                String kalimatTidakBerubah = kataDepanKalimat.substring(a, a + 1);
                System.out.print(kalimatTidakBerubah);
            }
        }
    }
}
