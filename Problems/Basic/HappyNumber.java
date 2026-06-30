package Problems.Basic;
import java.util.HashSet;

public class HappyNumber {
/// [...](https://leetcode.com/problems/happy-number/description/)
    public static void main(String[] args) {
        HappyNumber p = new HappyNumber();
//        boolean isHappy = p.isHappy(3);
//        System.out.println(isHappy);
        boolean isHappy2 = p.isHappy2(2);
        System.out.println(isHappy2);
    }

//    my Approach is wrong
    public boolean isHappy(int n){
        if( n  == 1){
            return  true;
        }
        if(n < 2){
                return false;
        }
        int val = 0;
        while( val != 1){
            int rem = n % 10;
            val += (int) Math.pow(rem, 2);
            n = n/10;
            if(n == 0){
                n = val;
                if (val == 1) break;
                System.out.println(n);
                val =0 ;
            }
        }
        return true;
    }

//    Another approach using the Hashset
    public boolean isHappy2(int n){

        HashSet<Integer> happy = new HashSet<>();
        int val = 0;
        while (true){
            int last = n % 10 ;
            val += (int) Math.pow(last ,2);
            n = n/10;
            if (n==0) {
                if (happy.contains(val)) return false;
                if (val == 1) return true;
                happy.add(val);
                n = val;
                val = 0;
            }
        }
    }
}
