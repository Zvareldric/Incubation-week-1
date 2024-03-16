package Pemdas.LatihanUAS;

public class Coba5 {
    public static void main(String[] args) {
        int array_variable[][] = {{1,2,3}, 
                                {4,5,6},
                                {7,8,9,}};

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + array_variable[i][j];
            }
        }
        System.out.println(sum / 5);

        System.out.println();

        int a = 25;

        if (a % 3 == 0)
            System.out.println("Zero");
        else if (a % 3 == 1)
            System.out.println("One");
        else
            System.out.println("Else");

        System.out.println();
        int[][] items = {{0,1,2,3,4},
                        {4,9,13,0,7},
                        {3,2}};

        // items[1][2] = 99;
        System.out.println(items[2][0]);

        System.out.println();

        int[] data = {10,5,1,7};
        method1(data);
        cetak(data);

        System.out.println("\n");
        int num = 5;
        modify(num);
        System.out.println(num);

        System.out.println();

        int w = 10;
        if (w < 10)
            System.out.println("A");
        System.out.println("B");

        System.out.println();
        int f = 1, g =5 ;
        
        for (; f < g;) 
            System.out.println(f++);

        System.out.println(++f);

        System.out.println();
        int[] arr = {20};
        modifyArr1(arr);
        System.out.println(arr[0]);

        for (int i = 0; i < 10; i++) {
            if (i == 5){
                break;
            }
        }
        System.out.println("End");
    }

    static void method1 (int[] data){
        data[1] = data[2];
        int temp = data[1];
        data[3] = temp;
    }
    static void cetak (int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    static void modify(int no){
        no += 10;
    }
    static void modifyArr1 (int[] arr){
        arr[0] += 10;
    }


}
