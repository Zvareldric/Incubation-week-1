package Pemdas;
import java.io.*;
import java.util.*;
public class ProgramLingkaranSwitch {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double radius, luas, keliling;
        byte pilihan;
        boolean cekInput = true;


        System.out.println("Program luas dan keliling lingkaran");
        System.out.println("1. Luas Lingkaran");
        System.out.println("2. Keliling Lingkaran");
        System.out.println("0. Keluar");

        do {
            try{
                System.out.print("Masukkan pilihan nomor Anda : ");
                pilihan = input.nextByte();

                switch(pilihan){
                    case 0 : 
                        System.out.println("Anda telah keluar dari program");
                        System.exit(0);
                    
                    case 1 : 
                        System.out.println("Anda akan menghitung Luas Lingkaran : "); 
                        do{
                            System.out.print("Masukkan jari-jari = ");
                            if (input.hasNextDouble()){
                                radius = input.nextDouble();  
                                if(radius >= 0){
                                    luas = Math.PI * Math.pow(radius, 2); 
                                    System.out.println("Luas Lingkaran adalah = " + luas);
                                break;
                                } else {
                                    System.out.println("Error : Anda harus memasukkan angka positif");
                                }
                            } else {
                                System.out.println("Error : Anda harus memasukkan angka");
                                input.next();
                            }
                     } while (true);
                    break;
                    case 2 : 
                        System.out.println("Anda akan menghitung Keliling Lingkaran : ");
                        do{  
                            System.out.print("Masukkan Jari-jari = ");
                            if(input.hasNextDouble()){
                                radius = input.nextDouble();
                                if(radius >= 0){
                                    keliling = 2 * Math.PI * radius;
                                    System.out.println("Keliling lingkaran adalah = " + keliling);
                                break;
                                } else {
                                    System.out.println("Error : Anda harus memasukkan angka positif");
                                }
                            } else {
                                System.out.println("Error : Anda harus memasukkan angka");
                                input.next();
                            }
                     } while (true);
                    break;
                    default : 
                        System.out.println("Error : Anda harus memilih 1/2/0");
                        cekInput = false;
                    break;
                }
            } catch (InputMismatchException e){
                System.out.println("Error : Anda harus memilih 1/2/0");
                cekInput = false;
                input.next();
            }
        } while(!cekInput);
    System.out.println("Terima kasih telah menggunakan software dari ZVARSoft ^_^");
    }
    
}
    