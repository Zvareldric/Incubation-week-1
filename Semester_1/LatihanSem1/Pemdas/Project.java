package Pemdas;

/*Ini adalah program untuk menyimpan sebuah data mata kuliah
 * dalam suatu sistem. Nama sistem nya SIAKAD.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project {

    /////////////// DEKLARASI KOMPONEN//////////////
    static String[] listkodeMatkul = new String[10];
    static String[] listMatkul = new String[10];
    static byte[] listSKS = new byte[10];
    static int[] listKurikulum = new int[10];
    static String[] listProdi = new String[10];
    //////////////////////////////////////////////

    static int pilih;
    static int counterMatkul = 0;
    static Scanner in = new Scanner(System.in);
    static boolean cek = true;

    public static void main(String[] args) {

        do {
            try {
                menu();
            } catch (InputMismatchException e) {
                System.out.println("Tidak Valid");
                System.out.println("");
                in.nextLine();
                cek = false;
            }
        } while (cek == false);
    }

    private static void menu() {
        cek = true;
        do {
            System.out.println("SELAMAT DATANG DI SIAKAD");
            System.out.println("PROGRAM MATA KULIAH");
            System.out.println("PROGRAM INI HANYA BISA MENAMPUNG 10 MATA KULIAH ");
            System.out.println("1.Tambah Mata Kuliah.");
            System.out.println("2.Cari Mata Kuliah.");
            System.out.println("3.Menghapus Mata Kuliah.");
            System.out.println("4.Tampilkan Mata Kuliah.");
            System.out.println("0.Keluar.");
            System.out.println("");
            System.out.print("Masukan piihan anda: ");
            pilih = in.nextInt();
            in.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("");
                    tambahMataKuliah();
                    System.out.println("");
                    break;
                case 2:
                    cariMatKul();
                    break;
                case 3:
                    hapusMataKuliah();
                    break;
                case 4:
                    tampilkanMataKuliah();
                    break;  
                default:
                    System.out.println("Tidak Valid.");
                    System.out.println("");
                    break;
            }
        } while (pilih != 0);
    }

    private static void tambahMataKuliah() {
        System.out.println("Anda akan nambah mata kuliah");
        System.out.print("Berapa Mata Kuliah yang ingin di tambah: ");
        byte nambah = in.nextByte();
        System.out.println("");

        for (int i = 0; i < nambah; i++) {
            System.out.println("Mata Kuliah ke-" + (counterMatkul + 1));
            in.nextLine();
            System.out.print("Masukkan Program studi: ");
            String prodi = in.next();
            in.nextLine();
            System.out.print("Masukan Kode mata Kuliah: ");
            String kodeMatkul = in.next();
            System.out.print("Masukan tahun kurikulum: ");
            int tahunKurikulum = in.nextInt();
            in.nextLine();
            System.out.print("Masukan Nama mata Kuliah: ");
            String masukinNamaMatkul = in.nextLine();
            System.out.print("Masukan Jumlah SKS: ");
            byte sks = in.nextByte();

            listkodeMatkul[counterMatkul] = kodeMatkul;
            listMatkul[counterMatkul] = masukinNamaMatkul;
            listKurikulum[counterMatkul] = tahunKurikulum;
            listSKS[counterMatkul] = sks;
            listProdi[counterMatkul] = prodi;
            counterMatkul++;
            System.out.println("");
        }
        System.out.println("Data Berhasil Ditambahkan.");
    }

    private static void cariMatKul() {
        boolean cek2 = true;
        if (counterMatkul == 0) {
            System.out.println("Tambahkan dulu mata kuliah.");
            System.out.println("");
        } else {
            System.out.println("Anda akan mencari Mata Kuliah");
            System.out.print("Masukan kode Mata Kuliah: ");
            String nyariMatkul = in.next();

            for (int a = 0; a < counterMatkul; a++) {

                if (listkodeMatkul[a].equals(nyariMatkul)) {
                    System.out.println("Ditemukan");
                    System.out.println("");
                    System.out.println("Nama Mata kuliah: " + listMatkul[a]);
                    System.out.println("Nama Prodi: " + listProdi[a]);
                    System.out.println("Tahun Kurikulum: " + listKurikulum[a]);
                    System.out.println("Jumlah SKS: " + listSKS[a]);
                    System.out.println("Kode Mata Kuliah: " + listkodeMatkul[a]);
                    System.out.println();
                    cek2 = false;
                    break;
                }
            }
            if (cek2 == true) {
                System.out.println("Data yang anda cari tidak ditemukan");
            }
            System.out.println("");
        }

    }

    private static void hapusMataKuliah() {

        if (counterMatkul == 0) {
            System.out.println("Tambahkan dulu mata kuliah.");
            System.out.println("");
        } else {
            System.out.println("Anda akan menghapus Mata Kuliah");
            System.out.print("Masukan kode Mata Kuliah: ");
            String hapusMK = in.nextLine();
            boolean kondisi = true;
            // SI COUNTER MENCARI INDEX MELALUI i
            for (int i = 0; i < counterMatkul; i++) {

                if (listkodeMatkul[i].equals(hapusMK)) {
                    System.out.println("Ditemukan.");
                    System.out.println("");
                    System.out.println("Anda yakin ingin menghapus Mata Kuliah " + listkodeMatkul[i]);
                    System.out.println("1.YA");
                    System.out.println("2.TIDAK");
                    System.out.print("Masukan Pilihan Anda: ");
                    byte yakinHapus = in.nextByte();

                    if (yakinHapus == 1) {
                        // si index sudah ketahuan
                        for (int j = i; j < counterMatkul - 1; j++) {
                            listProdi[j] = listProdi[j + 1];
                            listMatkul[j] = listMatkul[j + 1];
                            listkodeMatkul[j] = listkodeMatkul[j + 1];
                            listKurikulum[j] = listKurikulum[j + 1];
                            listSKS[j] = listSKS[j + 1];
                        }
                        kondisi = false;
                        counterMatkul--;
                        System.out.println("");
                        System.out.println("Mata kuliah dengan kode " + listkodeMatkul[i] + " berhasil dihapus.");
                    } else
                        break;
                }
            }

            if (kondisi == true) {
                System.out.println("Tidak Ditemukan.");
            }
        }
    }

    private static void tampilkanMataKuliah() {
        if (counterMatkul == 0) {
            System.out.println("Tambahkan dulu mata kuliah");
            System.out.println("");
        } else {
            System.out.printf("|%-30s|%-20s|%-19s|%-20s|%-15s|\n", "Nama Program Studi", "Kode Mata Kuliah", "Tahun Kurikulum",
                    "Nama Mata Kuliah", "Jumlah SKS");
            for (int i = 0; i < counterMatkul; i++) {
                System.out.printf("|%-30s|%-20s|%-19d|%-20s|%-15d|\n", listProdi[i], listkodeMatkul[i], listKurikulum[i], listMatkul[i],
                        listSKS[i]);
            }
            System.out.println("");
        }
    }
}