package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        String directory = "src/main/java/pl/coderslab/filesnio/Task3";
        String fileName = "test.txt";
        String secondFileName = "KopiaTest.txt";
        copyFile(directory, fileName, secondFileName);

    }

    public static void copyFile(String directory, String fileName, String secondFileName) {
        Path path = Paths.get(directory + "/" + fileName);
        Path path2 = Paths.get(directory + "/" + secondFileName);
        Scanner scan = new Scanner(System.in);
        if (!Files.exists(path)) {
            fileNotExist(path, scan);    //in this task program checks only existence of file, not a whole directory
        }
        if (Files.exists(path)){         //2nd check of file existence because method "fileNotExist" enable us to create a file
            if(!Files.exists(path2)) {
                try {
                    Files.copy(path, path2);
                    if (Files.exists(path2)) {
                        System.out.println("Plik skopiowano");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("problem z kopiowaiem pliku");
                }
            } else {
                System.out.println("plik, który ma być kopią oryginalnego pliku czyli " + secondFileName + " już istnieje. Czy chcesz żeby został zastąpiony? (Y/N)");
                while(true){
                    String changeAFileMessage = scan.nextLine().trim();
                    if(!changeAFileMessage.equalsIgnoreCase("y") &&
                            !changeAFileMessage.trim().equalsIgnoreCase("n")){
                        System.out.println("Podano złą wartość. Podaj Y lub N");
                        continue;
                    } else if (changeAFileMessage.trim().equalsIgnoreCase("y") ) {
                        try {
                            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Skopiowano plik");
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.out.println("problem z kopiowaiem pliku.");
                        }
                    }
                    break;
                }
            }
        } else
            System.out.println("Podany plik do skopiowania nie istnieje");
    }

    private static void fileNotExist(Path path, Scanner scan) {
        System.out.println("podany do skopiowania plik nie istnieje. Czy stworzyć pusty plik o podanej nazwie? Wpisz Y lub N)");
        while (true) {
            String createNewFileMessage = scan.nextLine().trim();
            if (!createNewFileMessage.equalsIgnoreCase("Y") &&
                    !createNewFileMessage.equalsIgnoreCase("N")) {
                System.out.println("Podano złą wartość. Wpisz Y lub N");
            } else if (createNewFileMessage.equalsIgnoreCase("N")) {
                System.out.println("Program zakończono. Możesz włączyć program i podać inny plik");
                break;
            } else {
                try {
                    Files.createFile(path);
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Wystąpił błąd. Plik nie został utworzony");
                    break;
                }
            }
        }
    }
}