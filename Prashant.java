class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Invalid initial balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: RS" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: RS" + amount);
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class prashant {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        account.deposit(2000);
        account.withdraw(1500);
        account.deposit(100);
        account.withdraw(7000);

        System.out.println("Final Balance: RS" + account.getBalance());
    }
}
