package com.javanoo6.oop.lesson5;

import com.javanoo6.oop.lesson2.Computer;

public class PackageTest {

    public static void main(String[] args) {
        //по умолчанию модификатор доступа - package private
        //это значит, что при объявлении метода по ум. он будет доступен только в области пакета (package)
        //Чтобы в это классе воспользоваться конструктором класса Computer необходимо указать его модификатор доступа public
        Computer computer = new Computer();

    }
}
