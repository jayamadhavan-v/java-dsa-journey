package Problems.Basic;

public class MainClass {
    public static void main(String[] args) {
///       find odd or even
//        Find_Oven_Or_Even p1 = new Find_Oven_Or_Even();
//        boolean b = p1.isEven(5);
//        System.out.println(b);

//        count digit tht divide
        Count_Digits_that_Divide p2  = new Count_Digits_that_Divide();

        int cnt  = p2.countDigitsThatDivide(20);
        System.out.println(cnt);
    }

}
