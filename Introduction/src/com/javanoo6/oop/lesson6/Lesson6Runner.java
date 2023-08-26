package com.javanoo6.oop.lesson6;

/**
 * Такой явный import является излишним
 */
import java.lang.Integer;

public class Lesson6Runner {
    public static void main(String[] args) {
        /**
         * import - это ключевое слово, позволяющее корректно указать импортируемый класс,
         * если этот класс находится в отличном от используемого класса пакете.
         * В противном случае, следуем указать путь до необходимого класса:
         */
        com.javanoo6.oop.lesson2.Computer computer = new com.javanoo6.oop.lesson2.Computer();

        /**
         * По умолчанию пакет java.lang уже импортирован в класс и такой import объявлять не нужно
         * Следовательно, все классы находящиеяся в этом пакете уже доступны по ум.
         */
        Integer someValue = 0;

    }
}
