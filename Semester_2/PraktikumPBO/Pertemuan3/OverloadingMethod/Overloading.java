package Semester_2.PraktikumPBO.Pertemuan3.OverloadingMethod;
import java.util.*;
public class Overloading{
    public static void hitungLuas(int a, int b){ 
        int nilai = a*b;
        System.out.println("Maka hasil luas : " + nilai);
    }

    public static void hitungLuas(double a, double b){
        double nilai = a * b;
        System.out.println("Maka hasil luas : " + nilai); //menambahkan print langsung ke dalam method
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("Masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();

        hitungLuas(integer1, integer2);

        System.out.print("Masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("Masukkan nilai double 2 : ");
        double double2 = in.nextDouble();

        hitungLuas(double1, double2); //melakukan pemanggilan method

        in.close();
    }
}
