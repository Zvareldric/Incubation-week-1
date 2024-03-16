package PraktikumPemdas;
import java.util.Scanner;
public class HitungHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hariIni, tambahHari;
        double perhitunganHari; 

        hariIni = input.nextInt();
        tambahHari = input.nextInt();

        if (hariIni < 1 || hariIni > 7) {
            System.out.println("Tidak Valid");
            System.exit(0);
        } 
        perhitunganHari = (hariIni + tambahHari) % 7.0;
        
        if(perhitunganHari == 0 ){
            System.out.println("Minggu");
        } else if(perhitunganHari == 1){
            System.out.println("Senin");
        } else if(perhitunganHari == 2){
            System.out.println("Selasa");
        } else if(perhitunganHari == 3){
            System.out.println("Rabu");
        } else if(perhitunganHari == 4){
            System.out.println("Kamis");
        } else if(perhitunganHari == 5){
            System.out.println("Jumat");
        } else if (perhitunganHari == 6){
            System.out.println("Sabtu");
        } else{
            hariIni = 0;
            System.exit(0);
        }
        
    }
}
