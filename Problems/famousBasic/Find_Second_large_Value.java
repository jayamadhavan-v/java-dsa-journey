package Problems.famousBasic;

import java.util.Scanner;

public class Find_Second_large_Value {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        Find_Second_large_Value obj = new Find_Second_large_Value();

        System.out.println("second large value among the Three :  " + obj.findSecond(a,b,c));
    }

    int findSecond(int a,int b,int c){

        return (a > b && a > c) ?  b > c ? b : c : (b > a && b > c ) ?  a > c ? a : c : b > a ? b : a ;
    }



}
