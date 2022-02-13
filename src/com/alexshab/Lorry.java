package com.alexshab;

public class Lorry extends Car {
    public int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String brand) {
        super(carClass, engine, driver, brand);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", brand='" + brand + '\'' +
                ", carrying=" + carrying +
                '}';
    }
}