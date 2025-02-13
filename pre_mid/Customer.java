package pre_mid;

/*
 * This file conatins the Customer class, with data members id,name,age,salary.
 * It also has getter methods for the data memebers to fetch the data when needed.
 */

public class Customer {
    private int id;
    private int age;
    private String name;
    private double salary;

    public Customer(int id, String name, int age, double salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
