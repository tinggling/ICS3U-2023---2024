package lesson5;

import java.util.Scanner;

public class ExampleThree {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("please enter a temp in faharenheit: ");
       int fahrenheit = in.nextInt();

       double celcius = (double)(fahrenheit - 32) * 5 / 9;

       System.out.println("the temp in Celcius is " + celcius);
    }
}
