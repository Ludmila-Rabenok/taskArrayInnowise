package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayCalculator;

import java.util.Arrays;

public class ArrayCalculatorImpl implements ArrayCalculator {
  @Override
  public int sumOfArray(CustomArray customArray) {
    int[] array = customArray.getArray();
    return Arrays.stream(array).sum();
  }
}