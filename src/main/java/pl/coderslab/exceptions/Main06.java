package pl.coderslab.exceptions;


public class Main06 {

    public static void main(String[] args) {
        int a = 19, b = 0;
        try {
            int result = divide(a, b);
            System.out.println("wynik działania to: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("podaj poprawny argument");
        }

    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

}
