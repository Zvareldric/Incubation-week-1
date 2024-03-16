package Semester_2.PBO.Pertemuan1.Pbo1;

public class Mobil {
    //Attribute
    public String pabrikan = "Honda";
    public String tipe;
    public String warna = "Putih";

    //Behaviour
    public void setPabrikan(String pabrikan){
        this.pabrikan = pabrikan;
    }

    public void bergerakMaju(int gigi){
        System.out.println("Sekarang maju pakai gigi " + gigi);
    }
    
    public void bergerakMundur(){

    }

    public boolean parkir(){
        return true;
    }
}
