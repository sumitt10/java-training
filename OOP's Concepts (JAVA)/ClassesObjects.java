class Car {
    String brand;
    String model;

    void startEngine() {
        System.out.println("Engine started");
    }

    void drive() {
        System.out.println("Car is moving");
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";

        System.out.println("My car: " + myCar.brand + " " + myCar.model);
        myCar.startEngine();
        myCar.drive();
    }
}