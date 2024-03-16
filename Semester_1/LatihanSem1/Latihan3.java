package Semester_1.LatihanSem1;
import java.util.Scanner;

/**
 *
 * @author afif PTI-C
 */
public class Latihan3 {
    // semua baris dari bawah - sebelum psvm tipe variabelnya Global Variable
    // variabel ini berlaku di semua method
    static Scanner input = new Scanner(System.in);
    static int counterMhs;
    
    static String[] listNIM = new String[100];
    static String[] listNama = new String[100];
    static int[] listAng = new int[100];
    static String[] listProdi = new String[100];
    
    public static void main(String[] args) {
        
        byte pilihanMenu;
        counterMhs = 1; //mendata ada berapa mahasiswa
        do {
            pilihanMenu = 5; //angka asal yang penting bukan 0-4
            pilihanMenu = menu(); //memanggil menu dan menerima input sesuai pilihan menu
            
            if (pilihanMenu == 1) {
                tambahMhs();
                counterMhs++; //setelah nambah mhs, tambah jumlah mhs total +1
            }
            if (pilihanMenu == 2) {
                cariMhs();
            }
            if (pilihanMenu == 3) {
                hapusMhs();
            }
            if (pilihanMenu == 4) {
                tampilkanSemua();
            }
            if (pilihanMenu == 0) {
                System.out.println("Terimakasih telah menggunakan");
                System.exit(0);
            }

        } while (pilihanMenu != 0); //selama pilihan menu bukan 0 (keluar), ulangi loop
        
    }
    
    
    public static byte menu() {
        byte pilihanMenu;
        
        System.out.println("SIAKAD - MAHASISWA");
        System.out.println("1. Tambah Mahasiswa baru");
        System.out.println("2. Cari Mahasiswa (berdasarkan NIM)");
        System.out.println("3. Hapus Mahasiswa (berdasarkan NIM)");
        System.out.println("4. Tampilkan daftar Mahasiswa");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pilihanMenu = input.nextByte();
        
        return pilihanMenu; //mengembalikan nilai pilihan menu ke main method
    }
    
    
    public static void tambahMhs() {
        
        System.out.println("Mahasiswa ke -" + counterMhs);
        System.out.println("Tambah mahasiswa baru :");
        System.out.print("NIM : ");
        String inputNIM = input.nextLine();
        input.next();
        System.out.print("Nama : ");
        String inputNama = input.nextLine();
        input.next();
        System.out.print("Angkatan : ");
        int inputAng = input.nextInt();
        System.out.print("Program studi :");
        input.next();
        String inputProdi = input.nextLine();
        
        listNIM[counterMhs] = inputNIM; //memasukkan nim, nama, ang, dan prodi ke list array
        listNama[counterMhs] = inputNama;
        listAng[counterMhs] = inputAng;
        listProdi[counterMhs] = inputProdi;
        
        System.out.println("Data berhasil ditambahkan \n");
    }
    
    
    public static void cariMhs() {
        boolean ketemuMhs = false;
        
        System.out.print("Masukkan nim : ");
        String cariNIM = input.nextLine();
        
        for (int i = 1; i <= counterMhs; i++) { //mencari semua list nim mhs
            if (listNIM[i] != null && listNIM[i].equals(cariNIM)) { //jika isinya bukan 0 dan sesuai dg yg dicari
                System.out.println("Nama : " + listNama[i]);
                System.out.println("Angkatan : " + listAng[i]);
                System.out.println("Prodi : " + listProdi[i]);
                ketemuMhs = true; //biar ga sout "data yg dicari tdk ketemu", karna udah ketemu
                System.out.println("");
            } 
        }
        
        if (ketemuMhs == false) {
            System.out.println("Data yang anda cari tidak ditemukan \n");
        }
    }
    
    
    public static void hapusMhs() {
        boolean ketemuMhs = false;
        
        System.out.print("Masukkan nim : ");
        String cariNIM = input.nextLine();
        for (int b = 1; b <= counterMhs; b++) { //mencari semua nim mahasiswa
            if (listNIM[b] != null && listNIM[b].equals(cariNIM)) {
                for (int c = b; c < counterMhs; c++) {
                    listNIM[c] = listNIM[c + 1];
                    listNama[c] = listNama[c + 1];
                    listAng[c] = listAng[c + 1];
                    listProdi[c] = listProdi[c + 1];
                }
                
                listNIM[counterMhs] = null;
                listNama[counterMhs] = null;
                listAng[counterMhs] = 0;
                listProdi[counterMhs] = null;
                
                ketemuMhs = true;
                counterMhs--;
                System.out.println("Data berhasil dihapus");
                break;
            }
        }
        
        if (ketemuMhs == false) {
            System.out.println("Data yang ingin dihapus tidak ditemukan \n");
        }
    }
    
    
    public static void tampilkanSemua() {
        System.out.printf("%-20s%-20s%-10s%-20s%n", "NIM", "NAMA", "ANGKATAN", "PROGRAM STUDI");
 
        for (int a = 1; a < counterMhs; a++) { //mencetak semua nim, nama, angkatan, prodi semua mhs, sesuai dg jumlah counterMhs
             System.out.printf("%-20s%-20s%-10d%-20s%n", listNIM[a], listNama[a], listAng[a], listProdi[a]);
            }
        System.out.println("");
    }
    
}
