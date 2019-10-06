package data_structures.queue;

public interface IQueue<T> {
    /**
     * Inserts an item at the queue front.
     */
    public void enqueue(T item);
    /**
     * Removes the object at the queue rear and returns it.
     */
    public T dequeue();
    /**
     * Tests if this queue is empty.
     */
    public boolean isEmpty();
    /**
     * Returns the number of elements in the queue
     */
    public int size();
}
