package by.rabenok.task1.specification.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.specification.Specification;

public class IdIntervalSpecification implements Specification {
  private final int minId;
  private final int maxId;

  public IdIntervalSpecification(int minId, int maxId) {
    this.minId = minId;
    this.maxId = maxId;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    return (customArray.getId() >= minId && customArray.getId() <= maxId);
  }
}