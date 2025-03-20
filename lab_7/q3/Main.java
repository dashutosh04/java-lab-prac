package lab_7.q3;

/*
 * Aim of the program - Write a program in Java to copy the content of a given file to another
user entered file using character stream (using File Reader and FileWriter Classes) and
byte Stream (using FileInputStream and FileOutputStream Class).
 */

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String source = sc.nextLine();
        System.out.print("Enter destination file name: ");
        String destination = sc.nextLine();
        try (FileReader fr = new FileReader(source);
                FileWriter fw = new FileWriter(destination)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied using character stream.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
