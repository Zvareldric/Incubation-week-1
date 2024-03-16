package PraktikumPemdas;
import java.util.*;
public class WamBomPow{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        if(bilangan % 3 == 0 || bilangan % 5 == 0 || bilangan % 7 == 0 ){
            if(bilangan % 3 == 0){
                System.out.print("Wam");
            }
            if(bilangan % 5 == 0){
                System.out.print("Boom");
            }
            if(bilangan % 7 == 0){
                System.out.print("Pow");
            }
        }
    }
}