package pre_mid;

/*
 * This file contains the Loan class with data memebers id, name, agelimit, SalaryLimit, amount
 * It also has getter methods to fetch the data when needed.
 */

public class Loan {
    private int id;
    private String name;
    private int ageLimit;
    private double salaryLimit;
    private double amount;

    public Loan(int id, String name, int ageLimit, double salaryLimit) {
        this.id = id;
        this.name = name;
        this.ageLimit = ageLimit;
        this.salaryLimit = salaryLimit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public double getSalaryLimit() {
        return salaryLimit;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}