package stack;

import java.util.Stack;

/**
 * @author zongkang
 * @date 2021/1/28 5:53 下午
 */
public class BackStack {
    static Stack<Integer> s1 = new Stack<>();

    public static void main(String[] args) {
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        BackValue(s1);
    }

    public static void BackValue(Stack<Integer> s1) {
        if (s1.isEmpty()) {
            return;
        }
        Integer value = s1.pop();
        BackValue(s1);
        System.out.println(value);
        s1.push(value);
    }

}
