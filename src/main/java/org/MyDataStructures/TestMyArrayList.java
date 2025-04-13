package org.MyDataStructures;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After add: " + java.util.Arrays.toString(list.toArray())); // [10, 20, 30]

        // Add at index
        list.add(1, 15);
        System.out.println("After add at index 1: " + java.util.Arrays.toString(list.toArray())); // [10, 15, 20, 30]

        // Set value
        list.set(2, 25);
        System.out.println("After set index 2: " + java.util.Arrays.toString(list.toArray())); // [10, 15, 25, 30]

        // Get values
        System.out.println("Get index 1: " + list.get(1)); // 15
        System.out.println("First: " + list.getFirst()); // 10
        System.out.println("Last: " + list.getLast());   // 30

        // Remove values
        list.remove(1);
        System.out.println("After remove index 1: " + java.util.Arrays.toString(list.toArray())); // [10, 25, 30]

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst and removeLast: " + java.util.Arrays.toString(list.toArray())); // [25]

        // Add more for sorting
        list.add(40);
        list.add(5);
        list.add(35);
        System.out.println("Before sort: " + java.util.Arrays.toString(list.toArray()));
        list.sort();
        System.out.println("After sort: " + java.util.Arrays.toString(list.toArray()));

        // Index checks
        System.out.println("IndexOf 35: " + list.indexOf(35));
        System.out.println("LastIndexOf 35: " + list.lastIndexOf(35));
        System.out.println("Exists 40: " + list.exists(40));

        // Clear list
        list.clear();
        System.out.println("After clear, size: " + list.size()); // 0
    }
}
