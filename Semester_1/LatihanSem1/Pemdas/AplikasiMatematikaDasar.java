package Pemdas;
import java.util.Scanner;
import java.util.Random;
public class AplikasiMatematikaDasar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        byte pilihan;
        int  hasil, bilangan1, bilangan2, inputHasil;

        bilangan1 = random.nextInt(100) + 1;
        bilangan2 = random.nextInt(100) + 1;
        
        System.out.println("Aplikasi matematika dasar \nMenu:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = input.nextByte();

        
        if((pilihan <= 2) && (pilihan >= 0)){
           switch (pilihan){
                case 1 :
                    System.out.println("Anda akan menghitung penjumlahan");
                    System.out.println("Bilangan 1 = " + bilangan1);
                    System.out.println("Bilangan 2 = " + bilangan2);
                    System.out.print("Bilagan 1 + Bilangan 2 = " );
                    inputHasil = input.nextInt();

                    hasil = bilangan1 + bilangan2;
                    if(hasil == inputHasil){
                        System.out.println("Benar!");
                    } else{
                        System.out.println("Salah!");
                        System.out.println("Jawaban yang benar = " + hasil);
                    }
                break;
                case 2 :
                    System.out.println("Anda akan menghitung penjumlahan");
                    System.out.println("Bilangan 1 = " + bilangan1);
                    System.out.println("Bilangan 2 = " + bilangan2);
                    System.out.print("Bilagan 1 - Bilangan 2 = " );
                    inputHasil = input.nextInt();

                    hasil = bilangan1 - bilangan2;
                    if(hasil == inputHasil){
                        System.out.println("Benar!");
                    } else{
                        System.out.println("Salah!");
                        System.out.println("Jawaban yang benar = " + hasil);
                    }
                break;
                case 0 : 
                    System.out.println("Anda telah keluar dari program");
                    System.exit(0);
                break;
                
            }
               
        } else{
            System.exit(0);

        }
    System.out.println("Terima kasih telah brkunjung");
    }

}
