package Problems.Recrusion.Basic;

import java.util.Scanner;

public class Sum_of_natural_Number {

    public static void main(String[] args) {
        System.out.print("enter a number : ");
        int n = new Scanner(System.in).nextInt();
        System.out.println(sum(n));
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
}
