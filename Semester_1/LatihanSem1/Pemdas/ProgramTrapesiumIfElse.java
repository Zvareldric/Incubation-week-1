package Pemdas;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ProgramTrapesiumIfElse {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        double tinggi, a, b, kiri, kanan, luas, keliling;
        boolean cekInput = true;
        
        
        System.out.println("Program menghitung luas dan keliling trapesium (pilih salah satu) Menu: ");
        System.out.println("1. Luas trapesium");
        System.out.println("2. Keliling trapesium");
        System.out.println("0. Keluar");

            do{
                try{
                    System.out.print("Masukkan pilihan Anda: ");
                    pilihan = input.nextInt();
                    
                        if(pilihan == 1){
                            System.out.println("Anda akan menghitung Luas trapesium");
                            do{
                                System.out.print("Masukkan sisi atas = ");
                                if(input.hasNextDouble()){
                                    a = input.nextDouble();
                                    System.out.print("Masukkan sisi bawah = ");
                                        if(input.hasNextDouble()){
                                            b = input.nextDouble();
                                            System.out.print("Masukkan tinggi = ");
                                                if(input.hasNextDouble()){
                                                    tinggi = input.nextDouble();
                                                        if(a >= 0 && b >= 0 && tinggi >= 0){
                                                            luas = ((a + b) * tinggi) / 2;
                                                            System.out.println("Luas trapesium adalah = " + luas );
                                                        break;
                                                        } else{
                                                            System.out.println("Error : Anda harus memasukkan angka positif");                   
                                                        } 
                                                } else{
                                                    System.out.println("Error : Anda harus memasukkan angka");
                                                    input.next();
                                                }
                                        } else{
                                            System.out.println("Error : Anda harus memasukkan angka");
                                            input.next();
                                        } 
                                } else{
                                    System.out.println("Error : Anda harus memasukkan angka");
                                    input.next();
                                        } 
                            } while(true);            
                            break;

                        } else if(pilihan == 2){
                            System.out.println("Anda akan menghitung Keliling trapesium");
                            do{
                                System.out.print("Masukkan sisi kiri = ");
                                    if(input.hasNextDouble()){
                                        kiri = input.nextDouble();
                                        System.out.print("Masukkan sisi bawah = ");
                                        if(input.hasNextDouble()){
                                            b = input.nextDouble();
                                            System.out.print("Masukkan sisi kanan = ");
                                            if(input.hasNextDouble()){
                                                kanan = input.nextDouble();
                                                System.out.print("Masukkan sisi atas = ");
                                                if(input.hasNextDouble()){
                                                    a = input.nextDouble();

                                                    if(kiri >= 0 && b >= 0 && kanan >= 0 && a >= 0){
                                                        keliling = kiri + b + kanan + a;
                                                        System.out.println("Keliling trapesium adalah = " + keliling);
                                                    break; 
                                                    } else{
                                                        System.out.println("Error : Anda harus memasukkan angka positif");        
                                                        input.next();
                                                    } 
                                                } else{
                                                    System.out.println("Error : Anda harus memasukkan angka");
                                                    input.next();
                                                }    
                                            } else{
                                                System.out.println("Error : Anda harus memasukkan angka");
                                                input.next();
                                            }    
                                        } else{
                                            System.out.println("Error : Anda harus memasukkan angka");
                                            input.next();
                                        }    
                                    } else{
                                        System.out.println("Error : Anda harus memasukkan angka");
                                        input.next();
                                    }    

                            } while (true);
                            break;

                        } else if(pilihan == 0){
                            System.out.println("Anda telah keluar dari program");
                            System.exit(0);
                            
                            
                        } else{
                            System.out.println("Error : Anda harus memilih 1/2/0");
                            cekInput = false;
                        }
                
                }catch(InputMismatchException e){
                    System.out.println("Error : Anda harus memilih 1/2/0");
                        cekInput = false;
                        input.next();
                }

            } while(!cekInput);
         System.out.println("Terima kasih telah menggunakan software dari Zvarsoft ^_^"); 
    }
}
      