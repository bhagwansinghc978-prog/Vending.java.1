
import java.util.*;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxAttempts = 3;
        String correctPassword = "7410";

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.print("Enter password: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("Login Successful");
                return;
            } else {
                System.out.println("Wrong password");
            }
        }

        System.out.println("Account Locked");
    }
}
