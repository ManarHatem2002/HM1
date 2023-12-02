public class CreditCardtest {
    private String cardNumber;
    private double creditLimit;
    private double balance;

    public CreditCardtest(String cardNumber, double creditLimit) {
        this.cardNumber = cardNumber;
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    public void updateCreditLimit(double newCreditLimit) {
        this.creditLimit = newCreditLimit;
    }

    public void charge(double amount) {
        if (amount > 0) {
            if (balance + amount <= creditLimit) {
                balance += amount;
                System.out.println("Charge of $" + amount + " processed. New balance: $" + balance);
            } else {
                System.out.println("Credit limit exceeded. Charge declined.");
            }
        } else {
            System.out.println("Invalid charge amount. Charge must be greater than zero.");
        }
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Payment of $" + amount + " processed. New balance: $" + balance);
        } else {
            System.out.println("Invalid payment amount. Payment must be greater than zero.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
