package pl.coderslab.methods;

public class Main06 {

    public static void main(String[] args) {

// 3 solutions:
        int age = 18;
        System.out.println(checkMaturity(age));

        int age2 = 19;
        System.out.println("2. funkcja: " + checkMaturity2(age2));

        int age3 = 20;
        System.out.print("3. funkcja: " + checkMaturity3(age3));
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

    public static boolean checkMaturity3(int age) {
        return age >= 18;
    }

}
