package src.图系列;

/**
 * @author hly
 * @Description: 冗余连接
 * @create 2021-08-06 10:42
 */
public class lc684 {
            public int[] findRedundantConnection(int[][] edges) {
                int nodesCount = edges.length;
                int[] parent = new int[nodesCount + 1];
                for (int i = 1; i <= nodesCount; i++) {
                    parent[i] = i;
                }
                for (int i = 0; i < nodesCount; i++) {
                    int[] edge = edges[i];
                    int node1 = edge[0], node2 = edge[1];
                    /**
                     * 如果两个顶点属于不同的连通分量，则说明在遍历到当前的边之前，这两个顶点之间不连通，
                     * 因此当前的边不会导致环出现，合并这两个顶点的连通分量。
                     */
                    if (find(parent, node1) != find(parent, node2)) {
                        union(parent, node1, node2);
                    } else {
                        /**
                         * 如果两个顶点属于相同的连通分量，则说明在遍历到当前的边之前，这两个顶点之间已经连通，
                         * 因此当前的边导致环出现，为附加的边，将当前的边作为答案返回。
                         */
                        return edge;
                    }
                }
                return new int[0];
            }

            public void union(int[] parent, int index1, int index2) {
                parent[find(parent, index1)] = find(parent, index2);
            }

            public int find(int[] parent, int index) {
                if (parent[index] != index) {
                    parent[index] = find(parent, parent[index]);
                }
                return parent[index];
            }
        }
