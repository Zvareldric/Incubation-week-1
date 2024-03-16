package Pemdas;
import java.util.Scanner;

public class TugasMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        TugasMethod program = new TugasMethod();
        
        String pilihanKembali;

        do {
            program.tampilkanMenuUtama();

            System.out.print("Apakah Anda ingin kembali ke menu awal? (y/n): ");
            pilihanKembali = input.next();
            System.out.println("");

        } while (pilihanKembali.equals("y"));

        if (pilihanKembali.equals("n")) {
            System.out.println("Terima kasih telah menggunakan software dari Zvarsoft ^_^");
        }

        input.close();
    }

    public void tampilkanMenuUtama() {
        Scanner input = new Scanner(System.in);
        

            System.out.println("Aplikasi untuk menghitung fungsi bangun datar dan ruang");
            System.out.println("Menu :");
            System.out.println("1. Menghitung bangun datar");
            System.out.println("2. Menghitung bangun ruang");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda : ");
            byte pilihan = input.nextByte();
            System.out.println("");

            if (pilihan == 1) {
                tampilkanMenuBangunDatar();
            } else if (pilihan == 2) {
                tampilkanMenuBangunRuang();
            } else {
                System.out.println("Terima kasih telah menggunakan software dari Zvarsoft ^_^");
                System.exit(0);
            }
        
    }

    public void tampilkanMenuBangunDatar() {
        Scanner input = new Scanner(System.in);
        byte pilihanSubMenu = 0;

            System.out.println("Aplikasi untuk menghitung luas dan keliling persegi panjang");
            System.out.println("Menu :");
            System.out.println("1. Menghitung Luas");
            System.out.println("2. Menghitung Keliling");
            System.out.println("0. Kembali ke menu utama");
            System.out.print("Masukkan pilihan Anda : ");
            pilihanSubMenu = input.nextByte();
            System.out.println("");

            switch (pilihanSubMenu) {
                case 1:
                    hitungLuasPersegiPanjang();
                    break;
                case 2:
                    hitungKelilingPersegiPanjang();
                    break;
            }
    }

    public void tampilkanMenuBangunRuang() {
        Scanner input = new Scanner(System.in);
        byte pilihanSubMenu = 0;

            System.out.println("Aplikasi untuk menghitung luas permukaan dan volume balok");
            System.out.println("Menu :");
            System.out.println("1. Menghitung Luas permukaan");
            System.out.println("2. Menghitung volume");
            System.out.println("0. Kembali ke menu awal");
            System.out.print("Masukkan pilihan Anda : ");
            pilihanSubMenu = input.nextByte();
            System.out.println("");

            switch (pilihanSubMenu) {
                case 1:
                    hitungLuasPermukaanBalok();
                    break;
                case 2:
                    hitungVolumeBalok();
                    break;
            }
    }

    public void hitungLuasPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memilih menghitung luas persegi panjang");
        System.out.print("Masukkan panjang (m) = ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (m) = ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.printf("Luas persegi panjang = %.2f meter persegi \n", luas);
    }

    public void hitungKelilingPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memilih menghitung keliling persegi panjang");
        System.out.print("Masukkan panjang (m) = ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (m) = ");
        double lebar = input.nextDouble();

        double keliling = 2 * (panjang + lebar);
        System.out.printf("Keliling persegi panjang = %.2f m \n", keliling);
    }

    public void hitungLuasPermukaanBalok() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memilih menghitung luas permukaan balok");
        System.out.print("Masukkan panjang (m) = ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (m) = ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tingi (m) = ");
        double tinggi = input.nextDouble();

        double luasPermukaan = 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
        System.out.printf("Luas balok = %.2f meter persegi \n", luasPermukaan);
    }

    public void hitungVolumeBalok() {
        Scanner input = new Scanner(System.in);
        System.out.println("Anda memilih menghitung volume balok");
        System.out.print("Masukkan panjang (m) = ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar (m) = ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tingi (m) = ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        System.out.printf("Volume balok = %.2f meter kubik \n", volume);
    }
}
