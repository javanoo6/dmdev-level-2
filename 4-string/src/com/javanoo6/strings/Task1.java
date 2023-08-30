package com.javanoo6.strings;

public class Task1 {
    public static void main(String[] args) {
        var value = ":(:(:(:(:(:(:(::):):):):):):)";
        var result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
