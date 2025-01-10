/*
 * @lc app=leetcode.cn id=209 lang=java
 * [209] 长度最小的子数组
  */
// @lc code=start
/**
 * 长度最小的子数组解决方案
 * @author 吴洋
 */
class Solution209 {
    /**
     * 给定一个含有 n 个正整数的数组和一个正整数 target 。
     * 找出该数组中满足其总和大于等于target 的长度最小的子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
     * 如果不存在符合条件的子数组，返回 0 。
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while(sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;      
    }
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Solution209 solution209 = new Solution209();
        int[] newNums = {2,3,1,2,4,3};
        int minSubArrayLen = solution209.minSubArrayLen(7, newNums);
        System.out.println(minSubArrayLen);
    }
}
// @lc code=end

