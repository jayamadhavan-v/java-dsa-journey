package Problems.Arrays.Two_d_Array;

/// [link]( https://leetcode.com/problems/richest-customer-wealth/description/ )
public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        int [][] account =  {{1,3,3},{3,2,1}};
        int res = maximumWealth(account);
        System.out.println(res);
    }
    /*
        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest
        with a wealth of 6 each, so return 6.
     */
    public static int maximumWealth(int[][] accounts) {

        int maxRichest = 0;
        for(int[] account : accounts){
            int currentRichest = 0;
            for(int money : account){
                currentRichest += money;
            }
            maxRichest = Math.max(currentRichest, maxRichest);
        }
        return maxRichest;
    }
}
