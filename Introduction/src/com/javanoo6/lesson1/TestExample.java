package com.javanoo6.lesson1;

public class TestExample {
    //Просто другя форма записи
    public static void main(String... args) {
        var counter = 0;
        for (String arg : args) {
            System.out.printf("аргумент:%s | какой по счету аргумент:%d\n".formatted(arg, counter));
            counter++;
        }
    }
}
