package pl.coderslab.datainput;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
//3 solutions:

        textLines3();
    }

    public static void textLines() {
        StringBuilder textLines = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź tekst");
        for (; ; ) {
            String textLine = scan.nextLine();
            if (textLine.equals("quit"))
                break;
            textLines.append(textLine).append(" ");
            System.out.println("wprowadź kolejny tekst (aby wyjść wprowadź quit)");
        }
        System.out.println("Wprowadzony tekst: " + textLines.toString());
    }

//2nd Solution:
    public static void textLines2() {
        String textLine = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź tekst");
        for (; ; ) {
            String scanTextLine = scan.nextLine();
            if (scanTextLine.equals("quit"))
                break;
            textLine += " " + scanTextLine;
            System.out.println("wprowadź kolejny tekst (aby wyjść wprowadź quit)");
        }
        System.out.println("Wprowadzony tekst: " + textLine);
    }

//3rd Solution:  - allow "quit" in the middle of the sentence
    public static void textLines3() {
        StringBuilder textLines = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź tekst");
        quitCheck:
        for (; ; ) {
            String textLine = scan.nextLine();
            String[] textLineArray = textLine.split(" ");
            for (int i = 0; i < textLineArray.length; i++) {
                if (textLineArray[i].equals("quit"))
                    break quitCheck;
                textLines.append(textLineArray[i] + " ");
            }
            System.out.println("Wprowadź tekst (aby wyjść wprowadź quit)");
        }
        String result = textLines.toString();
        System.out.println("Wprowadzony tekst: " + result);

    }

}
