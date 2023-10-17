package lesson1;

public class CarSim {
    public static void main(String[] args) {
        Car Ting = new Car ("bugati","model 100",2030, 1000.30);

        Ting.drive(100);

        Car Cat = new Car ("Jeep", "model 200", 3040, 2793);

        Cat.printCarInfo();
    }
}
