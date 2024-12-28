package javaproject;

class Account {
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds!");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account(500);
        account.displayBalance();
        account.deposit(200);
        account.withdraw(100);
        account.displayBalance();
    }
}