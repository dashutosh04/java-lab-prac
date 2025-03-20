package lab_7.q2;

/*
 * 2. Aim of the program - Write a java program which will accept students details like Student
RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in
a file. Again open the file, read the content and display all.
 */
import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the file name to store data: ");
            String filename = sc.nextLine();
            FileWriter writer = new FileWriter(filename, true);
            writer.write(rollNo + "," + name + "," + subject + "," + marks + "\n");
            writer.close();
            System.out.println("Student details saved successfully.");
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println("\nStored Student Details:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
        sc.close();
    }

}
