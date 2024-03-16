package PraktikumPemdas.MethodLaprak;

import java.util.Scanner;

public class PencarianJumlahHuruf2 {
    public static void main(String[] args) {
        // Membuat objek Scanner karena kita butuh input dari user untuk menjalankan program
        Scanner in = new Scanner(System.in);
        
        // Mendeklarasikan variabel kalimat, kataDicari, dan jumlahHuruf
        String kalimat, kataDicari;
        int jumlahHuruf;

        // Menerima input kalimat dari user
        kalimat = in.nextLine();
        
        // Menerima input kata yang dicari dari user
        kataDicari = in.next();

        // Memanggil method menghitungJumlahKata untuk menghitung jumlah kemunculan kataDicari dalam kalimat
        jumlahHuruf = menghitungJumlahKata(kalimat, kataDicari, 0);
        
        // Menampilkan output jumlah kemunculan kataDicari dalam kalimat
        System.out.printf("Huruf %s pada kata %s ada %d", kataDicari, kalimat, jumlahHuruf);

        // Menutup objek Scanner
        in.close();
    }
    
    /*membuat recursive method untuk menghitung jumlah kemunculan kataDicari dalam kalimat
     *karena disini kita tidak boleh menggunakan looping, jadi kita manfaatkan recursive method untuk menghitung jumlah huruf 
     *yang dicari
     */
    static int menghitungJumlahKata(String kalimat, String kataDicari, int count){
        // jika variabel count sudah mencapai akhir kalimat, kembalikan nilai 0
        if (count == kalimat.length()) {
            return 0; 
        }
        
        int hitung = 0;
        
        /*
         * Jika huruf pada posisi count dalam kalimat sama dengan huruf pertama kataDicari,
         * variabel hitung akan menambah 1
         * catatan : ignore case adalah fungsi untuk melihat sebuah huruf itu sama baik kapital atau bukan
         */
        if (kalimat.substring(count, count + 1).equalsIgnoreCase(kataDicari)) {
            hitung++;
        } 
        
        /*
         * ini akan memanggil dia sendiri untuk mengulang dari langkah awal tambahkan hasil
         * pemanggilan fungsi pada posisi selanjutnya ke dalam hitung, sampai berakhir di seleksi kondisi yang awal.
         */
        hitung = hitung + menghitungJumlahKata(kalimat, kataDicari, count + 1); 
        
        // Kembalikan jumlah total kemunculan huruf kataDicari dalam kalimat ke main method
        return hitung;
    }
}
