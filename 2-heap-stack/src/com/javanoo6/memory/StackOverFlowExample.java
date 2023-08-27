package com.javanoo6.memory;

public class StackOverFlowExample {
    public static void main(String[] args) {
        var someStr = "THIS IS BAD IDEA";
        recursivelyCreateString(someStr);
        }

    private static void recursivelyCreateString(String someStr) {
        System.out.println("SOF is almost there...");
        var stringThatIsNotInStringPoolSinceDeclaredAsNew = new String(someStr);
        recursivelyCreateString(stringThatIsNotInStringPoolSinceDeclaredAsNew);
    }
}
