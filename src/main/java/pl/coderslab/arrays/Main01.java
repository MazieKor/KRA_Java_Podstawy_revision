package pl.coderslab.arrays;

import java.util.Arrays;

public class Main01 {

    public static void main(String[] args) {
        int[] tab = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41, 42, 44, 43, 45, 46, 47, 48, 49};

        int[] tab2 = {0};
        for (int i = 0; i < 52; i++) {
            tab2 = Arrays.copyOf(tab2, tab2.length+1);
            tab2[i+1] = i+1;
        }


//        for (int i = 0; i < tab.length; i++)
        int i = 0;
        while (i < tab2.length) {
            if (i % 10 == 0) {
                if (i == 0) {
                    System.out.print("0" + tab2[i] + ", ");
                } else {
                    System.out.println();
                    System.out.print(tab2[i] + ", ");
                }
            } else{
                if(i<10){
                    System.out.print("0" +tab2[i] + ", ");
                } else
                    System.out.print(tab2[i] + ", ");
            }
            i++;
        }

    }
}
