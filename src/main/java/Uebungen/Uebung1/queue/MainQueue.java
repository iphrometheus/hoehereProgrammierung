package Uebungen.Uebung1.queue;

import Uebungen.Uebung1.queue.impl.QueueByArray;
import Uebungen.Uebung1.queue.impl.QueueByList;

import java.util.Objects;

public class MainQueue {
    public static void main(String[] args) {
        QueueByArray array = new QueueByArray();
        array.add(3);
        array.enqueue(null);
        QueueByList list = new QueueByList();
        list.add(33);
        list.enqueue("ls");
        list.enqueue("mo8ih");
        Object o = list.dequeue();
        Object l = list.get(1);
        System.out.println(o);
        System.out.println(l);
        list.add("h2");
        String i = list.toString();
        list.clear();
        String m = list.toString();
        System.out.println(i);
        System.out.println(m);
        array.add(45);
        array.remove();
    }
}
