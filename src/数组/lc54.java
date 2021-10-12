package src.数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hly
 * @Description: 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * @create 2021-10-12 10:53
 */
public class lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return res;
        }
        int rows = matrix.length,columns = matrix[0].length;
        // 辅助矩阵标记已遍历过的位置
        boolean[][] visited = new boolean[rows][columns];
        int row = 0,column = 0;
        // 当遍历次数 == size 表示已经遍历完所有矩阵元素
        int size = rows * columns;
        // 先右，再下，再左，再上
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int directionIndex = 0;
        for (int i = 0; i < size; i++) {
            res.add(matrix[row][column]);
            visited[row][column] = true;
            int nexRow = row + direction[directionIndex][0],nexColumn = column + direction[directionIndex][1];
            // 如果下一个元素超出矩阵或者已经遍历过，则下一个方向遍历
            if(nexRow < 0 || nexRow >= rows || nexColumn < 0 || nexColumn >= columns || visited[nexRow][nexColumn]){
                directionIndex = (directionIndex + 1) % 4;
            }
            row += direction[directionIndex][0];
            column += direction[directionIndex][1];
        }
        return res;
    }
}
