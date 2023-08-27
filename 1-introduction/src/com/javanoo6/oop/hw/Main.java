package com.javanoo6.oop.hw;

public class Main {
    public static void main(String[] args) {
        var roomOne = new Room(false);
        var roomTwo = new Room(true);
        var rooms = new Room[]{roomOne, roomTwo};

        var aptOne = new Apartment(1, rooms);
        var aptTwo = new Apartment(2, rooms);
        var aptTree = new Apartment(3, rooms);
        var aptFour = new Apartment(4, rooms);
        var aptFloorOne = new Apartment[]{aptOne, aptTwo};
        var aptFloorTwo = new Apartment[]{aptTree, aptFour};

        var floorOne = new Floor(1, aptFloorOne);
        var floorTwo = new Floor(2, aptFloorTwo);
        var floors = new Floor[]{floorOne, floorTwo};

        var apartmentBuilding = new ApartmentBuilding(1, floors);
        apartmentBuilding.print();
    }
}
