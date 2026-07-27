package Problems.famousBasic;

import java.util.Scanner;

public class xylem_or_phloem {
    public static void main(String[] args) {

        System.out.print("Enter the value for the n  To check the Whether the given Number xylem or Phloem  : ");
        int n = new Scanner(System.in).nextInt();

        System.out.println("Given Number is " + check(n));


    }

//    My approach

    public static String check(int n) {

        n = Math.abs(n);

        if (n < 10)
            return "Xylem";

        int fSum = 0;
        int sSum = 0;

        fSum = n % 10;
        int rem = 0;

        while (n != 0) {
            rem = n % 10;
            sSum += rem;
            n /= 10;
        }

        fSum += rem;

        return sSum - fSum == fSum ? "xylem" : "phloem";
    }

}
