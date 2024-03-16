package Pemdas;
import java.io.IOException;
import java.util.*;
public class ProgramTrapesiumSwitch {
    public static void main (String[] args) throws IOException{
      Scanner input = new Scanner(System.in);
      
      double luas, keliling, atas, bawah, kanan, kiri, tinggi;
      int pilihan;

        System.out.println("Program menghitung luas dan keliling trapesium (pilih salah satu) Menu: ");
        System.out.println("1. Luas trapesium");
        System.out.println("2. Keliling trapesium");
        System.out.println("0. Keluar");
        
        boolean cekInput = true;

        do {
          try{
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();

             switch(pilihan){
                case 0 :
                    System.out.println("Anda berhasil keluar dari program");
                    System.exit(0);
                break;

                case 1 :
                    System.out.println("Anda akan menghitung Luas Trapesium : ");
                    do{
                        System.out.print("Masukkan sisi atas = ");
                        if(input.hasNextDouble()){
                           atas = input.nextDouble();
                           System.out.print("Masukkan sisi bawah = ");
                           if(input.hasNextDouble()){
                              bawah = input.nextDouble();
                              System.out.print("Masukkan tinggi = ");
                              if(input.hasNextDouble()){
                                 tinggi = input.nextDouble();
                                    if(atas >= 0 && bawah >= 0 && tinggi >= 0){
                                        luas = ((atas + bawah) * tinggi) / 2;
                                        System.out.println("Luas Trapesium adalah = " + luas);
                                    break;
                                    } else {
                                        System.out.println("Error : Anda harus memasukkan angka positif");
                                    }
                                } else{
                                    System.out.println("Anda harus memasukkan angka");
                                    input.next();
                                }
                            } else{
                                System.out.println("Anda harus memasukkan angka");
                                input.next();
                            }
                        } else{
                           System.out.println("Anda harus memasukkan angka");
                           input.next();
                        }
                    } while (true);
                break;
                case 2 : 
                    System.out.println("Anda akan menghitung Keliling Trapesium");
                    do {
                        System.out.print("Masukkan sisi kiri = ");
                        if(input.hasNextDouble()){
                            kiri = input.nextDouble();
                            System.out.print("Masukkan sisi atas = ");
                            if(input.hasNextDouble()){
                                atas = input.nextDouble();
                                System.out.print("Masukkan sisi kanan = ");
                                if(input.hasNextDouble()){
                                    kanan = input.nextDouble();
                                    System.out.print("Masukkan sisi bawah = ");
                                    if(input.hasNextDouble()){
                                    bawah = input.nextDouble();
                                        if(kiri >= 0 && atas >= 0 && kanan >= 0 && bawah >= 0){
                                            keliling = kiri + atas + kanan + bawah;
                                            System.out.println("Keliling trapesium = " + keliling);
                                        break;
                                        } else {
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
                        } else{
                            System.out.println("Error : Anda harus memasukkan angka");
                            input.next();
                        }         
                    }while(true);
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

        }while(!cekInput);

    System.out.println("Terima kasih telah menggunakan software dari ZVARSoft ^_^");
    }
}
