package Semester_2.PBO.Pertemuan2.Tugas2;

public class KeretaApi {
    private String namaKereta;
    private String tujuan;
    private String kelas;

    //Constructor untuk nilai default
    public KeretaApi(){
        this.namaKereta = "Tidak Ada";
        this.tujuan = "Tidak Ada";
        this.kelas = "Tidak Ada";
    }
    
    //3 Constructor Overloading
    public KeretaApi(String nama){
        this.namaKereta = nama;
    }

    public KeretaApi(String nama, String tujuan){
        this.namaKereta = nama;
        this.tujuan = tujuan;
    }
    public KeretaApi(String nama, String tujuan, String kelas){
        this.namaKereta = nama;
        this.tujuan = tujuan;
        this.kelas = kelas;
    }
    
    //Behaviour
    public void waktuBerjalan(String waktu){
        System.out.println("Waktu Berjalan : " + waktu);
    }

    public void waktuBerhenti(String waktu){
        System.out.println("Waktu Berhenti : " + waktu);
    }

    public void menampilkanInformasi(){
        System.out.println("Nama Kereta : " + namaKereta);
        System.out.println("Tujuan : " + tujuan);
        System.out.println("Kelas : " + kelas);
    }
    
}
