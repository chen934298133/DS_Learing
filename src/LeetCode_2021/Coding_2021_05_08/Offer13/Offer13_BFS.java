package LeetCode_2021.Coding_2021_05_08.Offer13;
import java.util.LinkedList;
import java.util.Queue;

public class Offer13_BFS {

    // visited记录格子是否被访问过
    boolean[][] visited;
    int res = 0;

    public int movingCount(int m, int n, int k) {
        // 1.
        // 创建一个队列，保存的是访问到的格子坐标，是个二维数组
        Queue<int[]> queue = new LinkedList<>();
        // 把起始结点存入队列
        queue.add(new int[]{0, 0});
        // 开始循环访问
        while (queue.size() > 0) {
            // 将队列的第一个结点出队，访问
            int[] temp = queue.poll();
            // 获取此次访问的行列坐标，准备测试格子是否合格
            int x = temp[0], y = temp[1];
            // 跳过不合格的坐标格子
            if (x >= m || y >= n || get(x) + get(y) > k || visited[x][y]) {
                continue;
            }
            // 将合格的格子标记为已经访问过
            visited[x][y] = true;
            // 满足条件的格子数加一
            res++;
            // 向右边移动
            queue.add(new int[]{x + 1, y});
            // 向下移动
            queue.add(new int[]{x, y + 1});
        }
        return res;
    }

    // 计算一个数的各个位数之和
    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Offer13_BFS o = new Offer13_BFS();
        System.out.println(o.movingCount(2, 3, 1));
    }
}
