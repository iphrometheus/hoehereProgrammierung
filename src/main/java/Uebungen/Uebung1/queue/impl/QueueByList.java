package Uebungen.Uebung1.queue.impl;

import Uebungen.Uebung1.queue.Iterator;
import Uebungen.Uebung1.queue.Predicate;
import Uebungen.Uebung1.queue.Queue;

import java.util.Objects;

public class QueueByList implements Queue {
    private int size = 0;
    private ListElement head;
    private ListElement tail;

    @Override
    public void enqueue(Object element) {
        tail = head;
        ListElement el = new ListElement(element, null);
        if (size == 0) {
            head = el;
            size++;
        } else {
            while (tail.next != null) tail = tail.next;
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
        while (!Objects.equals(tail, element) || tail != null && tail.next != null) {
            tail = tail.next;
        }
        return !(tail == null);
    }

    @Override
    public Object get(int i) {
        if (i + 1 > size) i = size - 1; // oder Exception
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
    public String toString() {
        return convertToString();
  }
         /*
        String str = "";
        tail = head;
        if (size == 0) return "null";
        for (int i = 0; i < size; i++) {
            if (tail == null) {
                str += "null, ";
                tail = tail.next;
                continue;
            }
            str += tail.element + ", ";
            tail = tail.next;
        }
        return str;
    }*/

    @Override
    public Queue filter(Predicate predicate) {
        var result = new QueueByArray();
        Iterator it = iterator();
        while (it.hasNext()) {
            var tmp = iterator().next();
            if (predicate.test(tmp)) {
                result.enqueue(tmp);
            }
        }
        return result;
    }

    public class ListElement {
        private final Object element;
        private ListElement next;

        ListElement(Object element, ListElement next) {
            this.element = element;
            this.next = next;
        }
    }

    private class ListIterator implements Iterator {
        private ListElement iter = head;

        public Object next() {
            var el = iter.element;
            iter = iter.next;
            return el;
        }

        /**
         * hasNext shows if the object at the Moment != Null
         *
         * @return boolean
         */
        public boolean hasNext() {
            return iter != null;
        }
    }
}