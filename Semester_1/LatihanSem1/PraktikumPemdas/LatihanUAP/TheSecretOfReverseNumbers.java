package PraktikumPemdas.LatihanUAP;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TheSecretOfReverseNumbers {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String angka = in.next();

        String reverse = reverse(angka);

        int ubahTipeAngka = Integer.parseInt(angka);
        int ubagTipereverse = Integer.parseInt(reverse);
        if (ubahTipeAngka == 196 || angka.equals(reverse)){
            System.out.println("Bilangan dilarang!");
            System.exit(0);
        } else{
            System.out.printf("%d + %d = %d\n", ubahTipeAngka, ubagTipereverse, ubahTipeAngka + ubagTipereverse);
            int result = ubahTipeAngka + ubagTipereverse;
            System.out.printf("%s merupakan bilangan palindrome", result);
        }
    }

    static String reverse(String angka) {
        // Convert the input string to an integer
        int number = Integer.parseInt(angka);
        
        // Reversing the numbera
        int reversedNum = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }

        // Convert the reversed number back to string
        return Integer.parseInt();
    }

}
