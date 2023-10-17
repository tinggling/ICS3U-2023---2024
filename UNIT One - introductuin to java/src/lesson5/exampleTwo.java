package lesson5;

import java.util.Scanner;

public class exampleTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt the user for a number
        System.out.print("please eneter a number: ");
        int x = in.nextInt();

        System.out.println(x);

        System.out.print("please enter a double: ");
        double y = in.nextDouble();
        System.out.println(y);

    }
}
