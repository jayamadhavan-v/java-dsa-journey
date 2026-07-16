package Problems.famousBasic;

import java.util.Scanner;

public class Letter_Symbol_number {

    public static void main(String[] args) {

        System.out.print("Enter a Value to  Checks : ");
        char ch = new Scanner(System.in).next().charAt(0);

        Letter_Symbol_number obj = new Letter_Symbol_number();

        System.out.println(obj.getFind(ch));
    }

    String getFind(char ch){

        return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') ? "Character " :
                (ch >= '0' && ch <= '9') ?  "Number " : "Special character";
    }
}
