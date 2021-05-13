package LeetCode_2021.Coding_2021_05_08.Offer13;

public class Offer13_DFS_v2 {
    // 记忆数组(剪枝)
    boolean[][] memory;
    int res = 0;

    public int movingCount(int m, int n, int k) {
        //
        if (k == 0 || m == 1 && n == 1) return 1;
        // 初始化默认为false
        memory = new boolean[m][n];
        // 从(0,0)位置开始遍历
        dfs(0, 0, k, m, n);
        return res;
    }

    /**
     *
     * @param x 当前行
     * @param y 当前列
     * @param k k值
     * @param m 行边界
     * @param n 列边界
     */
    private void dfs(int x, int y, int k, int m, int n) {
        // 1.
        // 如果memory[x][y] == true 说明遍历过了
        // 到边界 也return
        if (x == m || y == n || memory[x][y]) return;

        // 判断是否满足另外一个条件: 数位和 大于 k return
        if (panduan(x) + panduan(y) > k) return;

        // 2.
        // 走到这里说明此格没有遍历过 将memory置为true
        memory[x][y] = true;

        // 3.
        // 返回值+1
        res++;

        // 4.
        // 往下走一格
        dfs(x + 1, y, k, m, n);

        // 往右走一格
        dfs(x, y + 1, k, m, n);
    }

    // 返回 传参x 的各个位相加的和
    int panduan(int x) {
//        if (x == 100) return 1;
//        if (x <= 9) return x;
//        return x / 10 + x % 10;
        int s = 0;
        while (x != 0) {
            s += x % 10;
            x = x / 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Offer13_DFS_v2 o = new Offer13_DFS_v2();
        System.out.println(o.movingCount(2, 3, 1));
    }
}
