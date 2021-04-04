package src.day1;

/**
 * 牛顿迭代法实现完全平方数的判断
 * x = (x + num / x) / 2;---->f(x)=x*2 - num = 0的解
 * 无限切线，使x无限接近于答案
 * @author han long yi
 * @create 2021-04-01 23:13
 */
public class square {
        public boolean isPerfectSquare(int num) {
            if (num < 2) {
                return true;
            }
            long x = num / 2;
            while (x * x > num) {
                x = (x + num / x) / 2;
            }
            return (x * x == num);
        }
    }
