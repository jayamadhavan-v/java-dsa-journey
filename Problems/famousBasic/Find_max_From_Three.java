package Problems.famousBasic;

import java.util.Scanner;

public class Find_max_From_Three {


    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        Find_max_From_Three obj = new Find_max_From_Three();

        int res = obj.findTheMax(a, b, c);

        System.out.println(res);
    }

    int findTheMax(int a, int b, int c) {
        return a > b && a > c ? a : b > c ? b : c;
    }
}
