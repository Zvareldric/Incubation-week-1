package PraktikumPemdas.MethodLaprak;

import java.util.Scanner;
public class PencarianJumlahHuruf {
    public static void main(String[] args) {
   
        Scanner in = new Scanner(System.in);
  
        String kalimat, kataDicari;
        int jumlahHuruf;

        kalimat = in.nextLine();
   
        kataDicari = in.next();

        jumlahHuruf = menghitungJumlahKata(kalimat, kataDicari, 0);
        
        System.out.printf("Huruf %s pada kata %s ada %d", kataDicari, kalimat, jumlahHuruf);

        in.close();
    }
   
    static int menghitungJumlahKata(String kalimat, String kataDicari, int posisiIndex){
        int count = 0;

        if (posisiIndex == kalimat.length()) {
            return 0; 
        }
        if (kalimat.substring(posisiIndex, posisiIndex + 1).equalsIgnoreCase(kataDicari)) {
            count++;
        } 
        
        count = count + menghitungJumlahKata(kalimat, kataDicari, posisiIndex + 1); 
        
        return count;
    }

}
