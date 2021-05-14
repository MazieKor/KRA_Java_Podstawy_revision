package pl.coderslab.methods;

public class Main01 {

    public static void main(String[] args) {
        int multiplier = 8;
        int index = 10;
        int result = multiply(multiplier, index);
        System.out.println(result);

    }

    public static int multiply(int multipler, int index) {
        return multipler * index;
    }

}
