package lesson1.lesson2;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "TING";

        int Length = s1.length();
        System.out.println(Length);
        System.out.println(s1.length());

        int index = s1.indexOf("ING");
        System.out.println("the index of ING in s1 is:" + index);
        System.out.println("the index of ING in s1 is:" + s1.indexOf("Cat"));

        String subString1 = s1.substring(0, 3);
        String subString2 = s1.substring(1); 

        System.out.println(subString1);
        System.out.println(subString2);
        System.out.println("desk".length());
        
    }
}
