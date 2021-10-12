package src.双指针;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-09 19:20
 */
public class test {
    public static void main(String[] args) {
        boolean happy = isHappy(19);
        System.out.println(happy);
    }
    public static boolean isHappy(int n) {
        if(n == 0){
            return false;
        }
        int fast = next(n);
        int slow = n;
        while(slow != fast){
            slow = next(slow);
            fast = next(fast);
            fast = next(fast);
        }
        return slow == 1;
    }

    private static int next(int n){
        int res = 0;
        while ( n != 0 ){
            int y = n % 10;
            res = res + y*y;
            n = n / 10;
        }
        return res;
    }
}
