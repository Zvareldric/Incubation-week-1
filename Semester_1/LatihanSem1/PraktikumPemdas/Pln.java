package PraktikumPemdas;
import java.util.Scanner;
public class Pln {
   
    public static void main(String[] args){
        Scanner masukan = new Scanner(System.in);
        
        String nama, kelurahan;
        int awalKwh, akhirKwh, tarif, pemakaian, tarifLisrtik, ppj, persentase, totalBayar;
        
        nama = masukan.nextLine();
        kelurahan = masukan.nextLine();
        awalKwh = masukan.nextInt();
        akhirKwh = masukan.nextInt();
        tarif = masukan.nextInt();
        persentase = masukan.nextInt();
            

            pemakaian = akhirKwh - awalKwh; 
            tarifLisrtik = pemakaian * tarif;
            ppj = (tarifLisrtik * persentase) / 100;  
            totalBayar = tarifLisrtik + ppj;
            
            System.out.println("==================== PLN Java ===================="); 
            System.out.println("Nama : " + nama);
            System.out.println("Kelurahan : " + kelurahan);
            System.out.println("Pemakaian bulan ini : " + pemakaian + " Kwh Meter");
            System.out.println("Tarif Listrik : Rp " + tarifLisrtik + ",-");
            System.out.println("PPJ " + persentase + "% : Rp " + ppj + ",-");
            System.out.println("Total Bayar : Rp " + totalBayar + ",-");
            System.out.println("==================================================");
    }
}
