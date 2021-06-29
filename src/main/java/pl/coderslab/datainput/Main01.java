package pl.coderslab.datainput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
//2 solutions:

        getInfo2();
    }

    public static void getInfo() {
        System.out.println("Podaj swoje imię");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Podaj swój wiek");
//        Scanner scan2 = new Scanner(System.in);
        try {
            int wiek = scan.nextInt();
            System.out.print(name + " ma " + wiek + " lat.");
        } catch (InputMismatchException e) {
            System.out.println("Został podany błędny wiek. uruchom program jeszcze raz");
        }

    }

    //2nd solution:
    public static void getInfo2() {
        System.out.println("Podaj swoje imię");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Podaj swój wiek");
        while (!scan.hasNextInt()) {
            System.out.println("Podany wpis nie jest liczbą, podaj jeszcze raz");
            scan.next();
        }
        int age = scan.nextInt();
        System.out.print(name + " ma " + age + " lat.");
    }
}