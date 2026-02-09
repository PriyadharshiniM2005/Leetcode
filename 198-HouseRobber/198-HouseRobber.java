// Last updated: 2/9/2026, 4:10:55 PM
public class House_Robber {
     class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int[] dp = new int[nums.length + 1];
            dp[0] = 0;
            dp[1] = nums[0];
            for (int i = 2; i <= nums.length; i++) {
                dp[i] = Math.max(nums[i - 1] + dp[i - 2], dp[i - 1]);
            }
            return dp[nums.length];
        }
    }
}
class Solution {
    public int rob(int[] nums) {
        int a = 0, b = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            int c = Math.max(nums[i] + a, b);
            a = b;
            b = c;
        }
        return b;
    }
}