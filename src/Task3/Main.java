package Task3;

import Task3.classBicycle.Bicycle;
import Task3.classCar.Car;

class Main {
    public static void main(String[] args) {
        Car Car = new Car();
        Car.getSpeed(123);

        Bicycle Bicycle = new Bicycle();
        Bicycle.getSpeed(40);
    }
}