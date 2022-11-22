package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        LinkedList<String> list = new LinkedList<>();
        list.addAll(firstList);
        list.addAll(secondList);
        list.sort(Collections.reverseOrder());
        queue.addAll(list);
        return queue;
    }
}
