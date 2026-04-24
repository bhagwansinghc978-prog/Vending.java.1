
import java.util.Scanner;

public class OddEvenGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddCount = 0;
        int evenCount = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            } else if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    }
}
