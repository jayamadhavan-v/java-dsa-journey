package Problems.Basic;

public class GCD_of_Odd_and_Even_Sums {
/// https://leetcode.com/problems/gcd-of-odd-and-even-sums/description/
    public static void main(String[] args) {
        GCD_of_Odd_and_Even_Sums refVar = new GCD_of_Odd_and_Even_Sums();

        int result  = refVar.gcdOfOddEvenSums(7);
        System.out.println(result);
    }


    public int gcdOfOddEvenSums(int n) {
        // odd num
        int oddSum =0 ;
        int evenSum  =0 ;
       // oddsum
        int  i = 1;
        int oddIncrease  = 1 ;
        int evenIncrease = 2;
        while(i <= n){
            oddSum = oddSum + oddIncrease;
            oddIncrease=oddIncrease+2;

            evenSum = evenSum + evenIncrease;
            evenIncrease = evenIncrease + 2;
            i++;
        }

        while (oddSum != evenSum){
            if(oddSum > evenSum){
                oddSum = oddSum - evenSum ;
            }
            if (evenSum > oddSum){
                evenSum = evenSum - oddSum;
            }
        }
        return oddSum;
    }
}
/// Algorithm
/*
    step1  sum the odd the up to n count and denote as oddSum
    step2 sum the even the up to n count and demote as evenSum
    step3 use the gcd method
 */