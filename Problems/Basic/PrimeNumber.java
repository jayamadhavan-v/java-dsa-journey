package Problems.Basic;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber p = new PrimeNumber();

        //  boolean result = p.isPrint(0);

        boolean result = isPrime(23);
        System.out.println(result);
    }
    boolean isPrint(int n){

        if ( n == 0) {
            return false;
        }
        if (n == 1) {
            return  false;
        }
        for (int i = 2; i < n-1; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

        // optimal Solution

    static  boolean  isPrime(int n){

        if(n<=1){
            return false;
        }
        for (int i = 2; i*i <= n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
