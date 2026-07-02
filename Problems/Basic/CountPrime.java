package Problems.Basic;

public class CountPrime {
    public static void main(String[] args) {
        CountPrime p = new CountPrime();
        int cnt  =  p.countPrimes(15);
        System.out.println(cnt);
    }

    /// [](https://leetcode.com/problems/count-primes/)
    public int countPrimes(int n) {
        int e = 2;
        int cnt =0 ;
        while (e < n){
            boolean isPrime =true ;
            for (int i = 2; i*i <= e; i++) {
                if(e % i == 0 && e != i){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                cnt++;
            }
            e++;
        }
        return cnt;
    }


    // optimal sollution


    public int countPrimes2(int n) {

            if (n <= 2)
                return 0;

            boolean[] isPrime = new boolean[n];

            // Assume every number from 2 to n-1 is prime
            for (int i = 2; i < n; i++) {
                isPrime[i] = true;
            }

            // Mark multiples as non-prime
            for (int i = 2; i * i < n; i++) {   /* if i = 3 if removes the mutilple of 3  */

                if (isPrime[i]) {

                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }

                }
            }

            // Count remaining prime numbers
            int count = 0;

            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            return count;
        }

}
