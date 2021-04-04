package src.day1;

/**
 * 快速幂+递归实现x的n次幂
 * 从右向左分析
 * @author han long yi
 * @create 2021-04-01 23:41
 */
public class pow{
        public double myPow(double x, int n) {
            long N = n;
            return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
        }

        public double quickMul(double x, long N) {
            if (N == 0) {
                return 1.0;
            }
            double y = quickMul(x, N / 2);
            return N % 2 == 0 ? y * y : y * y * x;
        }
}
