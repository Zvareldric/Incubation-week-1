package Pemdas;

import java.util.Scanner;

public class LatihanMethod {
    
    /**
     * @param args the command line arguments
     * menampilkan menu
     * menampilkan submenu
     * menghitung luas persegi panjang
     * menghitung keliling persegi panjang
     * menghitung luas permukaan balok
     * menghitung volume balok
     */
    static Scanner input;
    public static void main(String[] args) {
        // TODO code application logic here
        input = new Scanner(System.in);
        
        MainMenu();
    }
    
    public static void MainMenu(){
        byte pilihan;
        
        System.out.println("Aplikasi Bangun Datar dan Bangun Ruang");
        System.out.println("Main Menu : ");
        System.out.println("1: Bangun Datar");
        System.out.println("2: Bangun Ruang");
        System.out.println("0: Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pilihan = input.nextByte();
        switch(pilihan){
            case 1:
                menuBangunDatar();
                break;
            case 2:
                menuBangunRuang();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Pilihan Anda tidak tersedia");
        }
    }
    
    public static void menuBangunDatar(){
        byte pilihan;
        boolean isExit = false;
        
        System.out.println("Anda memilih Bangun Datar");
        System.out.println("Menu : ");
        System.out.println("1: Menghitung luas persegi panjang");
        System.out.println("2: Menghitung keliling persegi panjang");
        System.out.println("0: Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pilihan = input.nextByte();
        switch(pilihan){
            case 1:
                System.out.println("Menghitung luas persegi panjang");
                formLuasPersegiPanjang();
                break;
            case 2:
                System.out.println("Menghitung keliling persegi panjang");
                formKelilingPersegiPanjang();
                break;
            case 0:
                isExit = true;
                break;
            default:
                System.out.println("Pilihan Anda tidak tersedia");
        }
    }
    
    public static void menuBangunRuang(){
        byte pilihan;
        boolean isExit = false;
        
        System.out.println("Anda memilih Bangun Ruang");
        System.out.println("Menu : ");
        System.out.println("1: Menghitung Luas permukaan Balok");
        System.out.println("2: Menghitung Volume Balok");
        System.out.println("0: Keluar");
        System.out.print("Masukkan pilihan Anda : ");
        pilihan = input.nextByte();
        switch(pilihan){
            case 1:
                System.out.println("Menghitung Luas permukaan Balok");
                formLuasPermukaanBalok();
                break;
            case 2:
                System.out.println("Menghitung Volume Balok");
                formVolumeBalok();
                break;
            case 0:
                isExit = true;
                break;
            default:
                System.out.println("Pilihan Anda tidak tersedia");
        }
    }
    /*
        fungsi untuk menghitung luas persegi panjang
        fungsi ini memiliki masukkan berupa panjang dan lebar
        luas dihitung dengan rumus panjang x lebar
    */
    
    public static void formLuasPersegiPanjang(){
        double panjang;
        double lebar;
        
        System.out.print("Masukkan panjang = ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar = ");
        lebar = input.nextDouble();
        
        System.out.println("Luas persegi panjang = " + hitungLuasPersegiPanjang(panjang, lebar));
    }

    public static void formKelilingPersegiPanjang(){
        double panjang;
        double lebar;

        System.out.print("Masukkan Panjang = ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar = ");
        lebar = input.nextDouble();

        System.out.println("Keliling Persegi Panjang = " + hitungKelilingPersegiPanjang(panjang, lebar));
    }
    
    public static void formLuasPermukaanBalok(){
        double panjang, lebar, tinggi;

        System.out.print("Masukkan Panjang = ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar = ");
        lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi = ");
        tinggi = input.nextDouble();

        System.out.println("Luas Permukaan Balok = " + hitungLuasPermukaanBalok(panjang, lebar, tinggi));
    }

    public static void formVolumeBalok(){
        double panjang, lebar, tinggi;

        System.out.print("Masukkan Panjang = ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar = ");
        lebar = input.nextDouble();
        System.out.print("Masukkan Tinggi = ");
        tinggi = input.nextDouble();

        System.out.println("Volume Balok = " + hitungVolumeBalok(panjang, lebar, tinggi));
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar){
        double luas = 0;
        
        luas = panjang*lebar;
        return luas;
    }
    
    public static double hitungKelilingPersegiPanjang(double panjang, double lebar){
        double keliling = 0;
        
        keliling = 2*(panjang + lebar);
        return keliling;
    }
    
    public static double hitungLuasPermukaanBalok(double panjang, double lebar, double tinggi){
        double luasPermukaan = 0;
        
        luasPermukaan = 2 * (hitungLuasPersegiPanjang(panjang, lebar) + lebar*tinggi + panjang*tinggi);
        return  luasPermukaan;
    }
            
    public static double hitungVolumeBalok(double panjang, double lebar, double tinggi){
        double volume = 0;
        
        volume = hitungLuasPersegiPanjang(panjang, lebar)*tinggi;
        return volume;
    }
}
