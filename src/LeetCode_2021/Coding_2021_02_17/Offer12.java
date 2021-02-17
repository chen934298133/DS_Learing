package LeetCode_2021.Coding_2021_02_17;

public class Offer12 {
    public static void main(String[] args){
        char [][] arr = {{'a','b','c','e'}, {'s','f','c','s'},{'a','d','e','e'}};
        String str = "bfcee";
        Offer12 offer12 = new Offer12();
        System.out.println(offer12.exist(arr, str));
        System.out.println(arr.length);
    }

    // 面试题12. 矩阵中的路径（ DFS + 剪枝 ）
    public boolean exist(char[][] board, String word) {
        // String转char
        char[] words = word.toCharArray();
        // 遍历行
        for(int i = 0; i < board.length; i++) {
            // 遍历列
            for(int j = 0; j < board[0].length; j++) {
                // 开启递归
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }
    // 深度搜索 + 剪枝
    // board:遍历矩阵 / word:目标字符 / i: 行号 / j: 列号 / k: 当前位置
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        // 如果i、j越界，或者当前矩阵元素已访问过
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        // 字符串 word 已全部匹配
        if(k == word.length - 1) return true;
        // 标记当前矩阵元素，将 board[i][j] 修改为 空字符 '' ，代表此元素已访问过，防止之后搜索时重复访问。
        // 使用空字符（Python: '' , Java/C++: '\0' ）做标记是为了防止标记字符与矩阵原有字符重复。当存在重复时，此算法会将矩阵原有字符认作标记字符，从而出现错误。
        board[i][j] = '\0';
        // 搜索下一单元格： 朝当前元素的 上、下、左、右 四个方向开启下层递归，使用 或 连接 （代表只需找到一条可行路径就直接返回，不再做后续 DFS ），并记录结果至 res 。
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) || dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        // 还原当前矩阵元素： 将 board[i][j] 元素还原至初始值，即 word[k] 。
        board[i][j] = word[k];
        // 返回布尔量 res ，代表是否搜索到目标字符串。
        return res;
    }
}
