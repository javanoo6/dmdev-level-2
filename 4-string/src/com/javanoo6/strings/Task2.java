package com.javanoo6.strings;

public class Task2 {
    public static void main(String[] args) {
        var value = "434343242 some word  343";
        var word = "43";
        System.out.println(isStartAndEnd(value, word));
    }

    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
