/*
 * @lc app=leetcode.cn id= lang=java
 *
 * [] 移除元素
 */
// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int i = 0;
        for (int j = 0; j < size; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;    
    }
    // public static void main(String[] args) {
    //     Solution27 solution27 = new Solution27();
    //     int[] newNums = {0, 1, 2, 2, 3, 2, 4, 3};
    //     int removeElement = solution27.removeElement(newNums, 2);
    //     System.out.println("此时数组的大小为：" + removeElement);
        
    // }
}


// @lc code=end

