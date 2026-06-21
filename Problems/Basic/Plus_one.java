package Problems.Basic;
import java.util.*;
public class Plus_one {

    public static void main(String[] args) {
        Plus_one p = new Plus_one();
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] resArr = p.plusOne(arr);
        for (int i : resArr){
            System.out.print( i + " ");
        }
    }

    // my approach is wrong
    public int[] plusOne(int[] arr){
        long digits = 0;
        for(int i = 0; i < arr.length; i++) {
            digits = digits *10 + arr[i];
        }
        digits += 1;
        long dCopy = digits;
        int cnt = 0 ;
        // count the digits
        while (dCopy != 0){
            dCopy = dCopy /10 ;
            cnt++;
        }
        int [] resArr = new int[cnt];
        for (int i = cnt-1;  i >= 0; i--) {

            long rem = digits % 10;
            resArr[i] =(int) rem ;
            digits = digits / 10 ;
        }
        return resArr;
    }
    // second approach
    public  int[] plusOne2(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int []result=new int[digits.length+1];
        result[0]=1;

        return result;
    }

    // algorthm

}
