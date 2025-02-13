package pre_mid;

/*
 * This file contains the LoanApplication class with data members id, loan,customer and status
 * It has getter methods for fetching the data when needed.
 * It also has a setter method to set the status when changed.
 */

public class LoanApplication {

    private int id;
    private Loan loan;
    private Customer customer;
    private String status;

    public LoanApplication(int id, Loan loan, Customer customer, String status) {
        this.id = id;
        this.loan = loan;
        this.customer = customer;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Loan getLoan() {
        return loan;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}