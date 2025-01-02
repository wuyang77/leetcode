package other.区间和;

import java.util.Scanner;

/**
 * 给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。
 * 输入描述
 * 第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。随后的输入为需要计算总和的区间，直至文件结束。
 * 输出描述
 * 输出每个指定区间内元素的总和。
 */
public class main {
    // 输入数组的大小
    // 新建2个数组
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vec = new int[n];
        int[] p = new int[n];

        int preSum = 0;
        for (int i = 0; i < n; i++) { 
            vec[i] = scanner.nextInt();
            preSum += vec[i];
            p[i] = preSum; // 前缀和的n次求和，并存值
        }

        while(scanner.hasNext()) {
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();
            int sum;
            if (startIndex == 0) {
                sum = p[endIndex];    
            } else {
                sum = p[endIndex] - p[startIndex - 1];
            }
            System.out.println("通过计算下标"+ startIndex + "到上标的"+ endIndex + "的区间和为:" + sum);
        }    
        scanner.close();
    }
}
