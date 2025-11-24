package by.rabenok.task1.factory.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.factory.ArrayFactory;

public class CustomArrayFactory implements ArrayFactory {
  @Override
  public CustomArray create(int[] array) {
    return new CustomArray(array);
  }
}
