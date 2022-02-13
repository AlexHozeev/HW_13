package com.alexshab;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Marcos Ramirez", "04.11.1987", 10);
        Engine engine = new Engine("Nissan", 149);
        Car car = new Car("Super", engine, driver, "nissan");
        Lorry lorry = new Lorry("Track", engine, driver, "GAZ");
        SportCar sportCar = new SportCar("Speed", engine, driver, "Renault", 260.00);
        System.out.println("Driver:" + driver.getFullName() + ", Age: " + driver.ageDriver());
        System.out.println();
        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
