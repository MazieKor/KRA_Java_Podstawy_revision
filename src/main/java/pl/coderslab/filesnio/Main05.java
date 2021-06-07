package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        String fileName = "src/main/java/pl/coderslab/filesnio/Task5/test.Nowy.txt";
        readFromFile(fileName);
    }

    public static void readFromFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            noFileMessage();
        } else {
            StringBuilder contentOfFile = new StringBuilder();
            try {
                contentOfFile.append(Files.readAllLines(path));   // we don't want directly from readAllLines to a list (too easy ;) )
            } catch (IOException e) {
                System.out.println("Błąd w czytaniu pliku");
            }
            String[] arrayContentOfFile = createStringArrayFromFileContent(contentOfFile);

            List<String> listForHTML = createListForHtmlFromStringArray(arrayContentOfFile);

            Path path2 = Paths.get(createDirectoryWithNewHtmlFile(path));

            if (Files.exists(path2)) {
                fileAlreadyExists(listForHTML, path2);
            } else {
                try {
                    Files.write(path2, listForHTML);
                } catch (IOException e) {
                    System.out.println("nie udało się zapisać kopii pliku");
                }
            }
        }
    }

    private static void noFileMessage() {
        System.out.println("nie udało się znaleźć pliku do skopiowania w podanej ścieżce. Upewnij się, że plik istnieje");
    }

    private static String[] createStringArrayFromFileContent(StringBuilder contentOfFile) {
        String stringContentOfFile = contentOfFile.toString();
        System.out.println("Test - string bezpośr. ze StrBuildera: " + stringContentOfFile);
        String[] arrayContentOfFile = stringContentOfFile.split(",");
        System.out.println("Test: Tablica stringów ze Stringbuildera: " + Arrays.toString(arrayContentOfFile));
        if (arrayContentOfFile[0].charAt(0) == '[') {
            arrayContentOfFile[0] = arrayContentOfFile[0].substring(1);
        }
        int lastArrIndex = arrayContentOfFile.length - 1;
        int lastSign = arrayContentOfFile[lastArrIndex].length() - 1;
        if (arrayContentOfFile[lastArrIndex].charAt(lastSign) == ']') {
            arrayContentOfFile[lastArrIndex] = arrayContentOfFile[lastArrIndex].substring(0, lastSign);
        }

        int counter = 0;
        for (String row : arrayContentOfFile) {
            System.out.println("Test: Index " + counter + " tablicy to:" + row);
            counter++;
        }
        return arrayContentOfFile;
    }

    private static List<String> createListForHtmlFromStringArray(String[] arrayContentOfFile) {
        List<String> listForHTML = new ArrayList<>();
        listForHTML.add("<html>\n<body>");
        for (int i = 0; i < arrayContentOfFile.length; i++) {
            listForHTML.add("<p>" + arrayContentOfFile[i] + "</p>");
        }
        listForHTML.add("</body>\n<html>");
        return listForHTML;
    }

    private static String createDirectoryWithNewHtmlFile (Path path) {
        int elementsInPath = path.getNameCount();
        String lastFileName = String.valueOf(path.getName(elementsInPath - 1));
        int indexOfDot = lastFileName.lastIndexOf(".");
        if (indexOfDot >= 0) {
            lastFileName = lastFileName.substring(0, indexOfDot);
        }
        String htmlFileName = lastFileName + ".html";
        String copiedDirectoryName = "";
        for (int i = 0; i < elementsInPath - 1; i++) {
            copiedDirectoryName = copiedDirectoryName + String.valueOf(path.getName(i)) + "/";   //could also firstly split directory (eg by \\.), and then String.join
        }
        copiedDirectoryName = copiedDirectoryName + htmlFileName;
        return copiedDirectoryName;
    }

    private static void fileAlreadyExists(List<String> listForHTML, Path path2) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plik html o podanej nazwie już istnieje, czy chcesz go zamienić kopiując plik? - Wciśnij Y/N");
        while (true) {
            String consoleMessage = scan.nextLine().trim();
            if (!consoleMessage.equalsIgnoreCase("y")
                    && !consoleMessage.equalsIgnoreCase("n")) {
                System.out.println("Podaj prawidłową wartość: Y/N");
            } else if (consoleMessage.equalsIgnoreCase("y")) {
                try {
                    Files.write(path2, listForHTML);
                } catch (IOException e) {
                    System.out.println("nie udało się zapisać kopii pliku");
                }
                break;
            } else
                break;
        }
    }

}