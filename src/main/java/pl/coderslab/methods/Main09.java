package pl.coderslab.methods;

public class Main09 {

    public static void main(String[] args) {
        int number = -4;
        int factorial = factorial(number);

        if (factorial < 0) {
            System.out.println("Podaj liczbę większą lub równą zeru");
        } else {
            System.out.println("Silnia z liczby " + number + " wynosi: " + factorial);
        }
    }

    public static int factorial(int n) {
        int result = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        } else {
            return -1;
        }
    }
}
