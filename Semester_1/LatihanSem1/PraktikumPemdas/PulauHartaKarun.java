package PraktikumPemdas;
import java.util.Scanner;

public class PulauHartaKarun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = "Kapten Jarjit Singh harus berjalan ke arah ";


        switch(input.charAt(0)) {
            case 'U':
                output += "Utara";
                break;
            case 'B':
                output += "Barat";
                break;
            case 'S':
                output += "Selatan";
                break;
            case 'T':
                output += "Timur";
                break;
        }


        output += " sebanyak " + Integer.parseInt(input.substring(1,3)) + " langkah";
        
        if(input.length() == 3) {
            System.out.printf("%s.\n", output);
            sc.close();
            return;
        }
        if(input.length() == 6) {
            output += ", dan ";
        } else {
            output += ", ";
        }


        switch(input.charAt(3)) {
            case 'U':
                output += "Utara";
                break;
            case 'B':
                output += "Barat";
                break;
            case 'S':
                output += "Selatan";
                break;
            case 'T':
                output += "Timur";
                break;    
        }


        output += " sebanyak " + Integer.parseInt(input.substring(4,6)) + " langkah";


        if(input.length() == 6) {
            System.out.printf("%s.\n", output);
            sc.close();
            return;
        }
        if(input.length() == 9) {
            output += ", dan ";
        } else {
            output += ", ";
        }


        switch(input.charAt(6)) {
            case 'U':
                output += "Utara";
                break;
            case 'B':
                output += "Barat";
                break;
            case 'S':
                output += "Selatan";
                break;
            case 'T':
                output += "Timur";
                break;    
        }


        output += " sebanyak " + Integer.parseInt(input.substring(7,9)) + " langkah";


        if(input.length() == 9) {
            System.out.printf("%s.\n", output);
            sc.close();
            return;


        }
        
        output += ", dan ";


        switch(input.charAt(9)) {
            case 'U':
                output += "Utara";
                break;
            case 'B':
                output += "Barat";
                break;
            case 'S':
                output += "Selatan";
                break;
            case 'T':
                output += "Timur";
                break;    
        }
        output += " sebanyak " + Integer.parseInt(input.substring(10,12)) + " langkah.";
        System.out.println(output);


        sc.close();
    }
}