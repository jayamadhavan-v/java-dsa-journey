package Problems.Basic;

public class GCD {


    public static void main(String[] args) {
        GCD ref = new GCD();
        int result = ref.gcd(81,153);
        int res2 = ref.gcd2(81,153);
        System.out.println(res2);
    }
//   brute flow
    public int gcd(int num1 , int num2){
        int gcd = 0;
        for (int i = 1; i < num1 && i < num2; i++) {
            if(num1%i == 0 & num2%i == 0){
                gcd = i ;
            }
        }
        return gcd;
    }
//    YouTube Reference
    public int gcd2(int n1 , int n2){
        while (n1 != n2){
            if(n1> n2) n1 = n1-n2;
            if(n2 > n1) n2 = n2-n1;
        }
        return n1;
    }


}
