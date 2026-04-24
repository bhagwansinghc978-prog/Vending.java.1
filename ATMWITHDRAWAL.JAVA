import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw > balance) {
            System.out.println("Transaction Failed: Insufficient Balance");
        } else if ((balance - withdraw) < 1000) {
            System.out.println("Transaction Failed: Minimum Balance Violation");
        } else {
            double newBalance = balance - withdraw;
            System.out.println("Transaction Successful!");
            System.out.println("Remaining Balance = " + newBalance);
        }
    }
}