package PraktikumPemdas;
import java.util.Scanner;
public class PendapatanDriver {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
 
        int order, pemasukan, insentif, total;
        order = input.nextInt();
        pemasukan = order * 20000;

        if(order <= 3 && order >= 20){
          System.out.println("Pemasukan Driver : " + pemasukan);
          System.out.println("Insentif Driver : 0");
          System.out.println("Total Pendapatan Driver :" + pemasukan);

        } else if(order > 20){
          insentif = (order - 20) * 150000;
          total = pemasukan + insentif;
          System.out.println("Pemasukan Driver : " + pemasukan);
          System.out.println("Insentif Driver : " + insentif);
          System.out.println("Total Pendapatan Driver : " + total); 
          
        } else if(order <= 2){
          System.out.println("Pemasukan Driver : " + pemasukan);
          System.out.println("Insentif Driver : 0");
          System.out.println("Total Pendapatan Driver : " + pemasukan);
          System.out.println("Harus giat lagi ya kerjanya");
        }
    }
}
