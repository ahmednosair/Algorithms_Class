package data_structures.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class ArrayQueue<T> implements IQueue<T> {
    private int front;
    private int back;
    private int maxsize;
    private int size;
    private ArrayList<T> arr;

    public ArrayQueue() {
        maxsize = 2;
        front = 0;
        back = 0;
        arr = new ArrayList<>(Collections.nCopies(maxsize,null));
    }

    public void enqueue(T item) {
        if (size == maxsize-1) {
            stretch();
        }
        arr.set(back,item);
        back = ++back % maxsize;
        size++;
    }

    public T dequeue() {
        T temp;
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        temp = arr.get(front);
        front = ++front % maxsize;
        size--;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void stretch(){
        maxsize*=2;
        while (arr.size()<maxsize) arr.add(null);
    }
}
