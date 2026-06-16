package Problems.Basic;

public class Power_Of_Numbers_by_reverse_Number {

/// https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1

    public  int reverseExponentiation(int n){
        if( n == 0 ){
            return  0 ;
        }
        if( n == 1){
            return  1;
        }
        int nCopy = n;
        // reverse the number
        int rev = 0;
        while (n > 0){
            int rem = n % 10 ;
             rev = ( rev *10 ) + rem;
             n /= 10 ;
        }

        // math.pow by the reversed no
        return  (int) Math.pow( nCopy , rev) ;
    }
}
