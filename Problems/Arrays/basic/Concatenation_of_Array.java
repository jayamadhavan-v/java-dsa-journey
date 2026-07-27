package Problems.Arrays.basic;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = getConcatenation(nums);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    // formula
    /*
        ans[i] == nums[i
        ans[i + n] == nums[i]
     */
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[nums.length*2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

}
