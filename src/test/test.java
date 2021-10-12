package src.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-09 19:20
 */
public class test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        test test = new test();
        User hollis = new User();
        hollis.setUsername("Hollis");
        hollis.setGender("Male");
        test.pass(hollis);
        System.out.println("print in main , user is " + hollis.getGender() + hollis.getUsername());
    }

    public void pass(User user) {
        user.setUsername("hollischuang");
        user.setGender("Male");
        System.out.println("print in pass , user is " + user.getGender() + user.getUsername());
    }

    public Map<String, String> getMap(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Class.forName(className);
        Constructor constructor = c.getConstructor();
        return (Map<String, String>) constructor.newInstance();
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
