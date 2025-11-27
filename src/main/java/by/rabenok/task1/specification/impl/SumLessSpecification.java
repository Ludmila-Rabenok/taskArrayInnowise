package by.rabenok.task1.specification.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayCalculator;
import by.rabenok.task1.service.impl.ArrayCalculatorImpl;
import by.rabenok.task1.specification.Specification;

public class SumLessSpecification implements Specification {
  private final int sum;

  public SumLessSpecification(int sum) {
    this.sum = sum;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    ArrayCalculator arrayCalculator = new ArrayCalculatorImpl();
    int sum = arrayCalculator.sumOfArray(customArray);
    return sum < this.sum;
  }
}