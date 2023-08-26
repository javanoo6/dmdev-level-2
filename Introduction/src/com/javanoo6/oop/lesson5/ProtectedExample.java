package com.javanoo6.oop.lesson5;

import com.javanoo6.oop.lesson2.ChildComputer;
import com.javanoo6.oop.lesson2.Computer;

public class ProtectedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.printComputerInfo();
        ChildComputer childComputer = new ChildComputer();
        childComputer.printChildComputerInfo();
    }
}
