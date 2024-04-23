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
        String i = list.toString();
        System.out.println(i);
        array.add(45);
        array.remove();
    }
}
