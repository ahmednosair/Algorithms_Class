package data_structures.stack;

public interface IStack<T> {
    /**
     * Removes the element at the top of stack and returns that element. * * @return top of stack element, or through exception if empty
     */
    public T pop();

    /**
     * Get the element at the top of stack without removing it from stack. * * @return top of stack element, or through exception if empty
     */
    public T peek();

    /**
     * Pushes an item onto the top of this stack. * * @param object * to insert
     */
    public void push(T element);

    /**
     * Tests if this stack is empty * * @return true if stack empty
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the stack. * * @return number of elements in the stack
     */
    public int size();
}
