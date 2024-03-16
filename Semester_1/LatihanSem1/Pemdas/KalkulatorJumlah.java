package Pemdas;
import java.util.*;
public class KalkulatorJumlah{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int bilangan1, bilangan2, hasil, hasilUser, count = 0;
        boolean cek;

        bilangan1 = random.nextInt(10);
        bilangan2 = random.nextInt(10);
        hasil = bilangan1 + bilangan2;

        System.out.println("Matematika Dasar");
        do{
        System.out.println("Bilangan pertama = " + bilangan1);
        System.out.println("Bilangan kedua = " + bilangan2);
        System.out.print("Bilangan pertama + Bilangan kedua = ");
        hasilUser = input.nextInt(); 
        cek = ((bilangan1+bilangan2) == hasilUser);
            if(cek == false){
                System.out.println("jawaban Anda salah, ulangi jawaban Anda");
            } else{
                System.out.println("Selamat jawaban Anda benar setelah " + count + "x mencoba");
            } 
            count++;
            
        }while(cek == false);
    }
}