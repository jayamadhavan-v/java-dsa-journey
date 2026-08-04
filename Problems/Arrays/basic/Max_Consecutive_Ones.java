package Problems.Arrays.basic;

public class Max_Consecutive_Ones {

    public static void main(String[] args) {
        int [] nums = {1,0,1,1,0,1};
        int res = findMaxConsecutiveOnes(nums);
        System.out.println(res);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCons = 0;
        int max = 0;
        for (int num : nums) {
            if(num == 1 ){
                max ++;
            }
            else{
                maxCons = Math.max(maxCons, max );
                max = 0;
            }
        }

        return Math.max(maxCons, max );
    }
}
