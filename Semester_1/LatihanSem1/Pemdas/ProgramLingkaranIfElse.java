package Pemdas;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ProgramLingkaranIfElse{
    public static void main(String[] args) throws IOException{
    try (Scanner input = new Scanner(System.in)) {
        byte pilihan;
        double radius, luas, keliling;
        boolean cekInput = true;
        
            
            System.out.println("Program menghitung luas dan keliling lingkaran (pilih salah satu)"); 
            System.out.println("Menu:");
            System.out.println("1. Luas lingkaran");
            System.out.println("2. Keliling lingkaran");
            System.out.println("0. Keluar");
                do{
                    try{
                        System.out.print("Masukkan pilihan nomor Anda : ");
                        pilihan = input.nextByte();
                        
                        if(pilihan==1){
                            System.out.println("Anda akan menghitung luas lingkaran");
                            do{
                                System.out.print("Masukkan jari-jari lingkaran(cm) = ");
                                if(input.hasNextDouble()){
                                    radius = input.nextDouble();
                                    if(radius >= 0){
                                        luas = Math.PI * Math.pow(radius, 2);
                                        System.out.println("Luas Lingkaran(cm2) = " + luas);
                                    break;

                                    } else{
                                        System.out.println("Error : Anda harus memasukkan angka positif");
                                    }
                                } else{
                                    System.out.println("Error : Anda harus memasukkan angka");
                                    input.next();
                                }
                            }while(true);
                        break;

                        } else if(pilihan==2){
                            System.out.println("Anda akan menghitung keliling lingkaran");
                            do{
                                System.out.print("Masukkan jari-jari lingkaran(cm) = ");
                                if(input.hasNextDouble()){
                                    radius = input.nextDouble();
                                    if(radius >= 0){
                                        keliling = 2 * Math.PI * radius;
                                        System.out.println("Keliling Lingkaran(cm2) = " + keliling);
                                    break;
                                    
                                    } else
                                     System.out.println("Error : Anda harus memasukkan angka positif");
                                } else{
                                    System.out.println("Error : Anda harus memasukkan angka");
                                    input.next();
                                }    
                            } while(true);  
                        break;
                            
                        }  else if(pilihan==0){
                            System.out.println("Anda telah keluar dari program");
                            System.exit(0);
                            
                        }  else{ 
                            System.out.println("Error : Anda harus memilih 1/2/0");
                            cekInput = false;  
                        }
                            
                    }catch(InputMismatchException e){
                        System.out.println("Error : Anda harus memilih 1/2/0");
                        cekInput = false;
                        input.next();
                    }
                } while(!cekInput);
    }

    System.out.println("Terima kasih telah menggunakan software dari ZVARSoft ^_^");
        
    }
}   