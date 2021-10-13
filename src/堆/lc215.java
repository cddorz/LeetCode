package src.堆;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author hly
 * @Description: 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * 堆：完全二叉树
 * parent = (i - 1) / 2;
 * child1 = 2 * i + 1;
 * child2 = 2 * i + 2
 * @create 2021-09-16 10:05
 */
public class lc215 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        build_heap(nums,n);
        for (int i = n - 1; i >= n - k + 1 ; i--) {
            swap(nums,0,i);
            heapify(nums,i,0);
        }
        return nums[0];
    }

    // build 大顶堆
    public void build_heap(int[] tree,int n){
        int last_node = n - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >=0 ; i--) {
            heapify(tree,n,i);
        }
    }
    // 堆化
    public void heapify(int[] tree,int n,int i){
        if(i >= n){
            return;
        }
        int max = i;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        if(c1 < n && tree[c1] > tree[max]){
            max = c1;
        }
        if(c2 < n && tree[c2] > tree[max]){
            max = c2;
        }
        if(max != i){
            swap(tree,max,i);
            heapify(tree,n,max);
        }
    }

    public void heap_sort(int tree[], int n){
        build_heap(tree,n);
        for (int i = n-1; i >= 0 ; i--) {
            swap(tree,i,0);
            heapify(tree,i,0);
        }
    }

    public void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}
