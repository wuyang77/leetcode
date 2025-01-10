/*
 * @lc app=leetcode.cn id=59 lang=java
 */
// @lc code=start

import java.util.Arrays;

/**
 * 螺旋矩阵 II 边界的处理问题 版本1
 * @author 吴洋
 */
class Solution {
    /**
     * 生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵
     * @param n 正整数
     * @return 螺旋矩阵
     */
    public int[][] generateMatrix(int n) {
        // l左边，r右边，t顶部，b底部
        int l = 0, r = n - 1, t = 0, b = n -1; 
        // 创建一个n维的矩阵
        int[][] mat = new int[n][n]; 
        // num为迭代初始值，tar为迭代终值
        int num = 1, tar = n * n; 
        while (num <= tar) {
            for (int i = l; i <= r; i++) {mat[t][i] = num++;}
            t++;
            for (int i = t; i <= b; i++) {mat[i][r] = num++;}
            r--;
            for (int i = r; i >= l; i--) {mat[b][i] = num++;}
            b--;
            for (int i = b; i >= t; i--) {mat[i][l] = num++;}
            l++;
        }
        return mat;
    }
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.generateMatrix(10)));
    }
}
// @lc code=end

