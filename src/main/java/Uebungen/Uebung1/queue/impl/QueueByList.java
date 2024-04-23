package Uebungen.Uebung1.queue.impl;

import Uebungen.Uebung1.queue.Iterator;
import Uebungen.Uebung1.queue.Predicate;
import Uebungen.Uebung1.queue.Queue;


import java.util.Objects;

public class QueueByList implements Queue {
    private int size = 0;
    private ListElement head;
    private ListElement tail;

    public class ListElement {
        private Object element;
        private ListElement next;
        ListElement(Object element, ListElement next) {
            this.element = element;
            this.next = next;
        }
    }

    public class ListIterator implements Iterator {
        private ListElement iter = head;

        public Object next() {
            iter = iter.next;
            return iter;
        }

        public boolean hasNext() {
            return head.next != null;
        }
    }

    @Override
    public void enqueue(Object element) {
        tail = head;
        ListElement el = new ListElement(element, null);
        if(size == 0){
            head = el;
            size++;
        } else {
            while (tail.next != null && tail.next.next != null) tail = tail.next;
            tail.next = el;
            size++;
        }
    }

    @Override
    public Object dequeue() {
        Object tmp = head.element;
        head = head.next;
        size--;
        return tmp;
    }

    @Override
    public Object first() {
        return head;
    }

    @Override
    public boolean contains(Object element) {
        tail = head;
        while (tail != element && tail != null) {
            tail = tail.next;
        }
        return !(tail == null);
    }

    @Override
    public Object get(int i) {
        if(i+1 > size) return null;
        tail = head;
        for (int j = 0; j < i; j++) {
            tail = tail.next;
        }
        return tail.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    @Override
    public String toString(){
        String str = "";
        tail = head;
        if (size == 0) return "null";
        for (int i = 0; i < size; i++) {
            if (tail == null){
                str += "null, ";
                tail = tail.next;
                continue;
            }
            str += tail.element + ", ";
            tail = tail.next;
        }
        return str;
    }

    @Override
    public Queue filter(Predicate predicate) {
        return null;
    }
}