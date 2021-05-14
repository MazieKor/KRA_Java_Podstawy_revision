package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {
        int age = 18;
        System.out.println(checkMaturity(age));

        int age2 = 19;
        System.out.println("2. funkcja: " + checkMaturity2(age2));
    }


    public static boolean checkMaturity(int age) {
        if (age < 18)
            return false;
        else
            return true;
    }

    public static boolean checkMaturity2(int age) {
        return age < 18 ? false : true;
    }
}
