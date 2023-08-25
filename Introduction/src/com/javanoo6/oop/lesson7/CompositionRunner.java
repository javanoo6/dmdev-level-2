package com.javanoo6.oop.lesson7;

public class CompositionRunner {
    public static void main(String[] args) {
        var ram = new Ram(1024);
        var ssd = new Ssd(128);
        var computer = new Computer(ram, ssd);
        computer.printState();
    }
}
