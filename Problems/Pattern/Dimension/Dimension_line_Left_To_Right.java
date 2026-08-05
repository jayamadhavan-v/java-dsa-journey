package Problems.Pattern.Dimension;

import java.util.Scanner;

public class Dimension_line_Left_To_Right {

    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter the number : ");
        int n = new Scanner(System.in).nextInt();

        printPattern(n);
    }

    /*
        *
            *
                *
                    *
     */
    public static void printPattern(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(i==j) {
                    System.out.print("* ");
                    Thread.sleep(200);

                }
                else {
                    System.out.print("  ");
                    Thread.sleep(200);
                }
            }
            System.out.println();
            Thread.sleep(100);
        }
    }
}
