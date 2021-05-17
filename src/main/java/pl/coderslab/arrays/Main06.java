package pl.coderslab.arrays;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] secondNumbers = new int[3];
        Main02.randomGenerator(numbers);
        Main02.randomGenerator(secondNumbers);
        int[] sumOfNumbers = new int[numbers.length >= secondNumbers.length ? numbers.length : secondNumbers.length];
        System.out.println("długosc sumOfNumbers: " + sumOfNumbers.length);
        if (numbers.length >= secondNumbers.length) {
            for (int i = 0; i < numbers.length; i++) {
                if(i < secondNumbers.length)
                    sumOfNumbers[i] = numbers[i] + secondNumbers[i];
                else
                    sumOfNumbers[i] = numbers[i];
            }
        } else {
            for (int i = 0; i < secondNumbers.length; i++) {
                if (i < numbers.length)
                    sumOfNumbers[i] = numbers[i] + secondNumbers[i];
                else
                    sumOfNumbers[i] = secondNumbers[i];
            }
        }
        System.out.println("1 tablica: " + Arrays.toString(numbers));
        System.out.println("2 tablica: " + Arrays.toString(secondNumbers));
        System.out.print("3 tablica: " + Arrays.toString(sumOfNumbers));
    }
}
