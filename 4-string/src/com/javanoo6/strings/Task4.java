package com.javanoo6.strings;

public class Task4 {
    public static void main(String[] args) {
        var value = "will.,!this.,....?end!someday??";
        System.out.println(countSymbols(value));
    }

    public static int countSymbols(String value) {
        var result = value
                .replace(".", "")
                .replace(",", "")
                .replace("!", "");
        return value.length() - result.length();
    }
}
