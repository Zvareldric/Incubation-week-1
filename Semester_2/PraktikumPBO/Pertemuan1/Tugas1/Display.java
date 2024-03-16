package Semester_2.PraktikumPBO.Pertemuan1.Tugas1;

import java.util.Scanner;

public class Display {
    public void displayMenuAwal(){
        Scanner in = new Scanner(System.in);
        Perpus kategori = new Perpus();

        System.out.println("Pilih :");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi \n");

        System.out.println("Masukkan Pilihan Anda : ");
        short pilihan = in.nextShort(); 
        System.out.println("============================ \n");

        switch (pilihan) {
            case 1:
                System.out.println("Kategori : Teknologi \n");
                kategori.setDisplayBuku(
                    "Algorithms to Live By: The Computer Science of Human Decisions","Brian Christian","Tom Griffiths",
                    "Computer Architecture: A Quantitative Approach", "John L. Hennessy", "David A. Patterson");
                break;
            case 2 :
                System.out.println("Kategori : Filsafat \n");
                kategori.setDisplayBuku(
                    "A History of Western Philosophy","Bertrand Russell","-",
                    "Loving The Wounded Soul", "Regis Machdy", "-");
                break;
            case 3 :
                System.out.println("Kategori : Sejarah \n");
                kategori.setDisplayBuku(
                    "Sejarah Dunia yang Disembunyikan","Jonathan Black","-",
                    "World History Sejarah Dunia Lengkap", "Hutton Webster", "-");
                break;
            case 4 :
                System.out.println("Kategori : Agama \n");
                kategori.setDisplayBuku(
                    "Secrets of Divine Love: Sebuah Perjalanan Spiritual yang Mendalam tentang Islam","A. Helwa","-",
                    "The Miracle of Ikhlas", "Anin DP", "-");
                break;
            case 5 :
                System.out.println("Kategori : Psikologi \n");
                kategori.setDisplayBuku(
                    "The Psychology of Money","Morgan Housel","-",
                    "The Power of Habit", "Charles Duhigg", "-");
                break;
            case 6 :
                System.out.println("Kategori : Politik \n");
                kategori.setDisplayBuku(
                    "Paradoks Demokrasi","Chantal Mouffe","-",
                    "Politik Hukum di Indonesia", "Prof. Dr. Moh. Mahfud MD", "-");
                break;
            case 7 :
                System.out.println("Kategori : Fiksi \n");
                kategori.setDisplayBuku(
                    "Solo Leveling","Chugong","-",
                    "Omniscient Reader's Viewpoint", "Sing Shong", "-");
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
        kategori.displayMessage();
    }
}
