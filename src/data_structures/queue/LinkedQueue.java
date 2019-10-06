package data_structures.queue;


public class LinkedQueue<T> implements IQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedQueue() {
        size = 0;
        head = null;
        tail = null;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item, null);
        if (tail == null) {
            tail = newNode;
            head = newNode;
        }
        tail.setNext(newNode);
        tail = newNode;
        size++;

    }

    public T dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        T temp = head.getElement();
        head = head.getNext();
        size--;
        return temp;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private class Node<Ty> {
        private Node(Ty element, Node<Ty> next) {
            this.element = element;
            this.next = next;
        }

        private Ty element;
        private Node<Ty> next;

        private Ty getElement() {
            return element;
        }

        private void setElement(Ty element) {
            this.element = element;
        }

        private Node<Ty> getNext() {
            return next;
        }

        private void setNext(Node<Ty> next) {
            this.next = next;
        }
    }

}
