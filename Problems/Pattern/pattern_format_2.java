package Problems.Pattern;

import java.util.Scanner;

public class pattern_format_2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter the number : ");
        int n = new Scanner(System.in).nextInt();

        printPattern(n);
    }

    /*
         0  1  2  3  4
         0  1  2  3  4
         0  1  2  3  4
         0  1  2  3  4
     */
    static void printPattern(int n) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(j + " ");
                Thread.sleep(200);
            }
            System.out.println();
            Thread.sleep(150);
        }
    }
}
