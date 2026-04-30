public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int j = 65;
        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) {
                System.out.print(" ");
                System.out.print((char) j);
                j += 1;
            } else {
                System.out.print((char) (j + 1));
                System.out.print((char) j);
                System.out.print((char) (j + 2));
                j+=3;

            }
            System.out.println();
        }
    }
}

// Question 2
// A
// C B D
// E
// G F H
// I

