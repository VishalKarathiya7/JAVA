package abstractfactory.Manufacture;

import abstractfactory.bike.Bike;
import abstractfactory.bike.TataBike;
import abstractfactory.car.Car;
import abstractfactory.car.TataCar;
import abstractfactory.cycle.Cycle;
import abstractfactory.cycle.TataCycle;

public class TataVehicleFactory implements VehicleFactory{
    @Override
    public Car makeCar() {
        return new TataCar();
    }

    @Override
    public Bike makeBike() {
        return new TataBike();
    }

    @Override
    public Cycle makeCycle() {
        return new TataCycle();
    }
}
