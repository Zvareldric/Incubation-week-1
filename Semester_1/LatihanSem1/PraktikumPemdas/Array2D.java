package PraktikumPemdas;

public class Array2D {
    public static void main(String[] args) {

        // Cara pertama           // 3 menunjukkan baris // 4 menunjukkan kolom
        // int[][] angka = new int[3][4];
        // angka[0][0] = 80;
        // angka[0][1] = 75; //dst

        // Cara kedua     // Satu kurung kurawal adalah baris // Dan jumlah angka di dalah kurung kurawal adalah kolom
        int[][] angka = {{10, 20, 30, 40}, {11, 12, 13, 14}, {21, 22, 23, 24}}; // Dimulai dari index 0

        System.out.println(angka.length); // panjang baris
        System.out.println(angka[0].length); // panjang kolom

        // cara mengubah data array 2D
        System.out.println("Data sebelum diubah = " + angka[0][1]);
        angka[0][1] = 60;
        System.out.println("Data setelah diubah = " + angka[0][1]);

         
    }
}
