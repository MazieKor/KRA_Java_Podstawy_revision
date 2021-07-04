package pl.coderslab.filesnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {
//2 Solutions
    public static void main(String[] args) {
        createDirectiory("src/main/java/pl/coderslab/filesnio/Task1");
//        createDirectiory2("src/main/java/pl/coderslab/filesnio/Task1");
    }

//1st Solution:
    public static void createDirectiory(String directoryName) {
        Path path = Paths.get(directoryName);
        if (Files.exists(path)) {
            System.out.println("podana ścieżka już istnieje");
        } else {
            try {
                String pathNewDirectory = String.valueOf(Files.createDirectory(path));
                System.out.println("stworzono nową ścieżkę: " + pathNewDirectory);
            } catch (IOException e) {
                System.out.println("Nie udało się stworzyć katalogu");
                e.printStackTrace();
            }
        }
    }
//2nd Solution:
    public static void createDirectiory2 (String directoryName) {
        File file = new File(directoryName);
        if(file.mkdir()){
            System.out.println("Ścieżka została stworzona");
        } else
            System.out.println("Ścieżka nie została stworzona");
    }

}