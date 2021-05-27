package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {
//2 solutions

    public static void main(String[] args) {
        getData();

    }

    public static void getData() {
        int sum = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Wprowadź liczbę (aby wyjść z funkcji wprowadź 0)");
            while (!scan.hasNextInt()) {
                System.out.println("Podana wartośc nie jest liczbą. Podaj liczbę");
                scan.next();
            }
            int nextInt = scan.nextInt();
            if (nextInt == 0)
                break;
            counter++;
            sum += nextInt;
        }
        System.out.println("suma podanych liczb to: " + sum + " ilość podanych liczb to: " + counter);
    }

//2nd solution:
    public static void getData2() {
        int sum = 0;
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Wprowadź liczbę (aby wyjść z funkcji wprowadź 0)");
            String scanLine = scan.nextLine();
            scanLine = scanLine.trim();
            String[] scanLineArray = scanLine.split(" ");
            if (scanLineArray.length != 1) {
                System.out.println("długość napisu: " + scanLineArray.length + ". wprowadź dokładnie jedną liczbę");
                continue;
            }
            int scanInt;
            try {
                scanInt = Integer.parseInt(scanLine);
            } catch (NumberFormatException e) {
                System.out.println("Podany wpis nie jest liczbą");
                continue;
            }
            if (scanInt == 0)
                break;
            counter++;
            sum += scanInt;
        }
        System.out.println("suma podanych liczb to: " + sum + " ilość podanych liczb to: " + counter);
    }

}