package abstractfactory.Manufacture;

import abstractfactory.bike.Bike;
import abstractfactory.car.Car;
import abstractfactory.cycle.Cycle;

public interface VehicleFactory {
    public Car makeCar();
    public Bike makeBike();
    public Cycle makeCycle();
}
