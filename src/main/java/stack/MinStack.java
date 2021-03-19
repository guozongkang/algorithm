package stack;

import java.util.Stack;

/**
 * @author zongkang
 * @date 2021/1/28 11:33 下午
 */
public class MinStack {

    private static Stack<Integer> allStack = new Stack<>();

    private static Stack<Integer> minStack = new Stack<>();

    public static int pop() {
        int pop = allStack.pop();
        if (pop == minStack.peek()) {
            minStack.pop();
        }

        return pop;
    }

    public static void push(int value) {
        if (minStack.size() == 0 || value <= minStack.peek()) {
            minStack.push(value);
        }

        allStack.push(value);
    }

    public static int getMin() {
        return minStack.peek();
    }

    public static int top() {
        return allStack.peek();
    }

    public static void main(String[] args) {
        push(512);
        push(-1024);
        push(-1024);
        push(512);
        pop();
        getMin();
        pop();
        getMin();
        pop();
        getMin();
    }
}


