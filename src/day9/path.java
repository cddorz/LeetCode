package src.day9;

/**
 * 此题类似于台阶问题
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * @author han long yi
 * @create 2021-04-09 18:43
 */
public class path {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        int i,j;
        for(i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(j=0;j<n;j++){
            dp[0][j] = 1;
        }
        for(i = 1;i < m;i++){
            for(j = 1;j < n;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}
