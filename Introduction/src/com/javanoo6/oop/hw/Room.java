package com.javanoo6.oop.hw;

public class Room {
    private boolean isRoomWalkThrough;

    public Room(boolean isRoomWalkThrough) {
        this.isRoomWalkThrough = isRoomWalkThrough;
    }

    public void print() {
        System.out.println("Can you walk through this room?: " + isRoomWalkThrough);
    }
}
