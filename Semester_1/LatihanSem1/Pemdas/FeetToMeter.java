package Pemdas;
import java.util.Scanner;

public class FeetToMeter {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double feet, meter;
        boolean cekInput = true;
        System.out.print("Masukkan nilai feet: ");
        feet = input.nextDouble();

        cekInput = (feet >= 0);
        
        if(cekInput){
        meter = feet * 0.305;
        System.out.println("Feet jika dikonversi menjadi meter menjadi: " + meter);
        }
    }
    
}
