package Task3.classCar;

import Task3.interfaceVehicle.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void getSpeed(int speed) {
        System.out.println("Скорость машины = " + speed);
    }

}
