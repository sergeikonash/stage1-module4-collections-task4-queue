package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> list = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            list.add(i+1);
        }
        int numberOfIteration = 1;
        while (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (numberOfIteration == everyDishNumberToEat) {
                    finalList.add(list.get(i));
                    list.remove(i);
                    i--;
                }
                numberOfIteration++;
                if (numberOfIteration > everyDishNumberToEat) {
                    numberOfIteration = 1;
                }
            }
        }
        return finalList;
    }
}
