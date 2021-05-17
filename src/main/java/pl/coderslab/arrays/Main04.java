package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main04 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            Random r = new Random();
            numbers[i] = r.nextInt(101);
        }

        int[] reverse = new int[numbers.length];
        int i = 0;
        int j = numbers.length - 1;
        while (i < numbers.length) {
            reverse[i] = numbers[j];
            i++;
            j--;
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.print("Reverse: " + Arrays.toString(reverse));


    }
}
