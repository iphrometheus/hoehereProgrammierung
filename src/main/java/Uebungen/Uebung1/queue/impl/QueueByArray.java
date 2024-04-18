package Uebungen.Uebung1.queue.impl;

import Uebungen.Uebung1.queue.Iterator;
import Uebungen.Uebung1.queue.Queue;

import java.util.function.Predicate;

public class QueueByArray implements Queue {
    private Object[] elements = new Object[16];
    private int first = 0;
    private int last = 0;

    public class ArrayIterator implements Iterator{
        private int iter = first;

        /**
         * Returns the next Object
         * @return Object
         */
        @Override
        public Object next() {
            return elements[iter + 1];
        }

        /**
         * Checks if a next Object is existent
         * @return boolean
         */
        @Override
        public boolean hasNext() {
            return !(next() == null);
        }
    }

    /**
     * Adds a new Object (can be null) alternative add()
     * @param element Object
     */
    @Override
    public void enqueue(Object element) {
        elements[last] = element;
         last++;
    }

    /**
     * Removes the first element does return the first element
     * @return Object
     */
    @Override
    public Object dequeue() {
        Object toDequeue = elements[first];
        int i = 0;
        for(Object o : elements){
            if(o == toDequeue) continue;
            elements[i] = o;
            i++;
        }
        last--;
        return toDequeue;
    }

    /**
     * Returns the first element of the queue does not delete it.
     * alternative element()
     * @return Object
     */
    @Override
    public Object first() {
        return elements[first];
    }


    /**
     * Shows if an Object is in the Queue
     * @param element Object
     * @return boolean
     */
    @Override
    public boolean contains(Object element) {
        for(Object o: elements){
            if (o == element) return true;
        }
        return false;
    }

    /**
     * Does return the Object with the index i
     * @param i int
     * @return Object
     */
    @Override
    public Object get(int i) {
        if(i+1 == last){
            return elements[i];
        }
        return null;
    }

    /**
     * Returns the number of elements in the array
     * @return int
     */
    @Override
    public int size() {
        return last- first;
    }

    /**
     * Shows if empty
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return last == 0;
    }

    /**
     * removes all elements from the queue
     */
    @Override
    public void clear() {
        elements = new Object[16];
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }

    @Override
    public Queue filter(Predicate predicate) {
        return null;
    }
}