package models;

public class Rental {
    private String plateNumber;
    private String type;
    private String color;
    private String customerName;
    private int pricePerDay;
    private String address;
    private String phone;
    private int rentalDays;

    public Rental(String plateNumber, String type, String color, String customerName, int pricePerDay,
                  String address, String phone, int rentalDays) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.color = color;
        this.customerName = customerName;
        this.pricePerDay = pricePerDay;
        this.address = address;
        this.phone = phone;
        this.rentalDays = rentalDays;
    }

    // Getters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getHargaPerHari() {
        return pricePerDay;
    }

    public int getRentalDays() {
        return rentalDays;
    }
}