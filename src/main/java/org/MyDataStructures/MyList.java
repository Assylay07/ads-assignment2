package org.MyDataStructures;

public interface MyList<T> {
    void add(T item);
    void add(int index, T item);
    T get(int index);
    T set(int index, T item);
    T remove(int index);
    void removeFirst();
    void removeLast();
    T getFirst();
    T getLast();
    boolean exists(T item);
    int indexOf(T item);
    int lastIndexOf(T item);
    int size();
    void clear();
    void sort();
    Object[] toArray();
}

