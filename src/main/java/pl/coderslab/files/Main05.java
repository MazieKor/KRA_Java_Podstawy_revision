package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        try {
            String[] sortedFile = sortFile();
            System.out.println("Tablica po sortowaniu: " + Arrays.toString(sortedFile));
        } catch(FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }

    }

    public static String[] sortFile() throws FileNotFoundException {
        File file = new File("text5.txt");
        Scanner scan = new Scanner(file);
        String[] languages = new String[0];
        while (scan.hasNextLine()){
            String row = scan.nextLine().trim();
            languages = Arrays.copyOf(languages, languages.length +1);
            languages[languages.length-1] = row;
        }
        String[] sortedLanguages = languages.clone();
        Arrays.sort(sortedLanguages);
        System.out.println("Oryginalna tablica: " + Arrays.toString(languages));
        scan.close();
        return sortedLanguages;
    }

}
