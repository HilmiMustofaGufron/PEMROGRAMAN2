package models;

public class Car {
    private String plateNumber;
    private String type;
    private String color;
    private int pricePerDay;
    private boolean rented;

    public Car(String plateNumber, String type, String color, int pricePerDay) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.color = color;
        this.pricePerDay = pricePerDay;
        this.rented = false;
    }

    // Getters and Setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public int getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}