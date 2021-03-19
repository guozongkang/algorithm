package tree;

import java.util.Stack;

/**
 * @author zongkang
 * @date 2021/1/28 8:51 下午
 */
public class TraverseTree {
    //      10
//      9        8
//    7   6    5    4
    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(9);
        node.right = new Node(8);
        node.left.left = new Node(7);
        node.left.right = new Node(6);
        node.right.left = new Node(5);
        node.right.right = new Node(4);
        deepTreeStackMid(node);
    }

    //深度递归前序
    public static void deepTreeBefore(Node node) {
        if (node == null) return;
        System.out.print(node.val + "  ");
        deepTreeBefore(node.left);
        deepTreeBefore(node.right);
    }

    //深度递归中序
    public static void deepTreeMid(Node node) {
        if (node == null) return;
        deepTreeMid(node.left);
        System.out.print(node.val + "  ");
        deepTreeMid(node.right);
    }

    //深度递归后续
    public static void deepTreeAfter(Node node) {
        if (node == null) return;
        deepTreeAfter(node.left);
        deepTreeAfter(node.right);
        System.out.print(node.val + "  ");
    }

    //深度非递归前序
    public static void deepTreeStackBefore(Node node) {
        if (node == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            System.out.print(pop.val + "  ");
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    //深度非递归中序
    public static void deepTreeStackMid(Node node) {
        if (node == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            if (pop.right != null) {
                stack.push(pop.right);
            }

            System.out.print(pop.val + "  ");

            if (pop.left != null) {
                stack.push(pop.left);
            }
        }
    }

    //深度非递归后序
    public static void deepTreeStackAfter(Node node) {
        if (node == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();

            if (pop.right != null) {
                stack.push(pop.right);
            }
            if (pop.left != null) {
                stack.push(pop.left);
            }
            System.out.print(pop.val + "  ");
        }
    }

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

}
