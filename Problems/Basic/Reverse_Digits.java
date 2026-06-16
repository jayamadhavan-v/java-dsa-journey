package Problems.Basic;

public class Reverse_Digits {
///  https://www.geeksforgeeks.org/problems/reverse-digit0316/1
    public int reverseDigits(int n){

        int rev = 0;

        if(n == 0) {
            return  0;
        }
        if( n == 1){
            return 1;
        }
        while(n > 0){
            int rem = n % 10 ;
            rev =( rev *10 )+rem;
            n = n/10;
        }
        return  rev;
    }
}
