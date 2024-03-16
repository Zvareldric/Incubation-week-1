package PraktikumPemdas.SoalUTP;
import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        String nama, operasi;
        short umur;
        int angka1, angka2;
        double hasil = 0.0 ;

        nama = i.nextLine();
        umur = i.nextShort();
        angka1 = i.nextInt();
        i.nextLine();
        operasi = i.nextLine(); //tambah ,kurang, kali, bagi
        angka2 = i.nextInt();

        if(umur > 0 && umur < 130){
            System.out.printf("%s berumur %d tahun. \n", nama, umur);
         
            switch(operasi){
                case "tambah" :
                    hasil = angka1 + angka2;
                break;
                case "kurang" :
                    hasil = angka1 - angka2;
                break;
                case "kali" :
                    hasil = angka1 * angka2;
                break;
                case "bagi" :
                    hasil = (double) angka1 / angka2; 
                break;
                default :
                System.out.println("Operasi tidak valid.");
                System.exit(0);
                break;
            }
            if(hasil % 1 == 0){
                System.out.printf("Hasil dari %d di%s %d adalah %d \n", angka1, operasi, angka2, (int) hasil);
            } else{
                System.out.printf("Hasil dari %d di%s %d adalah %.2f \n", angka1, operasi, angka2, hasil);
            }
        }else
            System.out.println("Tidak valid.");
        
    }
}
