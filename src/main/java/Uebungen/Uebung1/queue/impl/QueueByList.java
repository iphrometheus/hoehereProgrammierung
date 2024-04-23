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
        if(size == 0){
            head = new ListElement(element, null);
            size++;
        } else {
            head.next = new ListElement(element, null);
            size++;
        }
    }

    @Override
    public Object dequeue() {
        Object tmp = head;
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
        while (head != element && head != null) {
            head = head.next;
        }
        return !(head == null);
    }

    @Override
    public Object get(int i) {
        for (int j = 0; j < i; j++) {
            head = head.next;
        }
        return head;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        head.next = null;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        while (head != null){
            str.append(Objects.toString(head)+ ", ");
        }
        return str.toString();
    }

    @Override
    public Queue filter(Predicate predicate) {
        return null;
    }
}