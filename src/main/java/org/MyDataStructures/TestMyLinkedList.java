package org.MyDataStructures;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyList<String> list = new MyLinkedList<>();

        // Add elements
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("After add: " + java.util.Arrays.toString(list.toArray())); // [A, B, C]

        // Add at index
        list.add(1, "X");
        System.out.println("After add at index 1: " + java.util.Arrays.toString(list.toArray())); // [A, X, B, C]

        // Set element
        list.set(2, "Y");
        System.out.println("After set index 2: " + java.util.Arrays.toString(list.toArray())); // [A, X, Y, C]

        // Get values
        System.out.println("Get index 1: " + list.get(1));   // X
        System.out.println("First: " + list.getFirst());     // A
        System.out.println("Last: " + list.getLast());       // C

        // Remove
        list.remove(1);
        System.out.println("After remove index 1: " + java.util.Arrays.toString(list.toArray())); // [A, Y, C]
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + java.util.Arrays.toString(list.toArray())); // [Y]

        // Add more to test sort
        list.add("D");
        list.add("B");
        list.add("E");
        System.out.println("Before sort: " + java.util.Arrays.toString(list.toArray()));
        list.sort();
        System.out.println("After sort: " + java.util.Arrays.toString(list.toArray())); // [B, D, E, Y]

        // Index and existence
        System.out.println("IndexOf Y: " + list.indexOf("Y"));       // 3
        System.out.println("LastIndexOf Y: " + list.lastIndexOf("Y"));// 3
        System.out.println("Exists D: " + list.exists("D"));         // true

        // Clear
        list.clear();
        System.out.println("After clear, size: " + list.size());     // 0
    }
}

