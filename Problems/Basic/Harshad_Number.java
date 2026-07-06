package Problems.Basic;

public class Harshad_Number {
    public static void main(String[] args) {
        Harshad_Number p = new Harshad_Number();
        int result =  p.sumOfTheDigitsOfHarshadNumber(1);
        System.out.println(result);
    }

/// [link](https://leetcode.com/problems/harshad-number/description/)
    public int sumOfTheDigitsOfHarshadNumber(int n){

        int temp = n;
        int sum = 0;

        while (temp>0){
            sum += temp%10;;
            temp = temp /10;
        }

        if(n%sum == 0){
            return 1;
        }

        return -1;
    }
}
