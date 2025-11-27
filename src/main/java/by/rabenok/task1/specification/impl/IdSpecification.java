package by.rabenok.task1.specification.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.specification.Specification;

public class IdSpecification implements Specification {
  private int id;

  public IdSpecification(int id) {
    this.id = id;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    return customArray.getId() == id;
  }
}