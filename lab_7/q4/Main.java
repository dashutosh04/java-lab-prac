package lab_7.q4;

/*4. Aim of the program -Write a java program to compare two binary files, printing the first byte
position where they differ. */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary file name: ");
        String file1 = sc.nextLine();
        System.out.print("Enter second binary file name: ");
        String file2 = sc.nextLine();
        try (FileInputStream fis1 = new FileInputStream(file1);
                FileInputStream fis2 = new FileInputStream(file2)) {
            int byte1, byte2, position = 0;
            boolean areEqual = true;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                position++;
                if (byte1 != byte2) {
                    System.out.println("Files are not equal. Differ at byte position: " + position);
                    areEqual = false;
                    break;
                }
            }
            if (areEqual && fis1.read() == -1 && fis2.read() == -1) {
                System.out.println("Files are equal.");
            }
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
        sc.close();
    }
}
