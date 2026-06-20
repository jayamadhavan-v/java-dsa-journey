package Problems.Basic;

public class Count_Digits_that_Divide {

///    https://www.geeksforgeeks.org/problems/count-digits5716/1

    public int countDigitsThatDivide(int n){
        int cnt  = 0;

        if( n == 0 ){
            return  0 ;
        }
        int cpyN = n;
        while(n > 0){
            int digit  = n % 10;

            if(digit != 0 && cpyN%digit == 0 ){
                cnt++;
            }
            n  = n/ 10;
        }

        return cnt;
    }

///  algorithm
//    Step 1  :  initialize cnt and initialize for loop
//   Step 2  : divide the given n by the extrcted digit from the step 1
//    step 3  : if the digit is divide the no increase the cnt otherwise skip the digit
//    step 4 : continue the process until the digits become empty
}
