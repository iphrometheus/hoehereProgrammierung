package Uebungen.Uebung1.queue;

public interface Queue {
    void enqueue(Object element);

    Object dequeue();

    Object first();

    default void add(Object element) {
        if (element != null) enqueue(element);
    }

    default Object remove() {
        return isEmpty() ? null : dequeue();
    }

    default Object element() {
        return isEmpty() ? null : first();
    }

    boolean contains(Object element);

    Object get(int i);

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }

    void clear();

     String toString();
     default String convertToString(){
         StringBuilder res = new StringBuilder("[");
         Iterator iterator = iterator();
         while (iterator.hasNext()){
             res.append(iterator.next());
             if(iterator.hasNext()){
                 res.append(", ");
             }
         }
         res.append("]");
         return res.toString();
     }

    Iterator iterator();

    Queue filter(Predicate predicate);
}
