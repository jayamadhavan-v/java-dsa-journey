package Problems.Arrays.basic;

public class Squares_of_a_Sorted_Array {

    /// [link](https://leetcode.com/problems/squares-of-a-sorted-array/description/)

    /*
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].

        example 2

        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]

     */

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int [] res = sortedSquares(nums);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    /*
     algorithm

        step1  : using the Math.abs() makes the non negative to positive

        step 2 : square the number by using the math.pow();

        step3 : sort the array
     */

    public static int[] sortedSquares(int[] nums) {
       return  new int[nums.length];
    }

}
