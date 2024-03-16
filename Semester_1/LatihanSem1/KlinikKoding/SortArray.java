package Semester_1.LatihanSem1.KlinikKoding;
import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr [i] = in.nextInt();
        }
        // cara biasa
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        in.close();
        System.out.println(arr[0] + " " + arr[1]);
        // cara mudah
        // Arrays.sort(arr);
        
        // System.out.println(arr[1]-arr[0]);


    }
}
