package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main03 {

    public static void main(String[] args) {

        String str = " metoda   ma policzyć liczbę wyrazów,  ale  bez białych znaków    ";
        System.out.print("Liczba wyrazów: " + countTokens(str));
    }

    public static int countTokens(String str){
        String[] strArray = str.split(" ");
        String[] strArrayTrimmed = new String[0];
        System.out.println("Test: tablica o dugości zero: " + Arrays.toString(strArrayTrimmed));
        for (int i = 0; i < strArray.length; i++) {
            String indexTrimmed = strArray[i].trim();
            System.out.println("Test: trimmed: " + indexTrimmed + ".");
            if(indexTrimmed.length() > 0){
                System.out.println("Test: trimmed: " + indexTrimmed + ".");
                strArrayTrimmed = Arrays.copyOf(strArrayTrimmed, strArrayTrimmed.length + 1);
                strArrayTrimmed[strArrayTrimmed.length-1] = indexTrimmed;
            }
        }
        return strArrayTrimmed.length;
    }

}
