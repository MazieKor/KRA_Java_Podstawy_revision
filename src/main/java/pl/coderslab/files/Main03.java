package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
//2 solutions:
        readFile2();
    }

//1st Solution:
    public static void readFile() {
        File file = new File("Zad3.txt");
        try {
            Scanner scan = new Scanner(file);
            String sumOfNumbers = addNumbersFromFile(scan);
            System.out.println(sumOfNumbers);
            scan.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static String addNumbersFromFile(Scanner scan) {
        double sumOfNumbers = 0;
        int counter = 0;
        while (scan.hasNext()) {
            String stringFromFile = scan.next().trim();
            char firstSign = stringFromFile.charAt(0);
            char lastSign = stringFromFile.charAt(stringFromFile.length()-1);
            if (firstSign == '.' || firstSign == ',') {
                stringFromFile = stringFromFile.substring(1);
            }
            if (lastSign == '.' || lastSign == ','){
                stringFromFile = stringFromFile.substring(0,stringFromFile.length()-1);
            }
            try {
                sumOfNumbers += Double.parseDouble(stringFromFile);
                counter++;
            } catch (IllegalArgumentException e) {
            }
        }
        String noNumbersMessage = "W pliku nie znaleziono żadnych liczb";
        String sumOfNumbersMessage = "Suma liczb w pliku wynosi: ";

        return counter == 0? noNumbersMessage : sumOfNumbersMessage + sumOfNumbers;
    }

//2nd Solution:
    public static void readFile2() {
        File file = new File("Zad3.txt");
        double sumOfNumbers = 0;
        try (Scanner scan = new Scanner(file)) {
            sumOfNumbers = addNumbers(scan);
        } catch (FileNotFoundException e){
            System.out.println("nie znaleziono pliku");
        }
        System.out.println("Wynik dodawania liczb z pliku to: " + sumOfNumbers);
    }
    public static double addNumbers(Scanner scan){
        double sumOfNumbers = 0;
        while(scan.hasNextLine()) {
            String lineFromFile = scan.nextLine().trim();
            String[] arrayFromString = lineFromFile.split(",");
            for (int i = 0; i < arrayFromString.length; i++) {
                try {
                    sumOfNumbers +=  Double.parseDouble(arrayFromString[i]);
                }catch (NumberFormatException e){
                }
            }
        }
            return sumOfNumbers;
    }
}