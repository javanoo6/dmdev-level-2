package com.javanoo6.statickeyword;

public class StaticCounter {
    private static int counter;
    public static void getCounter() {
        counter++;
        System.out.printf("This method has been called %d times%n", counter);
    }
}
