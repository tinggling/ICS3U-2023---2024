package lesson4;

public class exampleTwo {
    public static void main(String[] args) {
       //int x = 6.7;   //cannot assign a double into a int variable

       int x = (int) 6.7;  //double to int is a narrowing cast
        System.out.println(x);


        //syntax Error - anything Java does not understand (gives a red squiggle)

        //logic error - program runs, does ont Crash but gives wrong results

        //runtime Error - when program is running and it crashes 
    }

}
