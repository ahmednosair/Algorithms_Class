package data_structures.linked_list;


public class LinkedList<T> {

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

    private Node<T> head;
    private long size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element, null);
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Invalid Index");

        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<T> p = head;
            for (int i = 0; i < index - 1; i++)
                p = p.getNext();
            newNode.setNext(p.getNext());
            p.setNext(newNode);
        }
        size++;

    }

    public T get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Invalid Index");

        Node<T> p = head;
        for (int i = 0; i < index; i++)
            p = p.getNext();
        return p.getElement();
    }

    public void set(int index, T element) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        Node<T> p = head;
        for (int i = 0; i < index; i++)
            p = p.getNext();
        p.setElement(element);

    }

    public void clear() {
        size = 0;
        head = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public long size() {
        return size;
    }

    public void remove(int index) {
        Node<T> temp;
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        if (index == 0) {
            temp = head;
            head = temp.getNext();
            temp.setNext(null);
        } else {
            Node<T> i = head;
            for (int j = 0; j < index - 1; j++)
                i = i.getNext();
            temp = i.getNext();
            i.setNext(temp.getNext());
            temp.setNext(null);
        }
        size--;
    }

}

