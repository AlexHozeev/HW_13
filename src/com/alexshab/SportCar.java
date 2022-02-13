package com.alexshab;

public class SportCar extends Car {
    public double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String brand) {
        super(carClass, engine, driver, brand);
    }

    public SportCar(String carClass, Engine engine, Driver driver, String brand, double speed) {
        super(carClass, engine, driver, brand);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "sportCar{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
