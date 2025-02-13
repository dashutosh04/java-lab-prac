package pre_mid;

// Class just to increase the Loan Id count by one each time its called.

public class LoanIdGen {
    private static int id = 1;

    public static int getId() {
        return id++;
    }
}