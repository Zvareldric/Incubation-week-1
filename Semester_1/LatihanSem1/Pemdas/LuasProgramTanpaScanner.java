package Pemdas;
public class LuasProgramTanpaScanner{
    public static void main (String[] args){

        double sisiAtas, sisiBawah, tinggi, luas;
        
        sisiAtas = 3;
        sisiBawah =4;
        tinggi = 3;
        
        luas = ((sisiAtas + sisiBawah) * tinggi) / 2;
        System.out.print("Luas Trapesium dengan sisi sejajar " + sisiAtas + 
                         " dan " + sisiBawah  + ", serta memiliki tinggi " + tinggi + " adalah " + luas);
    }
     
}