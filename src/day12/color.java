package src.day12;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * @author han long yi
 * @create 2021-04-16 21:41
 */
public class color {

    /**
     * 封装交换函数
     * @param nums
     * @param index1
     * @param index2
     */
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void sortColor(int[] nums) {
        int len = nums.length;
        if(len < 2){
            return;
        }

        // all in [0, zero) = 0
        // all in [zero, i) = 1
        // all in [two, len - 1] = 2

        // 循环终止条件是 i == two，那么循环可以继续的条件是 i < two
        // 为了保证初始化的时候 [0, zero) 为空，设置 zero = 0，
        // 所以下面遍历到 0 的时候，先交换，再加
        int zero = 0;

        // 为了保证初始化的时候 [two, len - 1] 为空，设置 two = len
        // 所以下面遍历到 2 的时候，先减，再交换
        int two = len;
        int i = 0;

        // 当 i == two 上面的三个子区间正好覆盖了全部数组
        // 因此，循环可以继续的条件是 i < two
        while (i < two){
            if(nums[i] == 0){
                swap(nums,zero,i);
                i++;
                zero++;
            }
            if(nums[i] == 1){
                i++;
            }
            if(nums[i] == 2){
                two--;
                swap(nums,i,two);
            }
        }
    }
}
