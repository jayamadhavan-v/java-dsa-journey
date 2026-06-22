package Problems.Basic;

public class Perfect_Number {
///  https://leetcode.com/problems/perfect-number/
    public static void main(String[] args) {
        Perfect_Number p = new Perfect_Number();

        boolean result = p.isPrefectNo(28);
        System.out.println(result);
    }

    public boolean isPrefectNo(int n ){
        int divSum = 0 ;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                divSum += i;
            }
        }

        return n == divSum ;
    }
}
