package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArraySorter;

public class ArraySorterImpl implements ArraySorter {
  @Override
  public void bubbleSort(CustomArray customArray) {
    int[] array = customArray.getArray();
    for (int out = array.length - 1; out >= 1; out--) {
      for (int in = 0; in < out; in++) {
        if (array[in] > array[in + 1]) {
          int temp = array[in];
          array[in] = array[in + 1];
          array[in + 1] = temp;
        }
      }
    }
    customArray.setArray(array);
  }

  @Override
  public void selectionSort(CustomArray customArray) {
    int[] array = customArray.getArray();
    for (int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }
      if (minIndex != i) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
    customArray.setArray(array);
  }
}