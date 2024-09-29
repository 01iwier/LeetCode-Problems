/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
 */

// @lc code=start

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        int x = stack2.pop();
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        return x;
    }
    
    public int peek() {
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        int x = stack2.peek();
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

