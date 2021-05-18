package pl.coderslab.methods;

public class Main02 {

    public static void main(String[] args) {
        int num1 = 9;
        System.out.println(square(num1));

        System.out.println("Wynik z użyciem klasy Math: " + Math.pow(num1, 2));
    }

    public static int square(int num) {
        return num * num;
    }
}
