package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main04 {
    public static void main(String[] args) {
        String str = "sprawdzanie palindromu";
        String str2 = "kajak kajak";
        System.out.println("czy podany wyraz jest palindromem: " + checkPalindrome(str2));
    }

    public static boolean checkPalindrome(String str){
        String stringWithoutWhiteCharacters = StringUtils.deleteWhitespace(str);
        System.out.println("Test: wyraz bez spacji: " + stringWithoutWhiteCharacters);

        return stringWithoutWhiteCharacters.equalsIgnoreCase(StringUtils.reverse(stringWithoutWhiteCharacters));

    }

}
