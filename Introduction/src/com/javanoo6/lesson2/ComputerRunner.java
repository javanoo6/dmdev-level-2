package com.javanoo6.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        //Тип переменной computer - Computer
        //Это экземпляр класса
        Computer computer = new Computer();
        //Обращение к свойствам этого объекта
        computer.load();
        computer.printComputerInfo();
    }
}
