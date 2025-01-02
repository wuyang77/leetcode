package other.开发商购买土地;

import java.util.Scanner;

public class main {
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
