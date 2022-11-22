package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        ArrayDeque<Integer> arrayDeque1 = (ArrayDeque<Integer>) firstQueue;
        ArrayDeque<Integer> arrayDeque2 = (ArrayDeque<Integer>) secondQueue;
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());
        try {
        while (firstQueue.size() > 0 && secondQueue.size() > 0) {
            arrayDeque1.addLast(arrayDeque.pollLast());
            arrayDeque.add(arrayDeque1.pollFirst());
            arrayDeque.add(arrayDeque1.pollFirst());
            arrayDeque2.addLast(arrayDeque.pollLast());
            arrayDeque.add(arrayDeque2.pollFirst());
            arrayDeque.add(arrayDeque2.pollFirst());
        }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return arrayDeque;
    }
}
