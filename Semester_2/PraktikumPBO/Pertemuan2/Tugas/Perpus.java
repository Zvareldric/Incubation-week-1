package Semester_2.PraktikumPBO.Pertemuan2.Tugas;

public class Perpus {
    private String buku = "Tidak ada";
    private String penulis1 = "Tidak ada";
    private String penulis2 = "Tidak ada";
    private String sinopsis= "Tidak ada";

    //Constructor untuk set tiap instansiasi objek
    public Perpus(String buku, String penulis1, String penulis2, String sinopis){
        this.buku = buku;
        this.penulis1 = penulis1;
        this.penulis2 = penulis2;
        this.sinopsis = sinopis;
    }
    
    //Method menghitung jumlah kata
    public int hitungJumlahKata() {
        String[] splitSinopsis = sinopsis.split("\\S+");
        return splitSinopsis.length;
    }

    //Method cek tingkat kesamaan buku menggunakan objek
    public static int cekTingkatKesamaan(Perpus buku1, Perpus buku2) {
        int kesamaan = 0;
    
        if (buku1.buku.equals(buku2.buku)) kesamaan++;
        if (buku1.penulis1.equals(buku2.penulis1)) kesamaan++;
        if (buku1.penulis2.equals(buku2.penulis2)) kesamaan++;
        if (buku1.sinopsis.equals(buku2.sinopsis)) kesamaan++;
    
        return kesamaan * 100 / 4; 
    }
    
    //Method untuk print out informasi buku
    public void displayInfoBuku(){
        System.out.println("Judul Buku : " + buku);
        System.out.println("Penulis - 1 : " + penulis1);
        System.out.println("Penulis - 2 : " + penulis2);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("Jumlah Kata : " + hitungJumlahKata());
    }
}
