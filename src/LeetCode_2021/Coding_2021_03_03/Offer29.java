package LeetCode_2021.Coding_2021_03_03;

import java.util.Arrays;

public class Offer29 {

    public static void main(String[] args){
        Offer29 o = new Offer29();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(o.spiralOrder(matrix)));     // [1,2,3,6,9,8,7,4,5]
    }

    public int[] spiralOrder(int[][] matrix) {
        // 1. 空值处理： 当 matrix 为空时，直接返回空列表 [] 即可。
        if(matrix.length == 0) return new int[0];
        // 2. 初始化边界: 矩阵上下左右四个边界t, b, l, r
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        //    以及初始化用于打印结果列表的`res`
        int[] res = new int[(r + 1) * (b + 1)];
        // 3. 循环打印 “左->右、上->下、右->左、下->上”，四个方向循环
        while(true) {
            for(int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right.
            // 上缩: 边界+1
            if(++t > b) break;

            for(int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom.
            // 右缩: 边界-1
            if(l > --r) break;

            for(int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left.
            // 下缩: 边界+1
            if(t > --b) break;

            for(int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top.
            // 左缩: 边界+1
            if(++l > r) break;
        }
        return res;
    }

}
