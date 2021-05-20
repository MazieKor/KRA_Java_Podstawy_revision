package pl.coderslab.strings;

import java.util.Arrays;

public class Main08 {

    public static void main(String[] args) {
        String str = "Testowy String używający DUŻYCH LITER, małych, znaków $%# i liczb 33452";
        String toggleString = toggleChar(str);
        System.out.println("Wynik metody: " + toggleString);

    }

    public static String toggleChar(String str) {
        char[] charArray = str.toCharArray();
        System.out.println("Array from String: " + Arrays.toString(charArray));
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLowerCase(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);
            } else {
                charArray[i] =Character.toLowerCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }
}