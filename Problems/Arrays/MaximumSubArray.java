package Problems.Arrays;

public class MaximumSubArray {

///https://leetcode.com/problems/maximum-subarray/

    public static void main(String[] args) {
        MaximumSubArray p = new MaximumSubArray();

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = p.maxSubArray(arr);
        System.out.println(result);

    }
    public int maxSubArray(int[] arr){
        int max  = Integer.MIN_VALUE;
        int sum = 0;

        for(int i =0 ; i < arr.length ; i++ ){

            sum = sum +  arr[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}
