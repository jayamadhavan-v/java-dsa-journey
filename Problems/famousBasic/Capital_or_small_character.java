package Problems.famousBasic;

import java.util.Scanner;

public class Capital_or_small_character {

    public static void main(String[] args) {

        System.out.print("Enter the character To Check : ");
        char ch  = new Scanner(System.in).next().charAt(0);

        Capital_or_small_character c = new Capital_or_small_character();

        System.out.println( c.isCapitalOrSmall(ch));

    }
    String isCapitalOrSmall(char ch) {
        return  ch >= 'A'  && ch <= 'Z' ? "Capital" : ch >= 'a' && ch <= 'z' ? "Small" : "Not an Character ";
    }

}
