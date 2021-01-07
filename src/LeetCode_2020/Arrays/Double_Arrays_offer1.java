package LeetCode_2020.Arrays;

public class Double_Arrays_offer1 {
    public static void main(String[] args){
          int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);
          Double_Arrays_offer1 d1 = new Double_Arrays_offer1();
          boolean b = d1.Find(2,arr);
        System.out.println(b);
    }

//    public boolean Find(int target, int [][] array) {
//        int i = array.length-1, j = array[0].length-1;
//        if(target > array[i][j] && target <array[0][0]) return false;
//        while (target < array[i][j] && j > 0){
//                j--;
//        }
//        j++;
//        while (target < array[i][j] && i > 0){
//            i--;
//        }
//        return array[i][j] == target ? true :false;
//    }

    public boolean Find(int target, int [][] array) {
        int rows = array.length, cols = array[0].length;

        if(rows == 0 || cols == 0) return false;
        int row = rows-1;   //最后一行
        int col = 0;        //第一列

        while (row >= 0 && col < cols) {//行不越界、列不超过数组的列，即不越界
            if (array[row][col] < target) {
                col++;
            }else if (array[row][col] > target){
                row--;
            }else {
                return true;
            }
        }
            return false;
    }

}
