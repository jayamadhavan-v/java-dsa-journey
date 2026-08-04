package Problems.Recrusion.Basic;

import java.util.Scanner;

public class factorial_number {
    public static void main(String[] args) {
        System.out.print("enter a number : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
}
