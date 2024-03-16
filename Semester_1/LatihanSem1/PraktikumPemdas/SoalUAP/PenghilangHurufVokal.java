package PraktikumPemdas.SoalUAP;
import java.util.Scanner;

public class PenghilangHurufVokal{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String kalimat = in.nextLine();
        char[] vokal = {'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O'};

        // Menghilangkan huruf vokal
        String kalimatTanpaVokal = "";
        // mengscan kalimat
        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = kalimat.charAt(i);
            boolean hurufVokal = false;
            //kondisi jika ada huruf vokal
            for (char k : vokal) {
                if (huruf == k) {
                    hurufVokal = true;
                    break;
                }
            }
            //kondisi jika bukan huruf vokal
            if (!hurufVokal) {
                kalimatTanpaVokal += huruf;
            }
        }
        System.out.println(kalimatTanpaVokal);

        in.close();
    }
}
