package models;

import java.util.ArrayList;

public class CarManager {
    private final ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public ArrayList<Car> getAvailableCars() {
        ArrayList<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isRented()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public Car findCarByPlateNumber(String plateNumber) {
        for (Car car : cars) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        return null;
    }

    public void updateCarStatus(String plateNumber, boolean rented) {
        Car car = findCarByPlateNumber(plateNumber);
        if (car != null) {
            car.setRented(rented);
        }
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}