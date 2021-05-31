package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {
        int number = -4;
        try {
            int result = factorial(number);
            System.out.println("silnia z liczby " + number + " wynosi " + result);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("wykonaj dalsze działania");
    }

    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("podaj liczbę większą lub równą zeru");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
