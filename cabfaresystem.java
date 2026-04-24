import java.util.Scanner;

public class CabFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Is it Night? (yes/no): ");
        String nightInput = sc.next();
        boolean isNight = nightInput.equalsIgnoreCase("yes");

        double fare = 0;

        if (distance <= 5) {
            fare = distance * 50;
        } else if (distance <= 10) {
            fare = (5 * 50) + ((distance - 5) * 40);
        } else {
            fare = (5 * 50) + (5 * 40) + ((distance - 10) * 30);
        }

        if (isNight) {
            fare = fare + (fare * 20 / 100);
        }

        System.out.println("Total Fare = ₹" + fare);
    }
}