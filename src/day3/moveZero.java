package src.day3;

/**
 * 快排实现数组中0都在数组的末尾
 * @author han long yi
 * @create 2021-04-03 22:48
 */
public class moveZero {
    public void moveZeroes(int[] nums) {
        if(nums == null){
            return ;
        }
        int j = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != 0){
                int temp = 0;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
