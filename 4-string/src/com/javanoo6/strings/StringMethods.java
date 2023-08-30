package com.javanoo6.strings;

public class StringMethods {
    public static void main(String[] args) {
        var dummyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."; //link https://ru.lipsum.com/feed/html
        var dummyText2 = "Ut nec gravida mauris.";
        var dummyTextFormatted = "Nullam ac varius neque %s ";
        var dunmmyTextWithLines = "Aliquam\nut\ninterdum\ndiam.";
        var blankString = " ";
        var emptyString = "";

        var character = dummyText.charAt(0);
        System.out.println(character); // L

        var compare = dummyText.compareTo(dummyText2); // Compares two strings lexicographically
        System.out.println(compare); // dummyText.length() - dummyText2.length = -9?

        var concat = dummyText.concat(dummyText2);// Соединение строк
        System.out.println(concat);

        var contains = dummyText.contains(dummyText2);
        System.out.println(contains); // false

        var endsWith = dummyText.endsWith(".");
        System.out.println(endsWith); // true

        var isEqual = dummyText.equals(dummyText2);
        System.out.println(isEqual); // false

        var formatted = dummyTextFormatted.formatted("some added text");
        System.out.println(formatted); // Nullam ac varius neque some added text

        byte[] bytes = dummyText.getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }

        int index = dummyText.indexOf('r');
        System.out.println(index); // 2 (L=0,o=1,r=2..)

        var isStringEmpty = emptyString.isEmpty();
        var isStringBlank = blankString.isBlank();
        System.out.println(isStringEmpty); // true
        System.out.println(isStringBlank); // true

        var joinedString = dummyText.join(".", dummyText, dummyText2);
        System.out.println(joinedString); // Lorem ipsum dolor sit amet, consectetur adipiscing elit..Ut nec gravida mauris.

        int lastIndex = dummyText.lastIndexOf('o');
        int length = dummyText.length();
        System.out.println(lastIndex); // 29
        System.out.println(length); // 56

        dunmmyTextWithLines.lines().forEach(System.out::println);
        //Aliquam
        //ut
        //interdum
        //diam.

        var matches = dummyText.matches(".*amet.*");
        var replaced = dummyText.replace("consectetur", "consectetur".toUpperCase());
        System.out.println(matches); // true
        System.out.println(replaced); // Lorem ipsum dolor sit amet, CONSECTETUR adipiscing elit.

        var splittedString = dummyText.split("\s");
        var startsWith = dummyText.startsWith("Lor");
        System.out.println(splittedString[0]); // Lorem
        System.out.println(startsWith); // true

        var substring = dummyText.substring(12);
        var chars = dummyText.toCharArray();
        System.out.println(substring); // dolor sit amet, consectetur adipiscing elit.
        for (char ch : chars) {
            System.out.print(ch); // Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        }

        var trimmed = dummyText.trim();
        var valueOf = String.valueOf(dummyText.length());
        System.out.println("\n"+trimmed); // Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        System.out.println(valueOf); // 56
    }
}
