package Problems.famousBasic;

import java.util.Scanner;

public class Sum_Of_Natural_Number {
    public static void main(String[] args) {

        System.out.print("Enter the value for the N : ");
        int n = new Scanner(System.in).nextInt();

        System.out.println("Sum of N Natural Number : " + sumNatural(n) );
    }
    public static int sumNatural(int n){
        int sum = 0;
        int  i = 0;
        while ( i<= n ){
            sum += i++;
        }
        return sum;
    }
}
