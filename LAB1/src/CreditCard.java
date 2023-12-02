public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public void updateCreditLimit(int newLimit) {
        limit = newLimit;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false; // Charge would exceed credit limit
        }
        balance += price;
        return true; // Charge successful
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            return; // Ignore negative payment amount
        }
        balance -= amount;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard("John Doe", "ABC Bank", "1234 5678 9012 3456", 5000, 1000);

        System.out.println("Customer: " + card.getCustomer());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Account: " + card.getAccount());
        System.out.println("Credit Limit: " + card.getLimit());
        System.out.println("Balance: " + card.getBalance());

        // Update the credit limit
        card.updateCreditLimit(7000);
        System.out.println("Updated Credit Limit: " + card.getLimit());

        // Make a negative payment
        card.makePayment(-200);
        System.out.println("After Negative Payment - Balance: " + card.getBalance());

        // Make a valid payment
        card.makePayment(500);
        System.out.println("After Valid Payment - Balance: " + card.getBalance());
    }
}
