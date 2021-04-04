package src.day3;

import java.util.Stack;

/**
 * 辅助栈法:构造一个最小值辅助栈存入对应的最小值
 * @author han long yi
 * @create 2021-04-03 22:33
 */

public class minStack {
    private Stack<Integer> stack;
    private Stack<Integer> min_stack;

    public minStack(){
        stack = new Stack<>();
        min_stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(min_stack.isEmpty() || val <= min_stack.peek()){
            min_stack.push(val);
        }
    }

    public void pop() {
        if(stack.pop().equals(min_stack.peek())){
            min_stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
    }
}
