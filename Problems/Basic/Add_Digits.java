package Problems.Basic;

public class Add_Digits {
    public static void main(String[] args) {
        Add_Digits p = new Add_Digits();
        int result = p.addDigits(20);

        System.out.println(result);
    }

    /// [link](https://leetcode.com/problems/add-digits/)

    public int addDigits(int n) {
        if (n == 0) return 0;

        int dgt = 0;
        while (n > 0) {
            dgt += n % 10;
            n /= 10;
            if (n == 0 && dgt > 9) {
                n = dgt;
                dgt = 0;
            }
        }
        return dgt;
    }
}
