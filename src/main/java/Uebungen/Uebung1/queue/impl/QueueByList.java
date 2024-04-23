package Uebungen.Uebung1.queue.impl;

import Uebungen.Uebung1.queue.Iterator;
import Uebungen.Uebung1.queue.Predicate;
import Uebungen.Uebung1.queue.Queue;

public class QueueByList implements Queue {
    private int size = 0;
    private ListElement head;
    private ListElement tail;

    public class ListElement {
        private Object element;

        ListElement(Object element, ListElement next) {
            this.element = element;
            tail = next;
        }
    }

    public class ListIterator {
        private ListElement iter = head;

        public Object next() {
            iter = tail;
            return iter;
        }

        public boolean hasNext() {
            return tail != null;
        }
    }

    @Override
    public void enqueue(Object element) {
        head = new ListElement(element, null);
        size++;
    }

    @Override
    public Object dequeue() {
        Object tmp = head;
        head = tail;
        size--;
        return tmp;
    }

    @Override
    public Object first() {
        return head;
    }

    @Override
    public boolean contains(Object element) {
        while (head == element && head == null) {
            head = tail;
        }
        return head == null;
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
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Queue filter(Predicate predicate) {
        return null;
    }
}