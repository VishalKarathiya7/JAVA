package abstractfactory.Manufacture;

import abstractfactory.bike.Bike;
import abstractfactory.bike.HyundaiBike;
import abstractfactory.car.Car;
import abstractfactory.car.HyundaiCar;
import abstractfactory.cycle.Cycle;
import abstractfactory.cycle.HyundaiCycle;

public class HyundaiVehicleFactory implements VehicleFactory{
    @Override
    public Car makeCar() {
        return new HyundaiCar();
    }

    @Override
    public Bike makeBike() {
        return new HyundaiBike();
    }

    @Override
    public Cycle makeCycle() {
        return new HyundaiCycle();
    }
}
