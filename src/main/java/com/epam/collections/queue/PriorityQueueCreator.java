package com.epam.collections.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        firstList.addAll(secondList);
        firstList.sort(Collections.reverseOrder());
        queue.addAll(firstList);
        return queue;
    }
}
