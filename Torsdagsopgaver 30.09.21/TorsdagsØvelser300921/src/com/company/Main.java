package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split("[ ,.]");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);

        printLongestWord();

        printFirstHalfOfEachWord();

        printMostFrequentLetter();

        //printLessFrequentLetter();
        //test dine metoder ved at kalde dem her:


    }

    private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (String s : text) {
            if (s.length() == l) {
                if (s.contains(",") || s.contains(".")) {
                    wordisvalid = false;
                }

                if (wordisvalid) {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern) {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    // Opgave 1
    //Vi bruger en for loop til at køre igennem teksten.
    //Vi definere en counter, med værdien 0, som skal tælle/gemme ord, indtil den finder det længste ord.
    //String longestWord sættes som tom.
    //Vores if statements tager vores counter og sammenligner med vores i værdi og gemmer ordet.
    //Ordet skiftes ud, hvis counter møder et større ord
    //longestWord bliver gemt i vores i værdi.
    private static void printLongestWord() {
        int counter = 0;
        String longestWord = "";
        for (int i = 0; i < text.length; i++) {
            if (counter < text[i].length()) {
                counter = text[i].length();
                longestWord = text[i];
            }
        }
        System.out.println(longestWord);
    }

    // Opgave 2
    //Vi bruger for loopen som allerede blev defineret tidligere i vores main method
    //Vi bruger funktionen substring og indsætter 2 værdier. Fx. at den skal starte på plads 0 og bruge ordets længde, hvor vi dividere det med 2 for kun at printe det halve.
    private static void printFirstHalfOfEachWord() {
        for (String s : text) {
            System.out.println(s.substring(0, s.length() / 2));
        }
    }

    //Opgave 3
    private static char printMostFrequentLetter() {
  char mostFrequentLetter = ' ';
    int counter = 0;
    int[] charCount = new int[Character.MAX_VALUE +1];
    for (String s : text) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount[ch]++;
            if (charCount[ch] >= counter) {
                counter = charCount[ch];
                mostFrequentLetter = ch;
            }

        }
        System.out.println("The max character is " + mostFrequentLetter + " and displayed " + counter + "times");

    }
    return mostFrequentLetter;
    }











    //Vi laver en String array med 29 bogstaver fra alfabetet (a-å)
    //Vi laver en int array med 29 pladser, der skal gemme vores bogstav og tælle hvor mange gange det er blevet brugt
    //Vi bruger en for loop som tidligere er defineret
    //Vi bruger en for loop til at køre igennem hele teksten og kører igennem hver eneste ords længde
    //Vi bruger equalsIgnoreCase så den tager både store og små bogstaver

    /*private static void printMostFrequentLetter() {
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
        int[] timesUsed = new int[29];
        for (String s : text) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < characters.length; j++) {
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(characters[j])) {
                        timesUsed[j]++;
                    }
                }
            }
        }

        int mostUsedLetter;
        int mostUsed = 0;
        int indexOfMostUsed = 0;
        for (int i = 0; i < timesUsed.length; i++) {
            mostUsed = timesUsed[i];
            indexOfMostUsed = i;
        }
        mostUsedLetter = mostUsed;
        System.out.println(characters[indexOfMostUsed] + " has been used " + mostUsed);*/
    }
    //Opgave 4
    /*private static void printLessFrequentLetter(){
        int mostUsedLetter = 0;
        String[] characters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};
        int [] timesUsed = new int[29];
        for(String s : text){
            for(int i=0; i<s.length(); i++){
                for(int j=0; j<characters.length; j++) {
                    if (String.valueOf(s.charAt(i)).equalsIgnoreCase(characters[j])) {
                        timesUsed[j]++;
                    }
                }
                    }

                }
            int leastUsed = mostUsedLetter;
        int indexOfLeastUsed = 0;
        for(int i=0; i<timesUsed.length; i++){
            if(timesUsed[i]<= leastUsed){
             leastUsed = timesUsed[i];
             indexOfLeastUsed = i;

            }

        }
        System.out.println(characters[indexOfLeastUsed] + " has been used " + leastUsed + " times");

        }
    }*/


/*private static char printMostFrequentLetter() {
  char mostFrequentLetter = ' ';
  //String checkText = "";
    int counter = 0;
    int[] charCount = new int[Character.MAX_VALUE +1];
    for (String s : text) {
      //checkText += s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount[ch]++;
            if (charCount[ch] >= counter) {
                counter = charCount[ch];
                mostFrequentLetter = ch;
            }

        }
        System.out.println("The max character is " + mostFrequentLetter + " and displayed " + counter + "times");

    }
    return mostFrequentLetter;
    }



        }

    /* private static char printMostFrequentLetter() {
  char mostFrequentLetter = ' ';
    int counter = 0;
    int[] charCount = new int[Character.MAX_VALUE +1];
    for (String s : text) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charCount[ch]++;
            if (charCount[ch] >= counter) {
                counter = charCount[ch];
                mostFrequentLetter = ch;
            }

        }
        System.out.println("The max character is " + mostFrequentLetter + " and displayed " + counter + "times");

    }
    return mostFrequentLetter;
    }*/

