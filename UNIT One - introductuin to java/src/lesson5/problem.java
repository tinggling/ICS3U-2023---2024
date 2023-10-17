package lesson5;

public class problem {
    public static void main(String[] args) {
        int length = 20;
        int shallowLength = 5;
        int transition = 7;
        int shallowHeight = 3;
        int deepHeight = 8;
        int Width = 8;

        int linerCost = 2;

        double P = (length + length + Width + Width);

        double V1 = (shallowLength*deepHeight*Width);

        double V2 = (15*shallowHeight*Width);

        System.out.println(V1);
        System.out.println(V2);
        System.out.println(P);
    }
}
