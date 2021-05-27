package pl.coderslab.datainput;

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

        nettoBrutto();
    }

    public static void nettoBrutto() {
        System.out.println("Wpisz rodzaj zamiany: \"nb\" lub \"bn\"");
        Scanner scan = new Scanner(System.in);
        String switchType = "";
        for (; ; ) {
            switchType = scan.nextLine();
            if (switchType.equals("nb") || switchType.equals("bn")) {
                break;
            }
            System.out.println("Wprowadź odpowiednią wartość: \"nb\" lub \"bn\"");
        }
//        int valueToChange;
        switch (switchType) {
            case "nb":
                System.out.println("wpisz wartość netto do zamiany");
                break;
            case "bn":
                System.out.println("wpisz wartość brutto do zamiany");
                break;
            default:
                System.out.println("Błąd, nie wprowadzono ani 'nb' ani 'bn'");
        }

        while (!scan.hasNextInt()) {
            System.out.println("wartość niepoprawna - wpisz liczbę");
            scan.next();
        }

//        valueToChange = scan.nextInt();
        if (switchType.equals("nb")) {
            double result = scan.nextInt() * 1.23;
            System.out.println("wynik brutto to: " + String.format("%.2f", result));
        } else if (switchType.equals("bn")) {
            double result = scan.nextInt() / 1.23;
            System.out.println("Wynik netto to: " + String.format("%.2f", result));
        } else
            System.out.println("BLĄD");
    }

}