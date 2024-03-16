package Semester_1.LatihanSem1.KlinikKoding;

import java.util.*;
public class camelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        in.close();
    
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))){ // C
                char lower = Character.toLowerCase(input.charAt(i)); // c
                String withSnake = "_" + lower; // _c
                input = input.replace(input.substring(i, i+1), withSnake);
            }           
        }   

        System.out.println(input);
    }
}
