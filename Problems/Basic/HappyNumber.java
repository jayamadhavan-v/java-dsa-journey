package Problems.Basic;

public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber p = new HappyNumber();
        boolean isHappy = p.isHappy(3);
        System.out.println(isHappy);
    }
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
}
