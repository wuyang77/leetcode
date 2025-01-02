/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] 二分查找
 * 
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */

// @lc code=start
class Solution704 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int mid, left = 0, right = n - 1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] < target ) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Solution704 solution704 = new Solution704();
        int[] numss = {-1, 0, 3, 5, 9, 12};
        solution704.search(numss, 9);
    }
}
// @lc code=end

