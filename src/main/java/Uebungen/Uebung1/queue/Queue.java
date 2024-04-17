package Uebungen.Uebung1.queue;

import java.util.function.Predicate;

public interface Queue {
    void enqueue(Object element);
    Object dequeue();
    Object first ();
    void add(Object element);
    Object remove();
    Object element();
    boolean contains(Object element);
    Object get(int i);
    int size();
    boolean isEmpty();
    void clear();
    String toString();
    Iterator iterator();
    Queue filter(Predicate predicate);
}
