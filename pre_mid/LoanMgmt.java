package pre_mid;

import java.util.Scanner;

/*
 * This is the main entry point file of the program this contains the main function from where the execution starts.
 * The class is named LoanMgmt with the main method containing the menu.
 * 
 */

public class LoanMgmt {
    private static Scanner sc = new Scanner(System.in);

    private static void applyForLoan() {
        System.out.println("Id \t\t Type");
        System.out.println("-------------------------");
        System.out.println("1 \t\t Personal");
        System.out.println("2 \t\t Home");
        System.out.println("3 \t\t Car");
        System.out.println("*************************");

        System.out.print("Select a Loan Type Id: ");
        int loanTypeId = sc.nextInt();

        Loan loanType = LoanManager.getLoanTypeDetail(loanTypeId);
        if (loanType == null) {
            System.out.println("Invalid loan type id!");
            return;
        }

        System.out.println("Id \t\t Name");
        System.out.println("-----------------------------");
        Customer[] customers = LoanManager.getCustomers();

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println(customers[i].getId() + "\t\t" + customers[i].getName());
            }
        }
        System.out.println("*****************************");
        System.out.print("Enter customer Id: ");
        int customerId = sc.nextInt();

        Customer customer = LoanManager.getCustomer(customerId);
        if (customer == null) {
            System.out.println("Invalid customer id!");
            return;
        }

        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        LoanApplication loanApplication = new LoanApplication(
                LoanIdGen.getId(),
                loanType,
                customer,
                "NEW");

        loanApplication.getLoan().setAmount(loanAmount);
        String status = LoanManager.applyForLoan(loanApplication);

        if (status == "APPROVED") {
            System.out.println("Congratulations!!! Your loan request has been approved.");
        } else {
            System.out.println("Sorry! Your loan request is rejected.");
        }
    }

    private static void displayLoanDetails() {
        LoanApplication[] loanApplications = LoanManager.getApplications();
        int applicationCount = LoanManager.getApplicationCount();

        if (applicationCount == 0) {
            System.out.println("Sorry!! No loan applications found!");
            return;
        }

        System.out.println("****************************************************");
        System.out.println("Id \t Loan \t\t Customer \t Status");
        for (int i = 0; i < applicationCount; i++) {
            LoanApplication application = loanApplications[i];
            System.out.println(application.getId() + "\t " + application.getLoan().getName() + "\t "
                    + application.getCustomer().getName() + "\t\t" + application.getStatus());
        }
        System.out.println("=====================================================");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Apply for a new loan");
            System.out.println("2. View all Loan Application Status");
            System.out.println("3. Exit");
            System.out.print("Enter choice [1/2/3]: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    applyForLoan();
                    break;
                case 2:
                    displayLoanDetails();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
