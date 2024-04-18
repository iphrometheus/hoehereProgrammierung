package Uebungen.Uebung1.queue;

import java.util.function.Predicate;

public interface Queue {
    void enqueue(Object element);
    Object dequeue();
    Object first ();
    default void add(Object element){
        if(element != null) enqueue(element);
    };
    default Object remove(){
        return isEmpty() ? null : dequeue();
    };
    default Object element(){
        return isEmpty() ? null : first();
    };
    boolean contains(Object element);
    Object get(int i);
    int size();
    default boolean isEmpty(){
        return size() == 0;
    };
    void clear();
    String toString();
    Iterator iterator();
    Queue filter(Predicate predicate);
}