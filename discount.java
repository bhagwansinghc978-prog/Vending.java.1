
import java.util.Scanner;

public class DiscountEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        System.out.print("Is Premium? (y/n): ");
        String premiumInput = sc.next();
        boolean isPremium = premiumInput.equalsIgnoreCase("yes");

        double discount = 0;

        if (amount >= 5000) {
            discount = 20;
        } else if (amount >= 3000) {
            discount = 10;
        } else {
            discount = 0;
        }

        if (isPremium) {
            discount += 5;
        }

        double finalAmount = amount - (amount * discount / 100);
        System.out.println("Final Amount = " + (int) finalAmount);
    }
}
