package com.javanoo6.lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        //Тип переменной computer - Computer
        //Это экземпляр класса
        //Computer() - это конструктор без пар-ов
        Computer computer = new Computer();
        //Обращение к свойствам этого объекта
        computer.load();
        computer.printComputerInfo();

        Computer biggerSsdComputer = new Computer(9000);
        biggerSsdComputer.printComputerInfo();
        //Теперь при вызове printComputerInfo поле ssd будет иметь значение 9000

        Computer superComputer = new Computer(9000, 32000);
        superComputer.printComputerInfo();

        superComputer.load();
        superComputer.load(true);
        superComputer.load(true, 50);

    }
}
