
import java.util.*;

public class TrafficFineSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Speed: ");
        int speed = sc.nextInt();

        System.out.print("Repeated violation (Y/N): ");
        String repeated = sc.next();

        int fine = 0;

        if (speed > 100) {
            fine = 1000;
        } else if (speed > 80) {
            fine = 500;
        }

        if (repeated.equalsIgnoreCase("Yes")) {
            fine = fine * 2;
        }

        System.out.println("Fine = " + fine);
    }
}
