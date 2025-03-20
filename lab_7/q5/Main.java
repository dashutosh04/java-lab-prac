package lab_7.q5;

/*5. Aim of the program -Write a java program that displays the number of characters, no. of
lines and no. of words present in a text file whose name is given by the user. */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = sc.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int characters = 0, words = 0, lines = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                words += line.split("\\s+").length;
            }
            System.out.println("No. of characters: " + characters);
            System.out.println("No. of lines: " + lines);
            System.out.println("No. of words: " + words);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
        
    }
}
