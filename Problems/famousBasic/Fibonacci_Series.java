package Problems.famousBasic;

public class Fibonacci_Series {
    public static void main(String[] args) {
        fib(10);
    }
    /*
        output : 0 1 1 2 3 5 8 13 etc..
     */

    static void fib(int n){
        int n1=0,n2=1;
        for(int i=2;i<=n;i++){
            System.out.print(n1+" ");
            int n3 =  n1+n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
