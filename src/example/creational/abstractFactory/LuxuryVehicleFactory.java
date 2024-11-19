package example.creational.abstractFactory;

import example.creational.abstractFactory.luxury.CarLuxury;
import example.creational.abstractFactory.luxury.MotorcycleLuxury;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new CarLuxury();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleLuxury();
    }
}
