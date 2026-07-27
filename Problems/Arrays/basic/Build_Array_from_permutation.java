package Problems.Arrays.basic;


/// [leetCode link](https://leetcode.com/problems/build-array-from-permutation/description/)
public class Build_Array_from_permutation {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int [] ans = buildArray(nums);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    // formula ans[i] = nums[nums[i]]
    public static  int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
