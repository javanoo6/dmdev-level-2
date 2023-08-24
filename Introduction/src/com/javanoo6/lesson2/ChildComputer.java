package com.javanoo6.lesson2;

public class ChildComputer extends Computer {
    public void printChildComputerInfo() {
        System.out.println("я наследник, но у меня есть родительские методы");
        printComputerInfo();
    }
}
