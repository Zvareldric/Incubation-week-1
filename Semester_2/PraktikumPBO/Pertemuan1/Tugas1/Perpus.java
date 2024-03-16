package Semester_2.PraktikumPBO.Pertemuan1.Tugas1;

public class Perpus {
    private String buku1;
    private String penulis1A;
    private String penulis1B;
    private String buku2;
    private String penulis2A;
    private String penulis2B;

    public void setDisplayBuku(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
        this.buku1 = buku1;
        this.penulis1A = penulis1A;
        this.penulis1B = penulis1B;
        this.buku2 = buku2;
        this.penulis2A = penulis2A;
        this.penulis2B = penulis2B;
    }

    // public void setFilsafat(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
    //     this.buku1 = buku1;
    //     this.penulis1A = penulis1A;
    //     this.penulis1B = penulis1B;
    //     this.buku2 = buku2;
    //     this.penulis2A = penulis2A;
    //     this.penulis2B = penulis2B;
    // }

    // public void setSejarah(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
    //     this.buku1 = buku1;
    //     this.penulis1A = penulis1A;
    //     this.penulis1B = penulis1B;
    //     this.buku2 = buku2;
    //     this.penulis2A = penulis2A;
    //     this.penulis2B = penulis2B;
    // }

    // public void setAgama(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
    //     this.buku1 = buku1;
    //     this.penulis1A = penulis1A;
    //     this.penulis1B = penulis1B;
    //     this.buku2 = buku2;
    //     this.penulis2A = penulis2A;
    //     this.penulis2B = penulis2B;
    // }

    // public void setPsikologi(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
    //     this.buku1 = buku1;
    //     this.penulis1A = penulis1A;
    //     this.penulis1B = penulis1B;
    //     this.buku2 = buku2;
    //     this.penulis2A = penulis2A;
    //     this.penulis2B = penulis2B;
    // }

    // public void setPolitik(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
    //     this.buku1 = buku1;
    //     this.penulis1A = penulis1A;
    //     this.penulis1B = penulis1B;
    //     this.buku2 = buku2;
    //     this.penulis2A = penulis2A;
    //     this.penulis2B = penulis2B;
    // }

    // public void setFiksi(String buku1, String penulis1A, String penulis1B, String buku2, String penulis2A, String penulis2B){
    //     this.buku1 = buku1;
    //     this.penulis1A = penulis1A;
    //     this.penulis1B = penulis1B;
    //     this.buku2 = buku2;
    //     this.penulis2A = penulis2A;
    //     this.penulis2B = penulis2B;
    // }

    public void displayMessage(){
        System.out.println("Judul Buku : " + buku1);
        System.out.println("Penulis - 1 : " + penulis1A);
        System.out.println("Penulis - 2 : " + penulis1B);
        System.out.println();
        System.out.println("Judul Buku : " + buku2);
        System.out.println("Penulis - 1 : " + penulis2A);
        System.out.println("Penulis - 2 : " + penulis2B);
    }
}
