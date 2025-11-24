package by.rabenok.task1.specification;

import by.rabenok.task1.entity.CustomArray;

@FunctionalInterface
public interface Specification {
  boolean specify(CustomArray customArray);
}