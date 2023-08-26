package com.javanoo6.oop.hw;

import java.util.Arrays;

public class ApartmentBuilding {
    private int number;
    private Floor[] floors;

    public ApartmentBuilding(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        Arrays.stream(this.getFloors())
                .peek(Floor::print)
                .flatMap(floor -> Arrays.stream(floor.getApartments()))
                .peek(Apartment::print)
                .flatMap(apartment -> Arrays.stream(apartment.getRooms()))
                .forEach(Room::print);
    }
}
