package Pemdas;
import java.util.Scanner;
public class Bintang {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // int i=0, j, inputUser;
        // inputUser = input.nextInt();

        // System.out.println(" ");
        
        // for(i = inputUser; i >= 0; i--){
        //     for(j = 0; j <= i; j++){
        //         System.out.print("*");

        //     } 
            
        // }
      pattern2(5);  

    }
    static void pattern1(int n){
        for (int baris = 0; baris < n; baris++) {
            for (int kolom = 0; kolom <= baris; kolom++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int baris = 0; baris <= n; baris++) {
            for (int kolom = 0; kolom < n - baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    static void pattern3(int n){
        for (int baris = 0; baris <= n; baris++) {
            for (int kolom = 0; kolom < baris; kolom++) {
                System.out.print(kolom + " ");
            }
            System.out.println();
            
        }
    }
    static void pattern4(int n){
        for (int baris = 0; baris <= n * 2; baris++) {
            int totalKolomBaris; 
            // totalKolomBaris = baris > n ? 2 * n - baris : baris;
            if(baris>n){
                totalKolomBaris = 2 * n - baris;
            } else{
                totalKolomBaris = baris;
            }
            for (int kolom = 0; kolom < totalKolomBaris; kolom++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        /*   +
         *  +++
         *   +
         */
        for (int baris = 0; baris <= n; baris++) {
            for (int kolom = 0; kolom < baris; kolom++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }

    }
    static void pattern6(int n){
        for (int baris = 0; baris <= n; baris++) {
            for (int spasi = 0; spasi < baris; spasi++) {
                System.out.print(" ");
                
            }
            for (int kolom = n; kolom >= baris; kolom--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        
    }
}

   