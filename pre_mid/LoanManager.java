package pre_mid;

/*
 * This file contains the LoanManager class with data memebers to store the data of customers loans and applications.
 * It adds 5 dummy customer values into the customer array with varied values.
 * It has methods to apply for loan and get details.
 */

public class LoanManager {
    private static final int MAX_CUSTOMERS = 5;
    private static final int MAX_LOANS = 5;
    private static final int MAX_APPLICATIONS = 10;

    public static Customer[] customers = new Customer[MAX_CUSTOMERS];
    private static Loan[] loans = new Loan[MAX_LOANS];
    private static LoanApplication[] applications = new LoanApplication[MAX_APPLICATIONS];
    private static int applicationCount = 0;

    static {
        customers[0] = new Customer(1, "Arun", 35, 80000);
        customers[1] = new Customer(2, "Bhavna", 25, 50000);
        customers[2] = new Customer(3, "Cauvery", 40, 120000);
        customers[3] = new Customer(4, "Mukul", 45, 20000);
        customers[4] = new Customer(5, "Nikhil", 22, 80000);

        loans[0] = new Loan(1, "Personal", 21, 30000);
        loans[1] = new Loan(2, "Home", 25, 50000);
        loans[2] = new Loan(3, "Car", 23, 40000);
    }

    public static Customer[] getCustomers() {
        return customers;
    }

    public static Customer getCustomer(int customerId) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null && customers[i].getId() == customerId) {
                return customers[i];
            }
        }
        return null;
    }

    public static Loan getLoanTypeDetail(int loanTypeId) {
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] != null && loans[i].getId() == loanTypeId) {
                return loans[i];
            }
        }
        return null;
    }

    public static String applyForLoan(LoanApplication loanApplication) {
        if (applicationCount >= MAX_APPLICATIONS) {
            return "REJECTED";
        }

        Customer customer = loanApplication.getCustomer();
        Loan loanType = loanApplication.getLoan();

        if (customer == null || loanType == null) {
            return "REJECTED";
        }

        boolean isEligible = customer.getAge() >= loanType.getAgeLimit()
                && customer.getSalary() >= loanType.getSalaryLimit();

        if (isEligible) {
            loanApplication.setStatus("APPROVED");
            applications[applicationCount++] = loanApplication;
            return "APPROVED";
        } else {
            return "REJECTED";
        }
    }

    public static LoanApplication[] getApplications() {
        return applications;
    }

    public static int getApplicationCount() {
        return applicationCount;
    }
}