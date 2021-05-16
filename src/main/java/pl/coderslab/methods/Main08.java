package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {
        double a = 47;
        double b = 47.00001;
        double c = 47;
        double resultOfMethod = maxOfThree(a, b, c);
        System.out.println("Największa podana liczba to: " + resultOfMethod);
    }

    public static double maxOfThree(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else
            return c;
    }
}