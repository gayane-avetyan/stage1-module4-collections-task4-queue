package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        Queue<Integer> allDishes = new ArrayDeque<>();
        List<Integer> orderedList = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            allDishes.add(i);
        }

        int count = 1;

        while (!allDishes.isEmpty()) {

            int dishNumber = allDishes.poll();

            if (count % everyDishNumberToEat == 0)
                orderedList.add(dishNumber);
            else
                allDishes.add(dishNumber);

            count++;
        }

        return orderedList;
    }
}
