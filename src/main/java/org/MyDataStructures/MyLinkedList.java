package org.MyDataStructures;

public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode prev, next;

        MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head, tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T item) {
        addLast(item);
    }

    public void addFirst(T item) {
        MyNode newNode = new MyNode(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(T item) {
        MyNode newNode = new MyNode(item);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            MyNode current = getNode(index);
            MyNode newNode = new MyNode(item);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public T set(int index, T item) {
        MyNode node = getNode(index);
        if (node != null) node.data = item;
        return item;
    }

    public T get(int index) {
        MyNode node = getNode(index);
        return node != null ? node.data : null;
    }

    public T getFirst() {
        return head != null ? head.data : null;
    }

    public T getLast() {
        return tail != null ? tail.data : null;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) return null;

        MyNode toRemove = getNode(index);
        if (toRemove.prev != null) toRemove.prev.next = toRemove.next;
        else head = toRemove.next;

        if (toRemove.next != null) toRemove.next.prev = toRemove.prev;
        else tail = toRemove.prev;

        size--;
        return null;
    }

    public void removeFirst() {
        remove(0);
    }

    public void removeLast() {
        remove(size - 1);
    }

    public void sort() {
        if (size < 2) return;

        for (MyNode i = head; i != null; i = i.next) {
            for (MyNode j = i.next; j != null; j = j.next) {
                Comparable<T> a = (Comparable<T>) i.data;
                if (a.compareTo(j.data) > 0) {
                    T temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    public int indexOf(Object object) {
        int i = 0;
        for (MyNode curr = head; curr != null; curr = curr.next) {
            if (curr.data.equals(object)) return i;
            i++;
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        int i = size - 1;
        for (MyNode curr = tail; curr != null; curr = curr.prev) {
            if (curr.data.equals(object)) return i;
            i--;
        }
        return -1;
    }

    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size];
        MyNode curr = head;
        int i = 0;
        while (curr != null) {
            arr[i++] = curr.data;
            curr = curr.next;
        }
        return arr;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    private MyNode getNode(int index) {
        if (index < 0 || index >= size) return null;
        MyNode curr;
        if (index < size / 2) {
            curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
        } else {
            curr = tail;
            for (int i = size - 1; i > index; i--) curr = curr.prev;
        }
        return curr;
    }

    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            MyNode curr = head;

            public boolean hasNext() {
                return curr != null;
            }

            public T next() {
                T val = curr.data;
                curr = curr.next;
                return val;
            }
        };
    }
}

