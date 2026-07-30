package Problems.Arrays.basic;

public class Running_Sum_of_1d_Array {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};

        int [] res = runningSum(nums);

        for(int num : res){
            System.out.print(num+" ");
        }

    }

    /*
        input [1,2,3,4]
        output [1,3,6,10]

        explanation for it
           sum the current array element with previous array element and
           store in tht current place

           1                = 1
           1 + 2            = 3
           1 + 2 + 3        = 6
           1 + 2 + 3 + 4    = 10

     */

    public static int[] runningSum(int[] nums) {

        int sum  = 0 ;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
