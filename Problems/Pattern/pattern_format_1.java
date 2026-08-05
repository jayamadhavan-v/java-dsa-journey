package Problems.Pattern;

import java.util.Scanner;

public class pattern_format_1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter the number : ");
        int n = new Scanner(System.in).nextInt();

        printPattern(n);
    }

    /*
        0  0  0  0  0
        1  1  1  1  1
        2  2  2  2  2
        3  3  3  3  3
        4  4  4  4  4
     */
    public static void printPattern(int n) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print( i + " ");
                Thread.sleep(200);
            }
            System.out.println();
            Thread.sleep(100);
        }
    }
}
