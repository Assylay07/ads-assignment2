package org.MyDataStructures;

public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        list = new MyArrayList<>();
    }

    public void push(T item) {
        list.add(item); // Add to the end
    }

    public T pop() {
        if (isEmpty()) return null;
        T item = list.get(list.size() - 1);
        list.removeLast();
        return item;
    }

    public T peek() {
        if (isEmpty()) return null;
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public Object[] toArray() {
        return list.toArray();
    }
}
