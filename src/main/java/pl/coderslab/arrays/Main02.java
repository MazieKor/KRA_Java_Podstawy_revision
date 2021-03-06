package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main02 {

    public static void main(String[] args) {
        int[] randArray = new int[20];
        randomGenerator(randArray);

        System.out.println("Tablica: " + Arrays.toString(randArray));

//solution without Arrays.sort
        int min = randArray[0];
        for (int i = 1; i < randArray.length; i++) {
            if (randArray[i] < min) {
                min = randArray[i];
            }
        }
        System.out.print("Najmniejsza liczba: " + min);
    }

    public static void randomGenerator(int[] randArray) {
        for (int i = 0; i < randArray.length; i++) {
            Random r = new Random();
            int randomNumber = r.nextInt(101);
            randArray[i] = randomNumber;
        }

    }
}