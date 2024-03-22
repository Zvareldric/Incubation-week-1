package Semester_2.PraktikumPBO.Pertemuan3.OverloadingConstructor;

public class Lingkaran {
    int alas, tinggi;
    String strAlas,strTinggi; //Membuat atribut baru dengan tipe data String

    public Lingkaran(int alas){
        this.alas = alas;
    }

    public Lingkaran(int alas, int tinggi){
        this.alas = alas;
        this.tinggi =tinggi;
    }

    //soal no 3
    public Lingkaran(String alas, String tinggi){  //Constructor untuk alas dan tinggi dengan tipe data String
        this.strAlas = alas;
        this.strTinggi= tinggi;
        parsingStringToInteger(alas, tinggi); //pemaggilan method parsing untuk merubang dari String ke integer
    }

    public void parsingStringToInteger(String alas, String tinggi) { //method untuk mengubah String ke integer
        this.alas = Integer.parseInt(alas); 
        this.tinggi = Integer.parseInt(tinggi);
    }

    public void setAlas(int alas){
        this.alas = alas;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public int getAlas(){
        return alas;
    }

    public int getTinggi(){
        return tinggi;
    }

    public double hitungLuas(){
        double hasil = (double)(getTinggi() * getAlas())/2;
        return hasil;
    }

    public void displayMessage(){
        System.out.println("Hitung luas : " + hitungLuas());
    }
}
