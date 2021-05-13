package LeetCode_2021.Coding_2021_05_08.Offer13;

public class sumTest {
    //避免递归传参，定义全局变量
    int m, n, k;
    //是否已经访问过
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        //初始化
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        // 进入递归
        return dfs(0, 0, 0, 0);
    }

    public int dfs(int i, int j, int si, int sj) {
        //下标越界，数位和大于指定值以及已经访问过都会直接返回
        if (i >= m || j >= n || k < si + sj || visited[i][j]) return 0;
        //标记此坐标访问过
        visited[i][j] = true;
        //@Krahets 大佬总结的精华，适用范围是[0,100)
        // 1.当x或者y从n9进位成(n+1)0时，数位和减小了8
        //    设进位后数的数位和为n，差值为x，得出方程n=(n-1)+9+x，即x=-8
        // 2.当x或者y在个位数从0到8的范围内加1时，数位和增加了1，这是常识。
        //至于为什么只向右和向下扩张是因为不用回溯已走过的路径，扩张的路径只会向下或者向右
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj) + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
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
        sumTest test = new sumTest();
        System.out.println(test.sums(9));
        System.out.println(test.movingCount(2, 3, 1));
    }
}
