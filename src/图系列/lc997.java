package src.图系列;

/**
 * @author hly
 * @Description: 找到小镇法官
 * @create 2021-08-05 10:13
 */
public class lc997 {
    public int findJudge(int n, int[][] trust) {
        int[] votes = new int[n+1];
        for(int[] vote : trust){
            votes[vote[1]]++;
            votes[vote[0]]--;
        }
        int judge = -1;
        for (int i = 0; i < n; i++) {
            if(votes[i] == n - 1){
                judge = i;
                break;
            }
        }
        return judge;
    }
}
