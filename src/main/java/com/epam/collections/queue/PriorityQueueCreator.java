package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1.compareTo(o2) > 0)
                    return -1;
                else if (o1.compareTo(o2) < 0)
                    return 1;

                return 0;
            }
        });

        priorityQueue.addAll(firstList);
        priorityQueue.addAll(secondList);

        return priorityQueue;
    }
}
