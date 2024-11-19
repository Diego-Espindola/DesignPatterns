package example.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
        luxuryVehicleFactory.createCar();
        System.out.println(luxuryVehicleFactory);
    }
}
