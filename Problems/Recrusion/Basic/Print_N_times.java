package Problems.Recrusion.Basic;

import java.io.IOException;
import java.util.Scanner;

public class Print_N_times {
    public static void main(String[] args)throws Exception {
        System.out.print("Enter the value to print the hello : ");
        int n = new Scanner(System.in).nextInt();
        print(n);
    }

    static void print(int n) throws InterruptedException {

        if(n == 0){
            return;
        }
        Thread.sleep(500);
        System.out.println("hello");
        print(n-1);
    }
}
