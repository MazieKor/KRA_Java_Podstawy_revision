package pl.coderslab.strings;

public class Main06 {

    public static void main(String[] args) {

        String str = "codersLabxyz";
// 1st solution:
        String reverseString = reverse(str);
        System.out.println("Original String: " + str);
        System.out.println("1st solution: " + reverseString);
//2nd solution:
        String reverseString2 = reverse2(str);
        System.out.println("Original String: " + str);
        System.out.println("2nd solution: " + reverseString2);
//3rd solution:
        String reverseString3 = reverse3(str);
        System.out.println("Original String: " + str);
        System.out.print("3rd solution: " + reverseString3);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        return strBuilder.append(str).reverse().toString();
    }

//2nd solution:
    public static String reverse2(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char symbol = str.charAt(i);
            result += symbol;
        }
        return result;
    }
//3rd solution:
    public static String reverse3(String str) {
        char[] stringArray = str.toCharArray();
        char[] reverseStringArray = new char[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            reverseStringArray[reverseStringArray.length - 1 - i] = stringArray[i];
        }
        return String.valueOf(reverseStringArray);
    }

}