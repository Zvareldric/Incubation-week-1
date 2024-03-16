package Pemdas.LatihanUAS;

import java.util.Scanner;

public class Coba4 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        for (int i = 0; i < 5 ;) {
            i++;
            System.out.println(i);
        }
        System.out.println();
        // for (int i = 0; i < 5; i++) {
        //     i--;  // tak hingga
        //     System.out.println(i);
        // }

        System.out.println();

        int sum = 0;
        for (int i = 4; i <= 13; i+=3) {
            sum += i;
            System.out.println(sum);
        }

        // int number, sum =  0, count;
        // for (count = 0; count < 5; count++) {
        //     number = in.nextInt();
        //     sum += number;

        //     System.out.println("sum = " + sum);
        //     System.out.println("count = " + count);
        // }
        // System.out.println("Final sum & count");
        // System.out.println("sum = " + sum);
        // System.out.println("count = " + count);

        System.out.println();
        int jml = 0, counter = 5;
        while (counter < 10) {
            counter++;
            if(counter % 2 == 0){
                jml += counter;
                System.out.println("jml = jml + counter = " + jml);
            } else{
                jml -= counter;
                System.out.println("jml = jml - counter = " + jml);
            }
        }
        System.out.println(jml);
    }

    static int aMethod (String x, int y){
        return y;
    }
}
 