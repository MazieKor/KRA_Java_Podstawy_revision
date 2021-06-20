package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main01 {

    public static void main(String[] args) {
        String str = "testStringUtils";
        System.out.println("Odwrócony napis w StringUtils: " + reverseString(str));
    }

    public static String reverseString(String str){
//        StringUtils.reverse(str);
//        System.out.println("Test oryginalnego napisu: " + str);

        String reversedString = StringUtils.reverse(str);

        return reversedString;
    }

}
