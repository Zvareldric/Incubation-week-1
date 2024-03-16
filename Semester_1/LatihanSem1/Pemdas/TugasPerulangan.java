package Pemdas;
import java.util.Scanner;

public class TugasPerulangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pilihanKembali;
        byte pilihan, pilihanSubMenu = 0;
        double panjang;
        double lebar;
        double tinggi;
        double luas;
        double keliling;
        double volume;
        double luasPermukaan;

            do{
                do{
                    System.out.println("Aplikasi untuk menghitung fungsi bangun datar dan ruang");
                    System.out.println("Menu :");
                    System.out.println("1. Menghitung bangun datar");
                    System.out.println("2. Menghitung bangun ruang");
                    System.out.println("0. Keluar");
                    System.out.print("Masukkan pilihan Anda : ");
                    pilihan = input.nextByte();
                    System.out.println("");
                    
                    if(pilihan== 1){
                        
                        System.out.println("Aplikasi untuk menghitung luas dan keliling persegi panjang");
                        System.out.println("Menu :");
                        System.out.println("1. Menghitung Luas");
                        System.out.println("2. Menghitung Keliling");
                        System.out.println("0. Kembali ke menu utama");
                        System.out.print("Masukkan pilihan Anda : ");
                        pilihanSubMenu = input.nextByte();
                        System.out.println("");
                        if (pilihanSubMenu <= 2){
                            switch (pilihanSubMenu){
                                case 1:
                                    System.out.println("Anda memilih menghitung luas persegi panjang");
                                    System.out.print("Masukkan panjang (m) = ");
                                    panjang = input.nextDouble();
                                    System.out.print("Masukkan lebar (m) = ");
                                    lebar = input.nextDouble();
                                    
                                    luas = panjang * lebar;
                                    System.out.printf("Luas persegi panjang = %.2f meter persegi \n",luas);
                                break;
                                case 2:
                                    System.out.println("Anda memilih menghitung keliling persegi panjang");
                                    System.out.print("Masukkan panjang (m) = ");
                                    panjang = input.nextDouble();
                                    System.out.print("Masukkan lebar (m) = ");
                                    lebar = input.nextDouble();
                                    
                                    keliling = 2*(panjang + lebar);
                                    System.out.printf("Keliling persegi panjang = %.2f m \n",keliling);
                                break;
                            }
                        }
                        else{
                            System.out.println("menu pilihan anda tidak tersedia");
                        }     
                        
                    } else if(pilihan == 2){
                        System.out.println("Aplikasi untuk menghitung luas permukaan dan volume balok");
                        System.out.println("Menu :");
                        System.out.println("1. Menghitung Luas permukaan");
                        System.out.println("2. Menghitung volume");
                        System.out.println("0. Kembali ke menu awal");
                        System.out.print("Masukkan pilihan Anda : ");
                        pilihanSubMenu = input.nextByte();
                        System.out.println("");
                        
                        if (pilihanSubMenu <= 2){
                            switch (pilihanSubMenu){
                                case 1:
                                    System.out.println("Anda memilih menghitung luas permukaan balok");
                                    System.out.print("Masukkan panjang (m) = ");
                                    panjang = input.nextDouble();
                                    System.out.print("Masukkan lebar (m) = ");
                                    lebar = input.nextDouble();
                                    System.out.print("Masukkan tingi (m) = ");
                                    tinggi = input.nextDouble();
                                    
                                    luasPermukaan = panjang * lebar * tinggi;
                                    
                                    System.out.printf("Luas balok = %.2f meter kubik \n",luasPermukaan);
                                break;
                                case 2:
                                    System.out.println("Anda memilih menghitung volume balok");
                                    System.out.print("Masukkan panjang (m) = ");
                                    panjang = input.nextDouble();
                                    System.out.print("Masukkan lebar (m) = ");
                                    lebar = input.nextDouble();
                                    System.out.print("Masukkan tinggi (m) = ");
                                    tinggi = input.nextDouble();
                                    
                                    volume = 4*(panjang + lebar * tinggi);
                                    System.out.printf("Keliling balok = %.2f meter kubik \n",volume);
                                break;
                            }
                        }
                        else{
                            System.out.println("menu pilihan anda tidak tersedia");
                        }
                    } else{
                        pilihan = 0;
                        System.out.println("Terima kasih telah menggunakan software dari Zvarsoft ^_^");     
                        System.exit(0);
                    }
        
                }while(pilihanSubMenu == 0);
                System.out.println("");
                System.out.print("Apakah Anda ingin kembali ke menu awal? (y/n): ");
                pilihanKembali = input.next();
                System.out.println("");

            }while(pilihanKembali.equals("y")); 

                if(pilihanKembali.equals("n")){
                    System.out.println("Terima kasih telah menggunakan software dari Zvarsoft ^_^"); 
                }

        input.close();
    }
    
}
