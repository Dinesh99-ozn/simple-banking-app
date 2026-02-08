import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            }
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            }
            else if (choice == 3) {
                account.checkBalance();
            }
            else if (choice == 4) {
                System.out.println("Thank you. Program exited.");
                break;
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
