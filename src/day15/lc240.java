package src.day15;

/**
 * 搜索二维矩阵 II
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。
 * 该矩阵具有以下特性：
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 * @author han long yi
 * @create 2021-04-19 9:10
 */
public class lc240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        //matrix[matrix.length - 1][0]从左下角开始出发
        int row = matrix.length - 1;
        int col = 0;
        //在矩阵区域内
        while(row >= 0 && col < matrix[0].length){
            //如果大于target就往上走
            if(matrix[row][col] > target){
                row--;
            }
            //如果小于target就往右走
            else if(matrix[row][col] < target){
                col++;
            }else{
                //找到了
                return true;
            }
        }
        return false;
    }
}
