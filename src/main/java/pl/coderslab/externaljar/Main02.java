package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main02 {

    public static void main(String[] args) {
        String str = "Testowanie Nowego pakietu COMMON-LANG, 3";
        System.out.println(toggleChar(str));
        System.out.println("test oryginalnego napisu: " + str);

        String test2 = "2.test StringUtils";
        String swapTest2 = StringUtils.swapCase(test2);
        System.out.println("check: " + StringUtils.equals("adam", " adam"));
        System.out.println("check: " + StringUtils.containsOnly("048 ", "08e4"));
        System.out.println("Test oryginalnego napisu: " + test2);
        System.out.println("Test napisu StringUtils: " + swapTest2);
    }

    public static String toggleChar(String str){

        return StringUtils.swapCase(str);
    }
}
