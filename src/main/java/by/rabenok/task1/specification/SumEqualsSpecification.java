package by.rabenok.task1.specification;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.warehouse.Warehouse;

public class SumEqualsSpecification implements Specification {
  private int sum;

  public SumEqualsSpecification(int sum) {
    this.sum = sum;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    int sum = Warehouse.getInstance().getCustomSummeryStatisticById(customArray.getId()).getSum();
    return this.sum == sum;
  }
}