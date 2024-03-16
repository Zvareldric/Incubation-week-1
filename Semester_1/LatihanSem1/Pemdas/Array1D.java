package Pemdas;

public class Array1D {
    public static void main(String[] args) {
       double [] myList  = new double[10];
       String[] nama = new String[10];
       nama[0] = "rifqi";

       System.out.println("Panjang Array my list = " + myList.length);
       System.out.println(nama[0].length());

       int[] values = new int[5];
       for (int i = 1; i < 5; i++) {
            values[i] = i + values[i-1];
       }
       values[0] = values[4] + values[1];
       System.out.println(values[3]);

       
    }
}
