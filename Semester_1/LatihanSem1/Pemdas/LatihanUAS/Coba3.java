package Pemdas.LatihanUAS;

public class Coba3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.print("ini adalah i++ = "+sum+"\n");
        }

        int sum2 = 0;
        System.out.println("/////////////////////////////////");
        for (int i = 0; i < 10; ++i) {
             sum2+= i;
            System.out.print("ini adalah ++i = "+sum2+"\n");
        }
        //notasi = (3 + 4 * x) / 5 - 10 * (y-5)*(a+b+c)/x + 9* (4/x + (9+x)/y)

        boolean[] data = new boolean[5];
        System.out.println(data[2]);
    }
}
