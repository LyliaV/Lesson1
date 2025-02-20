package Task3.classBicycle;

import Task3.interfaceVehicle.Vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void getSpeed(int speed) {
        System.out.println("Скорость велосипеда = " + speed);
    }
}
