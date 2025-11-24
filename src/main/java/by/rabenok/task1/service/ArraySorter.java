package by.rabenok.task1.service;

import by.rabenok.task1.entity.CustomArray;

public interface ArraySorter {
  void bubbleSort(CustomArray customArray);

  void selectionSort(CustomArray customArray);
}