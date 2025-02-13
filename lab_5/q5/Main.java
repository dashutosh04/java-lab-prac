package lab_5.q5;

/*
 * Create a Java program to demonstrate the use of the final keyword in a real-life scenario of a company's employee system. 
 * Create a class Employee with a final attribute companyName set to "TechCorp". 
 * Add a final method displayCompanyName() to print the company name. 
 * Create a subclass Developer that tries to override displayCompanyName() (this should result in a compilation error). 
 * In the main method, create an object of Employee and call displayCompanyName().
 */

class Employee {
    final String companyName = "TechCorp";

    final void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }
}

class Developer extends Employee {
    public Developer() {
        try {
            displayCompanyName();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee();
            emp.displayCompanyName();
            new Developer();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
