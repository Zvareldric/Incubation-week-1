package Semester_2.PBO.Pertemuan2.Tugas2;

public class MainKeretaApi {
    public static void main(String[] args) {
        //Instansiasi objek dari constructor nilai default
        KeretaApi kereta1 = new KeretaApi();
        //Instansiasi objek dari constructor overload pertama
        KeretaApi kereta2 = new KeretaApi("Parahyangan");
        //Instansiasi objek dari constructor overload kedua
        KeretaApi kereta3 = new KeretaApi("Parahyangan","Bandung");
        //Instansiasi objek dari constructor overload ketiga
        KeretaApi kereta4 = new KeretaApi("Parahyangan","Bandung","Eksekutif");
        //Memanggil method dari kelas KeretaApi
        kereta3.menampilkanInformasi();
    }
        
}
