package src.栈.lc232;

import java.util.Stack;

/**
 * @author hly
 * @Description: TODO
 * @create 2021-10-13 10:40
 */
public class MyQueue {

    private Stack<Integer> q1 = new Stack<>();
    private Stack<Integer> q2 = new Stack<>();
    private int front;

    public MyQueue() {
    }

    public void push(int x) {
        if(q1.isEmpty()){
            front = x;
        }
        q1.push(x);
    }

    public int pop() {
        if(q2.isEmpty()){
            while (!q1.isEmpty()){
                q2.push(q1.pop());
            }
        }
        return q2.pop();
    }

    public int peek() {
        if(q2.isEmpty()){
            return front;
        }
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty() && q1.isEmpty();
    }
}
