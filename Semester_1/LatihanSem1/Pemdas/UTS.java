package Pemdas;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class UTS {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        int alas, tinggi, luas, jawabanUser, salahBerapa = 0;
        
        alas = rand.nextInt(100) + 1;
        tinggi = rand.nextInt(100) + 1;
    
        System.out.println("Menebak luas jajar genjang");
        System.out.println("Diketahui:");
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);

        do{
            System.out.print("Masukkan jawaban anda untuk luas jajar genjang = ");
            jawabanUser = in.nextInt();
        
            luas = alas * tinggi;

            if(jawabanUser == luas){
                System.out.println("Selamat jawaban anda benar, dengan percobaan " + salahBerapa + "x");
            } else{
                System.out.println("Maaf jawaban anda salah, ulangi");
                salahBerapa++;
            }
    
        }while(jawabanUser != luas);
        System.in.read();
    }
    
}
