package Uebungen.Uebung1.queue.impl;

import Uebungen.Uebung1.queue.Iterator;
import Uebungen.Uebung1.queue.Queue;

import java.util.function.Predicate;

public class QueueByList implements Queue {
    private int size = 0;
    private Object head;
    private Object tail;

    public class ListElement {
        private Object element;
        private Object next;
        ListElement(Object element, ListElement next){
            head = element;
            tail = next;
        }
    }
    public class ListIterator implements Iterator{
        private ListElement iter = (ListElement) head;
        public Object next(){
            return iter.next;
        }
        public boolean hasNext(){
            return !(next() == null);
        }
    }

    @Override
    public void enqueue(Object element) {
        new ListElement(element,null);
        size++;
    }

    @Override
    public Object dequeue() {
        size--;
        Object toRet = head;
        head = tail;
        return toRet;
    }

    @Override
    public Object first() {
        return head;
    }

    @Override
    public void add(Object element) {
        if (element == null){
            return;
        }
        new ListElement(element,null);
    }

    @Override
    public Object remove() {
        if(head == null) return null;
        size --;
        Object o = head;
        head = tail;
        return o;
    }

    @Override
    public Object element() {
       if(isEmpty()) return null;
       return head;
    }

    @Override
    public boolean contains(Object element) {
        for (int s = 0; s < size; s++) {
            if (element != head){
                head = tail;
            } else return true;
        }
        return false;
    }

    @Override
    public Object get(int i) {
        for (int j = 0; j < i; j++) {
            head = tail;

        }
        return head;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size > 1;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    @Override
    public Queue filter(Predicate predicate) {
        return null;
    }
}
