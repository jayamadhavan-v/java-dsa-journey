package Problems.Pattern.Dimension;

import java.util.Scanner;

public class Dimension_line_Right_To_Left {

    public static void main(String[] args) throws InterruptedException {
        System.out.print("Enter the number : ");
        int n = new Scanner(System.in).nextInt();

        printPattern1(n);
        printPattern2(n);

    }

    /*
                    *
                *
            *
          *
     */

    static void printPattern1(int n) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if( i+j == n-1){
                    System.out.print("  *");
                    Thread.sleep(200);
                    break;
                }else {
                    System.out.print("  ");
                    Thread.sleep(200);
                }
            }
            System.out.println();
            Thread.sleep(200);
        }
    }

    static  void printPattern2(int n) throws InterruptedException {
        for(int i = n; i > 0;i--){
            for(int j = 0; j <= i ; j++){
                if(i==j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
