package Semester_2.PBO.Pertemuan2.Construktor;

class Siswa {
    Siswa(String nama){
        System.out.println("Siswa : " + nama);
    }    

    public static void main(String[] args) {
        //Cetak "Siswa : Dodi"
        new Siswa("Dodi");
    }
}
