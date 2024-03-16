package PraktikumPemdas;
import java.util.Scanner;
public class KalkulatorBmi {

    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
      /*di bawah ini adalah variabel dengan tipe data double
       *karena tinggi badan dan berat badan tidak bilangan bulat
       */
       double tinggiBadan, beratBadan, bmi;
      /*user menginput dengan line pertama adalah tinggi badan
       *dan dan line kedua berat badan
       */
       tinggiBadan = input.nextDouble();
       beratBadan = input.nextDouble();
      /*di bawah ini adalah rumus BMI karena user menginput tinggi badan
       *dengan satuan cm, dan rumus BMI harus mengubah tinggi badan dari centimeters ke meters
       *dengan cara dibagi dengan 10000 karena setelah tinggi badan dipangkatkan 2
       */
       bmi = beratBadan / (Math.pow(tinggiBadan, 2 ) / 10000);
       
       //di bawah ini adalah percabangan untuk menentukan BMI user setelah di compute dengan rumus
       if(bmi <= 18.5){
         System.out.println("Kurang berat badan");
       /*jika hasil compute adalah kurang dari sama denngan 18.5, 
        *itu akan menghasilkan output Kurang berat badan
        */
       
      } else if(bmi >= 18.6 && bmi <= 22.9){
         System.out.println("Normal"); 
       /*Jika hasil compute adalah kurang lebih dari sama dengan 18.6 dan kurang dari sama dengan 22.9,
        * itu akan menghasilkan output BMI Normal
        */
       
       } else if(bmi >= 23 && bmi <= 24.9){
         System.out.println("Kelebihan berat badan"); 
       /*Jika hasil compute adalah kurang lebih dari sama dengan 23 dan kurang dari sama dengan 24.9,
        * itu akan menghasilkan output BMI Kelebihan berat badan
        */
       
       } else if(bmi >= 25 && bmi <= 29.9){
         System.out.println("Obesitas tingkat 1");
       /*Jika hasil compute adalah kurang lebih dari sama dengan 25 dan kurang dari sama dengan 29.9,
        * itu akan menghasilkan output BMI Obesitas tingkat 1
        */
      
       } else if(bmi >= 30){
         System.out.println("Obesitas tingkat 2");
        /*Jika hasil compute adalah kurang lebih dari sama dengan 30,
        * itu akan menghasilkan output BMI Obesiteas tingat 2
        */
       } 
        
    }
}