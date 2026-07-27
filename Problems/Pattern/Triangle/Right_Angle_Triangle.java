package Problems.Pattern.Triangle;

import java.util.Scanner;

public class Right_Angle_Triangle {
    /*      col
             |
      row-->*
            *  *
            *  *  *
     */
    /*
     first row then col
     [ 11,12,13
       21,22,23
       31,32,33 ]
     */

    public static void main(String[] args) {
        System.out.print("Enter the value for the n: ");
        int n = new Scanner(System.in).nextInt();

        for (int row = 0; row < n; row++) {
            System.out.print(row+1 + " ");
            for (int col = 0; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
