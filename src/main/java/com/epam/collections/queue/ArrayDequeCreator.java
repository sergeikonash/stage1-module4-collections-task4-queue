package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(firstQueue.remove());
        arrayDeque.add(secondQueue.remove());
        arrayDeque.add(secondQueue.remove());
        try {
        while (firstQueue.size() > 0 && secondQueue.size() > 0) {
            firstQueue.add(arrayDeque.pollLast());
            arrayDeque.add(firstQueue.poll());
            arrayDeque.add(firstQueue.poll());
            secondQueue.add(arrayDeque.pollLast());
            arrayDeque.add(secondQueue.poll());
            arrayDeque.add(secondQueue.poll());
        }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return arrayDeque;
    }
}
