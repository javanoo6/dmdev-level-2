package com.javanoo6.oop.hw;

public class Apartment {
    private int number;
    private Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("This is apartment number: " + number + " and it has " + rooms.length + " rooms");
    }
}
