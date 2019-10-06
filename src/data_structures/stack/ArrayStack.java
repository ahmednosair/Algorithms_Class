package data_structures.stack;

import java.util.ArrayList;

public class ArrayStack<T> implements IStack<T>{

    private ArrayList<T> mylist;
    private int pointer;
    public ArrayStack() {
        mylist=new ArrayList<>();
        pointer=-1;
    }

    public T pop(){
        if(pointer==-1)
            throw new RuntimeException("Stack is empty");
        pointer--;
        return mylist.get(pointer+1);
    }

    public T peek(){
        if(pointer==-1)
            throw new RuntimeException("Stack is empty");
        return mylist.get(pointer);
    }


    public void push(T element){
        if(pointer==mylist.size()-1){
            mylist.add(element);
        }
        else
            mylist.set(pointer+1,element);
        pointer++;
    }

    public boolean isEmpty(){
        return pointer==-1;
    }


    public int size(){
        return pointer+1;
    }
}
