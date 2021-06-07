package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main02 {

    public static void main(String[] args) {
        String str = "Testowanie Nowego pakietu COMMON-LANG, 3";
        System.out.println(toggleChar(str));
        System.out.println("test oryginalnego napisu: " + str);
    }

    public static String toggleChar(String str){

        return StringUtils.swapCase(str);
    }
}
