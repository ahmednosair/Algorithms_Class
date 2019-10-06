package data_structures.stack;


public class LinkedStack<T> implements IStack<T> {
    public Node<T> getTop() {
        return top;
    }
    private class Node<Ty> {
        private Node(Ty element, Node<Ty> previous) {
            this.element = element;
            this.previous = previous;
        }

        private Ty element;
        private Node<Ty> previous;

        private Ty getElement() {
            return element;
        }

        private void setElement(Ty element) {
            this.element = element;
        }

        private Node<Ty> getPrevious() {
            return previous;
        }

        private void setPrevious(Node<Ty> previous) {
            this.previous = previous;
        }
    }

    private int size;
    private Node<T> top;

    public LinkedStack() {
        size=0;
        top=null;
    }


    public T pop(){
        if(top==null)
            throw new RuntimeException("Stack is empty");
        T e= top.getElement();
        top=top.getPrevious();
        size--;
        return e;
    }

    public T peek(){
        if(top==null)
            throw new RuntimeException("Stack is empty");
        return top.getElement();
    }


    public void push(T element){
        Node<T> newNode = new Node<>(element,null);
        newNode.setPrevious(top);
        top=newNode;
        size++;
    }


    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

}

