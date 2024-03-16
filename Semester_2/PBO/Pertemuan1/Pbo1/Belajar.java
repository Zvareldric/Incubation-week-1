package Semester_2.PBO.Pertemuan1.Pbo1;

public class Belajar {
    public static void main(String[] args) {
        //instansiasi
        Mobil mb1 = new Mobil();
        System.out.println(mb1.pabrikan);
        // mb1.pabrikan = "Toyota";
        mb1.setPabrikan("Hyundai");
        System.out.println(mb1.pabrikan);

        Mobil mb2 = new Mobil();
        System.out.println(mb2.pabrikan);
        mb2.setPabrikan("Wuling");
        System.out.println(mb2.pabrikan);
    }
}
