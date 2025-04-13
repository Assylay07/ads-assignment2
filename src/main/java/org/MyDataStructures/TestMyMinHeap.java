package org.MyDataStructures;

public class TestMyMinHeap {
    public static void main(String[] args) {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);
        heap.insert(4);
        System.out.println("Heap after insertions: " + java.util.Arrays.toString(heap.toArray())); // [1, 3, 8, 5, 4]

        System.out.println("Peek: " + heap.peek()); // 1
        System.out.println("ExtractMin: " + heap.extractMin()); // 1
        System.out.println("After extractMin: " + java.util.Arrays.toString(heap.toArray())); // [3, 4, 8, 5]

        heap.clear();
        System.out.println("After clear, isEmpty: " + heap.isEmpty()); // true
    }
}
