package src.day21;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-09-24 19:35
 */
public class lc9 {


    public static void main(String[] args) {
        boolean palindrome = isPalindrome(121);
        System.out.println(palindrome);
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int record = x;
        int dight = 0;
        while(x != 0){
            int rev = x % 10;
            dight = dight * 10 + rev;
            x = x / 10;
        }
        System.out.println(dight);
        if (dight == x){
            return true;
        }
        return false;
    }
}
