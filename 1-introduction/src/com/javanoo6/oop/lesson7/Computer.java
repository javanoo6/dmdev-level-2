package com.javanoo6.oop.lesson7;

/**
 * Механизм построения нового класса из объектов существующих классов называется композицией
 * То есть при композиции полями класса являются ссылки на объекты классов
 */
public class Computer {
    private Ram ram;
    private Ssd ssd;

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("PC INFO:\nRAM: " + ram.getValue() + "\nSSD: " + ssd.getValue());
    }
}
