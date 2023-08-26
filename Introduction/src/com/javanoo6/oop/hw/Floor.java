package com.javanoo6.oop.hw;

public class Floor {
    private int number;
    private Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void print() {
        System.out.println("This is: " + number + " floor, which has " + apartments.length + " apartments");
    }
}
