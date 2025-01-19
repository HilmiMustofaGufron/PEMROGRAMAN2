package models;

import java.util.ArrayList;

public class RentalManager {
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public void removeRental(Rental rental) {
        rentals.remove(rental);
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }
}