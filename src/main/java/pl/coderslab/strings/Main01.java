package pl.coderslab.strings;

import java.util.Arrays;
import java.util.Locale;

public class Main01 {

    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        String strInLowerCase = str.toLowerCase();

        char penUltimateLetter = strInLowerCase.charAt(strInLowerCase.length() - 2);
        System.out.println("przedostatnia litera to: " + penUltimateLetter);

        char[] arrayOfChars = strInLowerCase.toCharArray();
        System.out.println(Arrays.toString(arrayOfChars));

        int sum = 0;
        for (int i = 0; i < arrayOfChars.length; i++) {
            if (arrayOfChars[i] == penUltimateLetter) {
                sum++;
            }
        }
        System.out.println("Liczba wystąpień litery " + penUltimateLetter + ": " + sum);

// Test:
        System.out.println("oryginał: " + str);
        System.out.print("kopia w małych literach: " + strInLowerCase);
    }
}