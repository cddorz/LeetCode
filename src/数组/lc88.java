package src.数组;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-09-23 10:21
 */
public class lc88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1,p2 = n-1;
        int tail = m+n-1;
        int target;
        while (p1 >= 0 || p2 >= 0){
            if(p1 == -1){
                target = nums2[p2--];
            }else if(p2 == -1){
                target = nums1[p1--];
            }else if(nums1[p1] < nums2[p2]){
                target = nums2[p2--];
            }else {
                target = nums1[p1--];
            }
            nums1[tail--] = target;
        }
    }
}
