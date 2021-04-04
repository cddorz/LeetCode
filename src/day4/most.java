package src.day4;

/**
 * 题目：给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 摩尔投票法：
 * 我们遍历数组 nums 中的所有元素，对于每个元素 x，在判断 x 之前，如果 count 的值为 0
 * 我们先将 x 的值赋予 candidate，随后我们判断 x：
 * 如果 x 与 candidate 相等，那么计数器 count 的值增加 1；
 * 如果 x 与 candidate 不等，那么计数器 count 的值减少 1。
 * 在遍历完成后，candidate 即为整个数组的众数。
 * nums:      [7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 7, 7, 7, 7]
 * candidate:  7  7  7  7  7  7   5  5   5  5  5  5   7  7  7  7
 * count:      1  2  1  2  1  0   1  0   1  2  1  0   1  2  3  4
 * @author han long yi
 * @create 2021-04-04 23:40
 */
public class most {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
