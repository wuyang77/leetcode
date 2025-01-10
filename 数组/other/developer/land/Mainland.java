package other.developer.land;

import java.util.Scanner;

/**
 * 给定一个n*m的矩阵，矩阵的元素为正整数，表示每一块土地的权值。
 * 开发商A和开发商B分别购买土地，开发商A购买的土地权值总和为a，开发商B购买的土地权值总和为b。
 * 请计算开发商A和开发商B购买的土地权值总和的差值的最小值。
 * 输入描述
 * 第一行输入为整数n和m，表示矩阵的行数和列数。接下来n行，每行m个整数，表示矩阵的元素。
 * 输出描述
 * 输出开发商A和开发商B购买的土地权值总和的差值的最小值。
 * @author 吴洋
 */
public class Mainland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        //输入每一块土地的权值，并对土地进行求和
        int[][] tudi = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tudi[i][j] = scanner.nextInt();
                sum += tudi[i][j];
            }
        }
        // a为开发商A公司对其土地的权值，b为开发商B公司对其土地的权值
        // sum = a + b, b = sum - a, |b - a| = |sum - 2a| 
        int result = Integer.MAX_VALUE;
        int a = 0;
        // 横向切分
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               a += tudi[i][j];
               if( j == m - 1) {
                    result = Math.min(result, Math.abs(sum - 2*a));
               }
            }
        }
        a = 0;
        //纵向切分
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a +=tudi[i][j];
                if( i == n - 1) {
                    result = Math.min(result, Math.abs(sum - 2*a));
                }
            }
        }
        System.out.println("此时的最小值为"+ result);
        scanner.close();
    }
}
