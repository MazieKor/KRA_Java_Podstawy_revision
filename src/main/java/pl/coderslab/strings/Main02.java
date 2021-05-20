package pl.coderslab.strings;

import java.util.Locale;

public class Main02 {

    public static void main(String[] args) {

// 2 solutions:
        String str = "Uwaga na dzikie koty większe niż 2 metry długości";
        str = str.toLowerCase().trim();

        char charToFind = 'n';
// 1st solution:
        int indexNumber = charPos(str, charToFind);
        if (indexNumber < 0) {
            System.out.println("Sposób 1: podanej litery nie ma");
        } else {
            System.out.println("Sposób 1: litera " + charToFind + " znajduje się pod indexem "
                    + indexNumber + " (pierwsze wystąpienie)");
        }

// 2nd solution:
        if (str.indexOf(charToFind) < 0) {
            System.out.println("Sposób 2: podanej litery nie ma");
        } else {
            System.out.println("Sposób 2: litera " + charToFind + " znajduje się pod indexem "
                    + str.indexOf(charToFind) + " (pierwsze wystąpienie)");
        }
// Test:
        System.out.println("Testowany string: " + str);
    }

    public static int charPos(String str, char c) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                return i;
            }
        }
        return -1;
    }
}