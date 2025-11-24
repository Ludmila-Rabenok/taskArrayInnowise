package by.rabenok.task1.specification;

import by.rabenok.task1.entity.CustomArray;

import java.util.Arrays;

public class ElementSpecification implements Specification {
  private int element;

  public ElementSpecification(int element) {
    this.element = element;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    int[] array = customArray.getArray();
    return Arrays.stream(array).anyMatch(i -> i == element);
  }
}