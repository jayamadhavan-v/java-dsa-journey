package Problems.Basic;

public class Ugly_Number {
    public static void main(String[] args) {
        Ugly_Number n = new Ugly_Number();
        boolean result = n.isUgly(14);
        System.out.println(result);
    }
/// [link](https://leetcode.com/problems/ugly-number/description/)
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;
    }
}
