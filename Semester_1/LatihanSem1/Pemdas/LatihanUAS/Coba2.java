package Pemdas.LatihanUAS;

public class Coba2 {
    public static void main(String[] args) {
        aMethod(0);
    }
    static void aMethod(int num){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i == 5){
                System.out.println(i);
                break;
            }
        }
    }
}
