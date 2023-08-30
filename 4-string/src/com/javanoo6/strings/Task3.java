package com.javanoo6.strings;

public class Task3 {
    public static void main(String[] args) {
        var result = format("Java", "Noo6", "Andreich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
        var firstNameChar = Character.toUpperCase(firstName.charAt(0));
        var lastNameChar = Character.toUpperCase(lastName.charAt(0));
        var patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));

        return String.format("%s.%s.%s", firstNameChar, lastNameChar, patronymicNameChar);
    }
}
