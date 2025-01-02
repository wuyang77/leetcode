/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start



class Solution {
    public int[] sortedSquares(int[] nums) {
        // 创建一个新数组
        // 双指针向内收缩,将新的值赋给新数组
        // 谁大就取谁，右边向内存值
        int l = 0;
        int r = nums.length - 1;
        int j = nums.length - 1;
        int[] res = new int[nums.length];
        while(l <= r) {
            if (nums[l] * nums[l] < nums[r] * nums[r]) {
                res[j--] = nums[r] * nums[r--];
            } else {
                res[j--] = nums[l] * nums[l++];
            }
        }
        return res;
    }

    // public static void main(String[] args) {
    //     Solution977 solution977 = new Solution977();
    //     int[] newNums = {-1, -2, 0, 4, 9};
    //     int[] sortedSquares = solution977.sortedSquares(newNums);
    //     System.out.println(Arrays.toString(sortedSquares));
    // }
}
// @lc code=end

