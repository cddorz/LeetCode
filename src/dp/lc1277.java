package src.dp;

/**
 * @author hly
 * @Description: 给你一个 m * n 的矩阵，矩阵中的元素不是 0 就是 1，请你统计并返回其中完全由 1 组成的 正方形 子矩阵的个数。
 * @create 2021-10-16 18:59
 */
public class lc1277 {
    public int countSquares(int[][] matrix) {
        int m = matrix.length,n = matrix[0].length;
        int ans = 0;
        int[][] func = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    func[i][j] = 0;
                }else if(i == 0 || j == 0){
                    func[i][j] = matrix[i][j];
                }else{
                    func[i][j] = Math.min(Math.min(func[i-1][j],func[i][j-1]),func[i-1][j-1]) + 1;
                }
                ans += func[i][j];
            }
        }
        return ans;
    }
}
