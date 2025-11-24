package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayMinMaxFinder;

public class ArrayMinMaxFinderImpl implements ArrayMinMaxFinder {

  @Override
  public int findMin(CustomArray customArray) {
    int[] array = customArray.getArray();
    int min = array[0];
    for (int number : array) {
      min = Math.min(min, number);
    }
    return min;
  }

  @Override
  public int findMax(CustomArray customArray) {
    int[] array = customArray.getArray();
    int max = array[0];
    for (int number : array) {
      max = Math.max(max, number);
    }
    return max;
  }
}