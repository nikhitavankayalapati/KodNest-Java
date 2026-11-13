package track.Class_Practice.Bank;

import java.util.*;

class BankAccount {
    String holderName;
    String accountNumber;
    double balance;

    BankAccount(String holderName, String accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) throws InvalidamountException {
        if (amount <= 0) {
            throw new InvalidamountException();
        } else {
            balance += amount;
        }
    }

    void withdraw(double amount) throws InvalidamountException, InsufficientBalenceException {
        if (amount <= 0) {
            throw new InvalidamountException();
        } else if (amount > balance) {
            throw new InsufficientBalenceException();
        } else {
            balance -= amount;
        }
    }

    double checkBalance() {
        return balance;
    }

    void displaydetails() {
        System.out.println("Account holder: " + holderName);
        System.out.println("Account number: " + accountNumber);
    }
}

class InsufficientBalenceException extends Exception {
    InsufficientBalenceException() {
        super("Insufficient Balence");
    }
}

class InvalidamountException extends Exception {
    InvalidamountException() {
        super("check the amount amount must be positve");
    }

}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String holderName = sc.next();
        String accountNumber = sc.next();
        double balance = sc.nextDouble();
        BankAccount b = new BankAccount(holderName, accountNumber, balance);
        // System.out.println("bbalance: " + b.balance);

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                double depoamount = sc.nextDouble();
                b.displaydetails();
                try {
                    b.deposit(depoamount);
                    System.out.println("Deposited Successfully");

                } catch (InvalidamountException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                double withamount = sc.nextDouble();
                b.displaydetails();
                try {
                    b.withdraw(withamount);
                    System.out.println("withdraw successfull");
                } catch (InvalidamountException | InsufficientBalenceException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
        System.out.println("Current Balance: " + b.checkBalance());
        System.out.println("Transaction successfull");
        sc.close();

    }

}
