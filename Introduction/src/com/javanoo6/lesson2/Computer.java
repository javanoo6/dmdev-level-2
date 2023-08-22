package com.javanoo6.lesson2;
//Объект - это экземпляр какого-либо класса
public class Computer {
    int ssd = 500;
    int ram = 1024;

    void load() {
        System.out.println("я прогрузился?");
    }

    void printComputerInfo() {
        System.out.println("оператива: " + ram);
        System.out.println("памать: " + ssd);
    }
}
