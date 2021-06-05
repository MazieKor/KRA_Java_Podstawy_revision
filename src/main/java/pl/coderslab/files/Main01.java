package pl.coderslab.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
//2 solutions

        toAFileAdvanced();
    }

//1st Solution:
    public static void toAFile() {
        System.out.println("Podaj wpis do pliku. Aby zakończyć działanie wpisz \"quit\"");
        Scanner scan = new Scanner(System.in);
        while (true) {
            String lineToCopy = scan.nextLine();
            if (lineToCopy.trim().equalsIgnoreCase("quit"))
                break;
            writeToAFile(lineToCopy);
        }
    }

    private static void writeToAFile(String lineToCopy) {
        try {
            FileWriter stringToAFile = new FileWriter("src/main/java/pl/coderslab/files/FileTask1.txt", true);
            stringToAFile.append(lineToCopy + "\n");
            stringToAFile.close();    //version without try with resources
            System.out.println("Podaj wpis do pliku. Aby zakończyć działanie wpisz \"quit\"");
        } catch (IOException e) {
            System.out.println("Problem z zapisem pliku. Spróbuj jeszcze raz lub wyjdź z programu (quit)");
        }
    }

//2nd Solution - advanced (in 1, big method)
    public static void toAFileAdvanced() {
        method:
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Jeśli chcesz zapisać w istniejącym pliku wpisz 1. Jeśli chcesz utworzyć nowy plik wpisz 2. Jeśli chcesz wyjść z programu wpisz 3");
            String firstInput = scan.nextLine().trim();
            if (firstInput.equals("1")) {
                while (true) {
                    String messageForDirectory = "Podaj ścieżkę do pliku wraz z plikiem w którym chcesz zapisać dane. Jeśli chcesz się cofnąć wciśnij quit";
                    System.out.println(messageForDirectory);
                    String directory = scan.nextLine().trim();
                    if (directory.equalsIgnoreCase("quit")) {
                        continue method;
                    }
                    File file = new File(directory);    // NEW -jak już podam directory chyba nie moge zmienić w pliku file
                    if (!file.isFile()) {
                        System.out.print("Podany plik nie istnieje. ");
                        continue;
                    }
                    System.out.println("Jeśli chcesz dodać nowe dane do istniejących w pliku wybierz 1. Jeśli chcesz zastąpić istniejące dane wybierz 2.");
                    boolean fileWriterOption;
                    fileWriter:
                    while (true) {
                        String fileWriterSaveOption = scan.nextLine();
                        switch (fileWriterSaveOption) {
                            case "1":
                                fileWriterOption = true;
                                break fileWriter;
                            case "2":
                                fileWriterOption = false;
                                break fileWriter;
                            default:
                                System.out.println("podałeś nieprawidłowe dane. Jeśli chcesz dodać nowe dane do istniejących w pliku wybierz 1. Jeśli chcesz zastąpić istniejące dane wybierz 2.");
                        }
                    }

                    try (FileWriter toSave = new FileWriter(directory, fileWriterOption)) {
                        while (true) {
                            System.out.println("wpisz dane do pliku. Aby wyjść wpisz quit");
                            String scanLine = scan.nextLine();
                            if (scanLine.equalsIgnoreCase("quit"))
                                break;
                            toSave.append(scanLine + "\n");
                        }
                    } catch (IOException e) {
                        System.out.println("problem z plikiem");
                    }
                    break;
                }
            } else if (firstInput.equals("2")) {
                newFile:
                while (true) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("podaj ścieżką, w której chcesz utworzyć plik");
                    String pathToFile = scan2.nextLine();
                    File file = new File(pathToFile);
                    if (!file.isDirectory()) {
                        System.out.println("Podana ścieżka nie istnieje. Czy spróboać utworzyć - wciśniej Y lub N. Jeśli chcesz zacząć program od początku wpisz quit");
                        while (true) {
                            String createNewPath = scan2.nextLine().trim();
                            if (createNewPath.equalsIgnoreCase("quit"))
                                continue method;
                            if (!createNewPath.equalsIgnoreCase("y") && !createNewPath.equalsIgnoreCase("n")) {
                                System.out.println("niepoprawne dane. wprowadź jeszcze raz (Y/N). Jeśli chcesz zacząć program od początku wpisz quit");
                                continue;
                            } else if (createNewPath.equalsIgnoreCase("n")) {
                                continue newFile;
                            } else {
                                if (file.mkdirs()) {
                                    System.out.println("utworzono nową ścieżkę. Sprawdzenie: " + file.isDirectory());
                                    break;
                                } else {
                                    System.out.println("nie dało się utworzyć ścieżki. Spróbuj od początku");
                                    continue newFile;
                                }
                            }
                        }
                    }
                    System.out.println("podaj nazwę pliku do utworzenia. Jesli chcesz zacząć cały program od początku wpisz quit");
                    String fileToCreate;
                    while (true) {
                        fileToCreate = scan2.nextLine();
                        if (fileToCreate.equals("quit"))
                            continue method;
                        File file2 = new File(pathToFile + "/" + fileToCreate);
                        if (file2.isFile()) {
                            System.out.println("podany plik już istnieje. Wybrałes opcję utworzenia nowego pliku. Podaj inną nazwę. Jeśli chcesz zacząc od początku wpisz quit");
                            continue;
                        }
                        break;
                    }
                    File file2 = new File(pathToFile + "/" + fileToCreate);
                    try {
                        file2.createNewFile();
                    } catch (IOException e) {
                        System.out.println("Błąd przy tworzeniu pliku");
                        continue newFile;
                    }
                    System.out.println("Test - czy plik został utworzony: " + file2.isFile());
                    try (PrintWriter printWriter = new PrintWriter(pathToFile + "/" + fileToCreate)) {
                        while (true) {
                            System.out.println("wpisz dane do pliku. Aby wyjść wpisz quit");
                            String toAFile = scan2.nextLine();
                            if (toAFile.equalsIgnoreCase("quit")) {
                                break newFile;
                            }
                            printWriter.println(toAFile);
                        }
                    } catch (IOException e) {
                        System.out.println("Błąd w zapisie. Spróbuj jeszcze raz");
                        continue newFile;
                    }
                }
            } else if (!firstInput.equals("3")) {
                System.out.print("Podałeś złą wartość. Spróbuj jeszcze raz. ");
                continue method;
            } else
                System.out.println("wybrałeś wyjście z programu");
            break;
        }
    }
}