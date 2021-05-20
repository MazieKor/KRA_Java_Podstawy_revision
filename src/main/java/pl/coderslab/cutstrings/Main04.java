package pl.coderslab.cutstrings;

import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {
        String str = "Java-zadania-podzial napisów-oraz String-i-StringBuilder";
        String[] splitString = onlyTwoElements(str,'-');
        System.out.print("wynik: "+ Arrays.toString(splitString));
    }

    public static String[] onlyTwoElements(String str, char separator){

        return str.split(String.valueOf(separator), 2);
    }
}
