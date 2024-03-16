package Semester_2.PraktikumPBO.Pertemuan2.Constructor;

import java.util.Scanner;

public class MainStudent{
    public static void main(String[] args) {
        //Soal no 4
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlahSiswa = in.nextInt();
        in.nextLine(); //Buffer

        Student[] siswa = new Student[jumlahSiswa];
        for(int i= 0; i< jumlahSiswa; i++){
            System.out.println("===================");
            System.out.printf("Masukkan siswa ke - %d : \n", (i+1));
            System.out.print("Nama: ");
            String name = in.nextLine();
            System.out.print("Alamat: ");
            String address = in.nextLine();
            System.out.print("Umur: ");
            short age = in.nextShort();
            in.nextLine(); //Buffer

            System.out.print("Masukkan nilai Math : ");
            double nilaiMath = in.nextDouble();
            System.out.print("Masukkan nilai English : ");
            double nilaiEnglish = in.nextDouble();
            System.out.print("Masukkan nilai Science : ");
            double nilaiScience = in.nextDouble();
            in.nextLine(); //Buffer
            
            //Menyimpan ke dalam array
            siswa[i] = new Student(name, address, age, nilaiMath, nilaiEnglish, nilaiScience);

        }

        // Menampilkan data siswa
        for (int i = 0; i < jumlahSiswa; i++) {  
            System.out.println("===================");
            System.out.printf("Data siswa ke - %d : \n", i+1);
            siswa[i].displayMessage();

            //menampilkan jumlah objek
            if ((i+1)==jumlahSiswa) {
                siswa[i].jumlahObjek(i+1);
            }
        }

        in.close();
    }
    
    // // Student anna = new Student();
    // //objek untuk menentukan nilai
    // Student anna = new Student(10,20,30);
    // anna.setName("Anna");
    // anna.setAddress("Malang");
    // anna.setAge(20);
    // // anna.setMath(100);
    // // anna.setScience(89);
    // // anna.setEnglish(80);
    
    // anna.displayMessage();
    
    // //menggunakan constructor lain
    // System.out.println("===================");
    // Student chris = new Student("Chris", "Kediri", 21);
    // chris.setMath(70);
    // chris.setScience(60);
    // chris.setEnglish(90);
    // chris.displayMessage();

    // //siswa dengan nama anna dirubah informasi alamat danumurnya melalui constructor
    // System.out.println("===================");
    // anna = new Student("anna", "Batu", 18);
    // anna.displayMessage();
    // //siswa denagan nama chris dirubah informasi alamat danumurnya melalui method
    // System.out.println("===================");
    // chris.setAddress("Surabaya");
    // chris.setAge(22);
    // chris.displayMessage();

}