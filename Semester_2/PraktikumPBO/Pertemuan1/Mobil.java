package Semester_2.PraktikumPBO.Pertemuan1;

public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s){
        noPlat = s;
    }
    public void setWarna(String s){
        warna = s;
    }
    public void setManufaktur(String s){
        manufaktur = s;
    }
    public void setKecepatan(int i){
        kecepatan = i;
    }
    public void setWaktu(double d){
//        waktu = d;
        rubahSecond(d);
    }
    public void rubahSecond (double d){
        waktu = d * 60 * 60;
    }
        
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna "+ warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("dengan waktu " + (int)waktu + " detik");
    }
     
}
