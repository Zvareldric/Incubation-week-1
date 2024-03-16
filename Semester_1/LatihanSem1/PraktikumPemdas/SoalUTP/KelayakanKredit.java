package PraktikumPemdas.SoalUTP;
import java.io.IOException;
import java.util.Scanner;

public class KelayakanKredit {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in); //input dari user 

        String pendapatan = input.nextLine(); // Rp 6.500.000
        String pendapatanReplace1 = pendapatan.replace(".", ""); // Rp 6500000
        String pendapatanReplace2 = pendapatanReplace1.replace("Rp ", "");// 6500000
        int pendapatanInt = Integer.parseInt(pendapatanReplace2);
        String statusPekerjaan = input.nextLine();// Tetap/Tidak Tetap
        String RiwayatKredit = input.nextLine();// Baik/Tidak Baik

        
            if (pendapatanInt >= 5000000 && statusPekerjaan.equals("Tetap") && RiwayatKredit.equals("Baik")) {
                System.out.println("Anda layak mendapatkan kredit");
            } else 
                System.out.println("Anda tidak layak mendapatkan kredit");
            
        
    }
}
