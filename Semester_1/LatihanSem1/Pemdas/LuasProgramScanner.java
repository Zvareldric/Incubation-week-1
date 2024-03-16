package Pemdas;
import java.util.Scanner;

public class LuasProgramScanner {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        double sisiAtas, sisiBawah, tinggi, luas;
        
            System.out.print("Masukan Sisi Atas = ");
            sisiAtas = input.nextDouble();
            System.out.print("Masukan Sisi Bawah = ");
            sisiBawah = input.nextDouble();
            System.out.print("Masukan Tinggi = ");
            tinggi = input.nextDouble();
        
            luas = ((sisiAtas + sisiBawah) * tinggi) / 2;
            System.out.printf("Luas Trapesium yang memiliki sisi sejajar " + sisiAtas + " dan " + sisiBawah + 
                               ", serta memiliki tinggi " + tinggi + " adalah" + luas);                  
    }
}