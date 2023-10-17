package lesson5;

import java.util.Scanner;

public class homwork {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
    
        System.out.println("please type number of US dollar");
        int x = in.nextInt();

        double y = ((double) x * 1.35);
        
        System.out.println(y);
    }
}
