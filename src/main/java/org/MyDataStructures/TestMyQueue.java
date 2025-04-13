package org.MyDataStructures;

public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Queue after enqueues: " + java.util.Arrays.toString(queue.toArray())); // [A, B, C]

        System.out.println("Peek: " + queue.peek()); // A
        System.out.println("Dequeue: " + queue.dequeue()); // A
        System.out.println("After dequeue: " + java.util.Arrays.toString(queue.toArray())); // [B, C]

        queue.clear();
        System.out.println("After clear, isEmpty: " + queue.isEmpty()); // true
    }
}

