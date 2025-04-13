package org.MyDataStructures;

public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + java.util.Arrays.toString(stack.toArray())); // [10, 20, 30]

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("After pop: " + java.util.Arrays.toString(stack.toArray())); // [10, 20]

        stack.clear();
        System.out.println("After clear, isEmpty: " + stack.isEmpty()); // true
    }
}
