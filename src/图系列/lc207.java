package src.图系列;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hly
 * @Description: 课程表，拓扑排序
 * @create 2021-08-04 10:31
 */
public class lc207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // 邻接表
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        int[] flags = new int[numCourses];
        // 填充邻接表，因为是 cp[1] --> cp[0] 所以先找到 cp[1] 即是入度，再填充出度 cp[0]
        for(int[] cp : prerequisites){
            adjacency.get(cp[1]).add(cp[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if(!dfs(adjacency, flags, i)) return false;
        }
        return true;
    }

    /**
     * dfs 遍历
     * flag == 1 代表这次 dfs 中此节点被遍历过
     * flag == -1 代表其他次的 dfs 中此节点被遍历过
     * @param adjacency
     * @param flags
     * @param i
     * @return
     */
    private boolean dfs(List<List<Integer>> adjacency, int[] flags, int i) {
        if(flags[i] == 1){
            return false;
        }
        if(flags[i] == -1){
            return true;
        }
        flags[i] = 1;
        // dfs
        for(Integer j : adjacency.get(i)){
            if(!dfs(adjacency, flags, j)) return false;
        }
        // 回溯
        flags[i] = -1;
        return true;
    }
}
