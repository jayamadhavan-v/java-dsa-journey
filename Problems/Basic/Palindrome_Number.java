package Problems.Basic;

public class Palindrome_Number {
///https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {
        Palindrome_Number p = new Palindrome_Number();
        boolean result = p.isPalindrome(45);
        System.out.println(result);
    }
    public boolean isPalindrome(int n){
        if ( n < 0) return  false;
        int nCopy = n;
        int check = 0 ;
        while(n != 0){
            int rem = n % 10 ;
            check = (check * 10) + rem ;
            n = n / 10;
        }
        return nCopy == check ? true : false ;
    }
}
