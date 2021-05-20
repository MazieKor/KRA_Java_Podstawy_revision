package pl.coderslab.strings;

public class Main04 {

    public static void main(String[] args) {

// 2 solutions:
        String str = "Uwaga na dzikie koty powyżej 2 m długości mieszkające na terenach bagiennych. Są groźne i uaktywniają się w nocy";
        String search = "koty";

// 1st solution:
        boolean check1 = str.contains(search);

        if (check1 == true) {
            System.out.println("element \"" + search + "\" zawiera się w zdaniu: " + "\n" + str);
        } else {
            System.out.println("elementu \"" + search + "\" nie ma w zdaniu: " + "\n" + str);
        }
//2nd solution:
        boolean check2 = containsStr(str, search);
        System.out.println("2. rozwiązanie: ");
        if (check2 == true) {
            System.out.println("element \"" + search + "\" zawiera się w zdaniu: " + "\n" + str);
        } else {
            System.out.println("elementu \"" + search + "\" nie ma w zdaniu: " + "\n" + str);
        }

    }

    public static boolean containsStr(String str, String search){
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(search)) {    //possibly additional earlier trim(), depending on goal of the search
                return true;
            }
        }
        return false;
    }
}