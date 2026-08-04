package Problems.Arrays.basic;

public class Find_Numbers_with_Even_Number_of_Digits {

/// [](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/)
    public static void main(String[] args) {
        int[] nums= {12,345,2,6,7896};
        int res = findNumbers_m1(nums);
        System.out.println(res);
    }

    // using the String convertion

    public static int findNumbers_m1(int[] nums) {
        int cnt = 0;

        for(int num : nums){
            String x =  String.valueOf(num);
            if(x.length()%2==0){
                cnt++;
            }
        }
        return cnt;
    }

    // using the math.log() method


    public static int findNumbers_m2(int[] nums) {
        int cnt = 0;

        for(int num : nums){
            int length = (int) Math.log10(num) + 1;
            if(length%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}
