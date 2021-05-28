package src.day8;

/**
 * 单词搜索
 * 给定一个 m x n 二维字符网格 board 和一个字符串单词 word
 *  如果 word 存在于网格中，返回 true ；否则，返 回 false 。
 * @author han long yi
 * @create 2021-04-08 16:57
 */
public class sousuo {
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private int rows;
    private int cols;
    private int len;
    private boolean[][] visited;
    private char[] charArray;
    private char[][] board;

    public boolean exist(char[][] board,String word){
        rows = board.length;
        if(rows == 0){
            return false;
        }
        cols = board[0].length;
        visited = new boolean[rows][cols];
        this.len = word.length();
        this.charArray = word.toCharArray();
        this.board = board;
        //通过此循坏来找到正确的初值
        for(int i=0;i < rows;i++){
            for(int j=0;j < cols;j++){
                if(dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int x, int y, int begin){
        if(begin == len - 1){
            return board[x][y] == charArray[begin];
        }
        if(board[x][y]==charArray[begin]){
            //记录是否走过
            visited[x][y] = true;
            //左下右上的顺序回溯正确路径
            for(int[] direction : DIRECTIONS){
                int newX = x + direction[0];
                int newY = y + direction[1];
                //新路径未越界，并且没有走过
                if(inArea(newX,newY)&&!visited[newX][newY]){
                    if(dfs(newX,newY,begin+1)){
                        return true;
                    }
                }
            }
            //证明不是正确的初值，清零记录
            visited[x][y] = false;
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
