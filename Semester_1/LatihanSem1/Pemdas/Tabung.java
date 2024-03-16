package Pemdas;
import java.io.IOException;
import java.util.Scanner;
public class Tabung {

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        boolean cekInput; 

        System.out.print("Masukan jari - jari : ");
        double jariJari = input.nextDouble ();
        System.out.print("Masukan tinggi : ");
        double tinggi = input.nextDouble();

      
        cekInput = (jariJari > 0);
        cekInput = (tinggi > 0);

        if(cekInput){
           double luas = Math.pow(jariJari, 2) * Math.PI;
           double volume = luas*tinggi;
           System.out.println("Volume tabung adalah " + volume);
        }
        
       
        
        
    }
    
}
