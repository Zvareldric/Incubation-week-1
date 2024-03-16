package PraktikumPemdas;
import java.util.Scanner;
public class KotakPermen {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
   //Di bawah ini user diminta untuk menginput angka dalam tipe data integer
    int angka = input.nextInt();
   /*Di bawah ini adalah seleksi untuk menentukan hasil output 
    *apa yang keluar sesuai dengan input dari user 
    */
        if(angka % 2 == 0 && angka % 5 == 0){
          System.out.println("Kotak Permen");
          /*jika input angka dibagi 2 dan 5 kemudiam hasil reminder tidak ada sisa,
           *maka akan keluar output Kotak Permen, dan jika hasil reminder salah satu atau keduanya ada sisa,
           *maka akan lanjut ke syarat selanjutnya yang di bawah
           */  
        } else if(angka % 2 == 0){
          System.out.println("Kotak");
          /*Syarat di atas jika angka hanya dan hanya jika angka dibagi dengan 2
           * kemudian hasil reminder tidak ada sisa, maka akan keluar output Kotak
           */
        } else if(angka % 5 ==0){
          System.out.println("Permen");
          /*Syarat di atas jika angka hanya dan hanya jika angka dibagi dengan 5
           * kemudian hasil reminder tidak ada sisa, maka akan keluar output Permen
           */
        } else if (angka % 2 != 0 && angka % 5 != 0){
          System.out.println(angka);
          /*Syarat di atas jika angka input dari user tidak dapat di bagi oleh 2 atau 5,
           *maka akan keluar output angka yang di masukkan user itu sendiri
           */
         }
    }
}
