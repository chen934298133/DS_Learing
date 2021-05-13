package LeetCode_2021.Coding_2021_05_08.Offer13;

public class Offer13 {

    boolean[][] visited;
    int resultNum = 0;

    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        dfs(0, 0, k, m, n);
        return resultNum;

    }

    public void dfs(int x, int y, int k, int m, int n) {
        //检测是否访问过、是否到达边界、是否满足数位和小于k值
        //剪枝测试
        //修改返回值
        //进入递归（向下向右走）
        if ( x == m || y == n ||visited[x][y]  || (sums(x) + sums(y)) > k) {
            return;
        }
        visited[x][y] = true;
        resultNum++;
        dfs(x + 1, y, k, m, n);
        dfs(x, y + 1, k, m, n);
    }

    public int sums(int x) {
        int s = 0;
        while (x != 0) {
            s += x % 10;
            x = x / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Offer13 offer13 = new Offer13();
        System.out.println(offer13.movingCount(2, 3, 1));
//        System.out.println(offer13.sums(35));
    }
}
