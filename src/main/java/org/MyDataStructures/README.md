
# Custom Java Data Structures

This project implements custom versions of core data structures in Java **without using `java.util` collections** (except `Iterator`). These structures mimic Java’s `ArrayList`, `LinkedList`, `Stack`, `Queue`, and `MinHeap`.

---

## 📁 Project Structure

```
.
├── MyList.java               # Interface for common list methods
├── MyArrayList.java          # Array-based list implementation
├── MyLinkedList.java         # Doubly linked list implementation
├── MyStack.java              # Stack (based on MyArrayList)
├── MyQueue.java              # Queue (based on MyLinkedList)
├── MyMinHeap.java            # MinHeap (based on MyArrayList)
├── TestMyArrayList.java      # Test class for MyArrayList
├── TestMyLinkedList.java     # Test class for MyLinkedList
├── TestMyStack.java          # Test class for MyStack
├── TestMyQueue.java          # Test class for MyQueue
├── TestMyMinHeap.java        # Test class for MyMinHeap
```

---

##  Technologies

- Java 8+
- No external libraries
- Only `Iterator` allowed from `java.util`

---

## Features

### MyList (Interface)
- Common interface for `MyArrayList` and `MyLinkedList`
- Declares methods like `add`, `remove`, `get`, `set`, `sort`, `clear`, `toArray`, etc.

### MyArrayList
- Dynamic array implementation
- Manages internal resizing
- All list operations implemented manually
- Supports sorting using `Comparable`

### MyLinkedList
- Doubly linked list
- Prevents node loops
- Fully implements `MyList` interface

### MyStack
- LIFO structure using `MyArrayList`
- Methods: `push`, `pop`, `peek`, `isEmpty`

### MyQueue
- FIFO structure using `MyLinkedList`
- Methods: `enqueue`, `dequeue`, `peek`, `isEmpty`

### MyMinHeap
- Binary Min Heap implementation using `MyArrayList`
- Maintains heap property after insertion and deletion
- Useful for priority queues

---

## How to Test

Each structure has a separate test class:
```bash
# Compile
javac *.java

# Run
java TestMyArrayList
java TestMyLinkedList
java TestMyStack
java TestMyQueue
java TestMyMinHeap
```

All outputs are printed to the console.

---

## Notes

- Generics used for type safety.
- Sorting assumes elements implement `Comparable<T>`.
- Avoids built-in Java collections except `Iterator`.

---
