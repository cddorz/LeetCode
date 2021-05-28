package src.day15;

/**
 * 48. 旋转图像
 * @author hly
 * @Description: 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 * @create 2021-04-19 14:52
 */
public class lc48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //创建一个新矩阵，记录旋转之后的位置
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //旋转90°
                matrix_new[j][n-1-i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }
}
