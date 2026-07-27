package Problems.Pattern.Sqaure;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.print("Enter the value for the n: ");
        int n = new Scanner(System.in).nextInt();

        for (int row = 0 ;row < n; row++) {
            for (int col = 0 ;col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
