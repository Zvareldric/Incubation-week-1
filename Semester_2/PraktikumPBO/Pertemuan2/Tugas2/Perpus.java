package Semester_2.PraktikumPBO.Pertemuan2.Tugas2;

public class Perpus {
    private String buku1;
    private String penulis1A;
    private String penulis1B;
    private String buku2;
    private String penulis2A;
    private String penulis2B;
    private String sinopsisBuku1;
    private String sinopsisBuku2;
    private int jumlahKataBuku1;
    private int jumlahKataBuku2;
    private double persentaseKesamaan;

    public void setDisplayBuku(String buku1, String penulis1A, String penulis1B, String sinopsisBuku1,
                                String buku2, String penulis2A,String penulis2B, String sinopsisBuku2){
        this.buku1 = buku1;
        this.penulis1A = penulis1A;
        this.penulis1B = penulis1B;
        this.sinopsisBuku1 = sinopsisBuku1;
        this.buku2 = buku2;
        this.penulis2A = penulis2A;
        this.penulis2B = penulis2B;
        this.sinopsisBuku2= sinopsisBuku2;
    }

    // Method untuk menghitung jumlah kata pada sinopsis buku 1
    public void hitungJumlahKataBuku1() {
        String[] splitKataBuku1 = sinopsisBuku1.split(" ");
        jumlahKataBuku1 = splitKataBuku1.length;
        System.out.println("Jumlah Kata : " + jumlahKataBuku1);
    }

    // Method untuk menghitung jumlah kata pada sinopsis buku 2
    public void hitungJumlahKataBuku2() {
        String[] splitKataBuku2 = sinopsisBuku2.split(" ");
        jumlahKataBuku2 = splitKataBuku2.length;
        System.out.println("Jumlah Kata : " + jumlahKataBuku2);
    }
    public void cekPersentaseKesamaan(){
        double poin = 0;

    }
    public void displayMessage(){
        System.out.println("Judul Buku : " + buku1);
        System.out.println("Penulis - 1 : " + penulis1A);
        System.out.println("Penulis - 2 : " + penulis1B);
        System.out.println("Sinopsis : " + sinopsisBuku1);
        System.out.println("Jumlah Kata : " + jumlahKataBuku1);
        System.out.println("============================ \n");
        System.out.println();
        System.out.println("Judul Buku : " + buku2);
        System.out.println("Penulis - 1 : " + penulis2A);
        System.out.println("Penulis - 2 : " + penulis2B);
        System.out.println("Sinopsis : " + sinopsisBuku2);
        System.out.println("Jumlah Kata : " + jumlahKataBuku2);
        System.out.println("Nilai hasil cek kesamaan : " + persentaseKesamaan);
    }
}
