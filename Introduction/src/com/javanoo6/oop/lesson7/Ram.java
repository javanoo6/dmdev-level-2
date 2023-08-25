package com.javanoo6.oop.lesson7;

public class Ram {
    private int value;

    public Ram(int value) {
        this.value = value;
    }
    //метод, который вернет поле value экземпляра класса Ram
    public int getValue() {
        return value;
    }
    //метод, который устоновит поле value экземпляра класса Ram
    public void setValue(int value) {
        this.value = value;
    }
}
