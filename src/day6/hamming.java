package src.day6;
/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * x  y 异或不同位为1，统计异或结果1的数目即为答案
 * @author han long yi
 * @create 2021-04-06 9:32
 */
public class hamming {
    public int hammingDistance(int x, int y) {
        //异或。统计xor为1的个数即可
        int xor = x ^ y;
        int distance = 0;
        //右移位统计xor的1
        while (xor != 0) {
            // 因为若二进制末位为1，则 % 2 一定为1
            if (xor % 2 == 1) {
                distance += 1;
            }
            // 右移，判断下一位
            xor = xor >> 1;
        }
        return distance;
    }

}
