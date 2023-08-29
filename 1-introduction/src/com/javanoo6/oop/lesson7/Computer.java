package com.javanoo6.oop.lesson7;

/**
 * Механизм построения нового класса из объектов существующих классов называется композицией
 * То есть при композиции полями класса являются ссылки на объекты классов
 */
public class Computer {
    private Ram ram;
    private Ssd ssd;
    private static int counter;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void printState() {
        System.out.println("PC INFO:\nRAM: " + ram.getValue() + "\nSSD: " + ssd.getValue());
    }
}
