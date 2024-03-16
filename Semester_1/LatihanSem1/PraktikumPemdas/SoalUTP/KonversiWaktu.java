package PraktikumPemdas.SoalUTP; 
import java.util.Scanner; 

public class KonversiWaktu {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); 
        
        String kode; // T5 B5 H5
        char kodeHuruf; // T, B, H
        int i, j, kodeAngka, totalDetik = 0; // Variabel untuk indeks, indeks kedua, dan nilai yang akan diambil
        
        kode = in.nextLine(); // T5 B5 H5

        kode = kode.replace(" ", ""); // T5B5H5


        for (i = 0; i < kode.length(); i++) { // Melakukan perulangan untuk mencari char (T, B, H, J, M) dalam input. Cth : T5H5 -> length = 4
            kodeHuruf = kode.charAt(i); // Mengambil karakter saat ini

            j = i + 1; 
            while (j < kode.length() && Character.isDigit(kode.charAt(j))) {  /* Mengambil indeks karakter digit berikutnya Mengambil nilai dari substring digit digunakan untuk mengecek karakter berikutnya 
                                                                                setelah kode huruf yang valid, yaitu karakter-karakter yang berisi digit (angka).
                                                                              */
                j++;
            }     
            kodeAngka = Integer.parseInt(kode.substring(i + 1, j)); // Mengambil nilai dari substring digit 

            switch (kodeHuruf) { 
                case 'T': // Tahun
                    totalDetik += kodeAngka * 365 * 24 * 60 * 60; // totalDetik = totalDetik + kodeAngka * 365 * 24 * 60 * 60
                    break;
                case 'B':
                    totalDetik += kodeAngka * 30 * 24 * 60 * 60; 
                    break;
                case 'H':
                    totalDetik += kodeAngka * 24 * 60 * 60; 
                    break;
                case 'J':
                    totalDetik += kodeAngka * 60 * 60;
                    break;
                case 'M':
                    totalDetik += kodeAngka * 60; 
                    break;
            }

            i = j - 1; 
        }

        System.out.println(totalDetik); 
    }
}
