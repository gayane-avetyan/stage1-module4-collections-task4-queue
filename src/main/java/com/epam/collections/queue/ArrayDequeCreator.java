package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        boolean isFirstIteration = true;

        do {
            if (!isFirstIteration)
                firstQueue.add(arrayDeque.pollLast());

            for (int i = 0; i < 2; i++) {
                if (firstQueue.peek() != null)
                    arrayDeque.add(firstQueue.poll());
            }

            if (!isFirstIteration)
                secondQueue.add(arrayDeque.pollLast());

            for (int i = 0; i < 2; i++) {
                if (secondQueue.peek() != null)
                    arrayDeque.add(secondQueue.poll());
            }

            isFirstIteration = false;
        }
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty());

        return arrayDeque;
    }
}
