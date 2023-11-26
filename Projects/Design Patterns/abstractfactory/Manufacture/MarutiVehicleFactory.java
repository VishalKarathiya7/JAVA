package abstractfactory.Manufacture;

import abstractfactory.bike.Bike;
import abstractfactory.bike.MarutiBike;
import abstractfactory.car.Car;
import abstractfactory.car.MarutiCar;
import abstractfactory.cycle.Cycle;
import abstractfactory.cycle.MarutiCycle;

public class MarutiVehicleFactory implements VehicleFactory{
    @Override
    public Car makeCar() {
        return new MarutiCar();
    }

    @Override
    public Bike makeBike() {
        return new MarutiBike();
    }

    @Override
    public Cycle makeCycle() {
        return new MarutiCycle();
    }
}
