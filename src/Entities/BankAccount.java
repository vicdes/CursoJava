package Entities;
public class BankAccount {
    private int accountNumber;
    private String name;
    private double accountBalance;


    public String getName() {
        return name;
    }

    public BankAccount(int accountNumber, String name, double initialDeposit){
        this.accountNumber = accountNumber;
        this.name = name;
        deposit(initialDeposit);
    }

    public BankAccount(int accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccount() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
    }

    public void withdraw(double amount) {
        accountBalance -= amount + 5.0;
    }

    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }
}
