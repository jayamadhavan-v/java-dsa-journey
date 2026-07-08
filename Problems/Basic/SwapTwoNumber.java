package Problems.Basic;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        SwapTwoNumber p = new SwapTwoNumber();
        System.out.println("Before Swap  A and B " + a + " " + " " + b);
        p.swapTwoNumber(a, b);

    }

    public void swapTwoNumber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap  A and B " + a + " " + " " + b);
    }
}
