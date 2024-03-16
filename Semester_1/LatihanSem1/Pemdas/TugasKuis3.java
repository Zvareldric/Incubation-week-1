package Pemdas;

import java.util.Scanner;
public class TugasKuis3 {

    static Scanner in;

    static String[] kodeMk = new String[3];
    static int[] tahunKurikulum = new int[3];
    static String[] namaMk = new String[3];
    static byte[] sks = new byte[3];
    static int tambahMataKuliah;
    static int count = 0;
    static int penambahanSelanjutnya = 0;
   
    public static void main(String[] args) {
        in = new Scanner(System.in);
         
         menuMataKuliah();
    }
    static void menuMataKuliah(){
        byte pilihan;
        
            do{
                System.out.println("SIAKAD - Mata Kuliah");
                System.out.println("1. Tambah mata kuliah");
                System.out.println("2. Cari mata kuliah (berdasarkan kode mk)");
                System.out.println("3. Hapus mata kuliah (berdasarkan kode mk)");
                System.out.println("4. Tampilkan daftar mata kuliah");
                System.out.println("0. Keluar");
                System.out.print("Masukkan pilihan Anda : ");
                pilihan = in.nextByte();
                    switch(pilihan){
                        case 1 :
                            subMenuTambahMataKuliah();
                            break;
                        case 2 : 
                            subMenuCariMataKuliah();
                            break;
                        case 3 :
                            subMenuHapusMataKuliah();
                            break;
                        case 4 :
                            subMenuTampilkanDaftarMataKuliah();
                            break;
                        case 0 :
                            System.out.println("Terima kasih telah menggunakan SIAKAD");
                            System.exit(0);
                        default :
                            System.out.println("Angka tidak valid");
                        break;
                    }
            
            }while(pilihan != 0);

        }

        static void subMenuTambahMataKuliah(){
            System.out.print("Berapa mata kuliah yang akan ditambahkan : ");
            tambahMataKuliah = in.nextInt();
            System.out.println();

            kodeMk = new String[tambahMataKuliah];
            tahunKurikulum = new int[tambahMataKuliah];
            namaMk = new String[tambahMataKuliah];
            sks = new byte[tambahMataKuliah];
            
            for(int i = 0; i < tambahMataKuliah; i++){
                System.out.printf("Tambah mata kuliah ke-%d\n", i+1);
                System.out.print("Kode mata kuliah : ");
                kodeMk[i] = in.next();
                System.out.print("Tahun kurikulum : ");
                tahunKurikulum[i] = in.nextShort();
                in.nextLine(); 
                System.out.print("Nama mata kuliah : ");
                namaMk[i] = in.nextLine();
                System.out.print("Jumlah sks : ");
                sks[i] = in.nextByte();
                System.out.println();
            }
            System.out.println("Data berhasil disimpan!\n");
            // }
        }
        static void subMenuCariMataKuliah() {
            System.out.println("Cari mata kuliah (berdasarkan kode mk)");
            System.out.print("Masukkan kode mata kuliah : ");
            String cariKodeMk = in.next();
            boolean found = true;
        
            for (int i = 0; i < kodeMk.length; i++) {
                if (kodeMk[i].equals(cariKodeMk)) {
                    System.out.println("Nama mata kuliah : " + namaMk[i]);
                    System.out.println("Tahun kurikulum : " + tahunKurikulum[i]);
                    System.out.println("Jumlah sks : " + sks[i]);
                    found = false;
                    break;
                }
            }
        
            if (!found) {
                System.out.println("Data yang anda cari tidak ditemukan");
            }
            System.out.println();
        }
        static void subMenuHapusMataKuliah() {
        
        System.out.println("Anda akan menghapus data mata kuliah.");
        System.out.print("Masukkan kode mata kuliah: ");
        String hapusMatkul = in.next();

        int index = -1;

        for (int i = 0; i < tambahMataKuliah; i++) {
            if (hapusMatkul.equals(kodeMk[i])) {
                index = i;
                System.out.println("Mata kuliah dengan kode " + hapusMatkul + " berhasil dihapus.");
                break;
            }
        }

        if (index != -1) {
            // Menggeser elemen array untuk menutup celah yang dihapus
            for (int i = index; i < tambahMataKuliah - 1; i++) {
                kodeMk[i] = kodeMk[i + 1];
                tahunKurikulum[i] = tahunKurikulum[i + 1];
                namaMk[i] = namaMk[i + 1];
                sks[i] = sks[i + 1];
            }

            // Mengurangi jumlah mata kuliah setelah penghapusan
            tambahMataKuliah--;
        } else {
            System.out.println("Mata kuliah dengan kode " + hapusMatkul + " tidak ditemukan.");
        }

        System.out.println();  
        }
        static void subMenuTampilkanDaftarMataKuliah() {
            int x = tambahMataKuliah + penambahanSelanjutnya;
            System.out.println("Daftar mata kuliah:");
            System.out.printf("|%-15s|%-20s|%-20s|%-10s|%n", "KODE MK", "TAHUN KURIKULUM", "NAMA MATA KULIAH", "JUMLAH SKS");
        
            for (int i = penambahanSelanjutnya; i < x; i++) {
                if (tambahMataKuliah != 0) {
                    System.out.printf("|%-15s|%-20s|%-20s|%-10s|%n", kodeMk[i], tahunKurikulum[i], namaMk[i], sks[i]);  
                    System.out.println(i);
                }
            }
            penambahanSelanjutnya = tambahMataKuliah;
            System.out.println();
        }
}
