package com.javanoo6.statickeyword;

import com.javanoo6.oop.lesson7.Computer;

/**
 * При объявлении метода или поля класса можно использовать модификатор static.
 * В этом случае переменная или метод будут принадлежать всему классу, а не отдельному экземпляру.
 * Статические методы и переменные можно вызывать без создания экземпляра класса.
 * Все статические поля существуют в единственном экземпляре, статические методы могут изменять только статические поля
 */

public class StaticRunner {
    public static void main(String[] args) {
        new Computer(null, null);
        new Computer(null, null);
        new Computer(null, null);
        Computer computer = new Computer(null, null);
        Computer computer2 = new Computer(null, null);
        System.out.println(Computer.getCounter());

        Class<? extends Computer> clazz = computer.getClass();
        Class<? extends Computer> clazz2 = computer2.getClass();

        /** Это 2 одинаковые ссылки тк ведут на один и тот же Class.
         * При загрузке класса в JVM все метаданные оказываются в Metaspace - области памяти в которой хранится статическая информация Java приложения.
         * У каждого уникального класса есть связный с ним объект Class, он представляет характеристики класса, экземпляром которого является объект.
         * Поэтому, эти ссылки ведут на один и тот же объект в Metaspace
         */
        System.out.println(clazz == clazz2);
        /**
         * Эти ссылки ведут на 2 разных объекта в Heap памяти, поэтому эти ссылки разные
         */
        System.out.println(computer == computer2);

        StaticCounter.getCounter(); // This method has been called 1 times
        StaticCounter.getCounter(); // This method has been called 2 times
        StaticCounter.getCounter(); // This method has been called 3 times

        var staticCounter = new StaticCounter();
        staticCounter.getCounter(); // This method has been called 4 times
    }
}
