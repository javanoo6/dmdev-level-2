package com.javanoo6.strings;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        var value = "31415926535";
        var n = 2;
        var result = split(value, n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] split(String value, int n) {
        var arraySize = (int) Math.ceil(value.length() / (double) n);
        var result = new String[arraySize];
        var counter = 0;
        for (int i = 0; i < value.length(); i += n) {
            int endIndex = Math.min(value.length(), i + n);
            var substring = value.substring(i, endIndex);
            result[counter] = substring;
            counter++;
        }

        return result;
    }
}
