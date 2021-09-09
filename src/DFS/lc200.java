package src.DFS;

/**
 * @author hly
 * @Description: 岛屿数量
 * 给你一个由'1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 * @create 2021-09-09 10:27
 */
public class lc200 {
    public int numIslands(char[][] grid) {
        int res = 0;

        // 每进行一次深度搜索，res 就 +1
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // 如果遍历过，则元素 != 1，res 就不会 +1
                if(grid[i][j] == '1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid,int r,int c){
        if(!isInIsland(grid,r,c)){
            return;
        }
        if(grid[r][c] != '1'){
            return;
        }
        // * 搜索过的就标记成2，以免重复遍历
        grid[r][c] = '2';

        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
    }

    // base 条件，元素必须在网格以内
    public boolean isInIsland(char[][] grid, int r, int c){
        return r >= 0 && c >= 0 && r < grid.length && c < grid[0].length;
    }
}
