package Problems.Basic;

public class ReverseInteger {

    public static void main(String[] args) {
            ReverseInteger p = new ReverseInteger();
            int result = p.reverse(-321);
        System.out.println(result);
    }

    public int reverse(int n){
        int rev = 0;
        while ( n != 0 ){
            int rem = n % 10;
            rev  = (rev * 10 )+ rem ;
            n  = n /10 ;
        }

        return rev ;
    }

}
