package pl.coderslab.cutstrings;

public class Main01 {

    public static void main(String[] args) {

    String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
    split(str);
    }

    public static void split(String str) {
        String[] splitString = str.split(" ");
        for (int i = 0; i < splitString.length - 1; i++) {
            System.out.println(splitString[i]);
        }
        System.out.print(splitString[splitString.length-1]);    //nie wstawiamy dodatkowej linii po ostatnim wyrazie
    }


}
