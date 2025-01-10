/*
 * @lc app=leetcode.cn id= lang=java
 *
 * [] 移除元素
 */
// @lc code=start
/**
 * 移除元素的解决方案
 * @author 吴洋
 */
class Solution {
    /**
     * 移除数组中所有等于val的元素，返回移除后数组的新长度
     * @param nums 输入数组
     * @param val 要移除的值
     * @return 新数组的长度
     */
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

