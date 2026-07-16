package Problems.famousBasic;

import java.util.Scanner;

public class Find_The_year {
    public static void main(String[] args) {

        System.out.print("Enter the year: ");
        int year = new Scanner(System.in).nextInt();

        Find_The_year obj =new Find_The_year();

        System.out.println(obj.isYear(year));
    }

    boolean isYear(int year){
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                ? true : false;
    }

}
