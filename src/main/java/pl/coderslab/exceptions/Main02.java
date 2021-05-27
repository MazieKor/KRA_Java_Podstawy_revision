package pl.coderslab.exceptions;

public class Main02 {

    public static void main(String[] args) {
        int[] tab = {5, 1, 6, 7, 8};
        try {
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("podaj index tablicy mieszczący się w jej obszarze: 0 - " + (tab.length - 1));
        }
    }

}
