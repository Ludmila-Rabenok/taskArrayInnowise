package by.rabenok.task1.specification;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.entity.CustomSummaryStatistic;
import by.rabenok.task1.warehouse.Warehouse;

public class SumLessSpecification implements Specification {
  private int sum;

  public SumLessSpecification(int sum) {
    this.sum = sum;
  }

  @Override
  public boolean specify(CustomArray customArray) {
    int idCustomArray = customArray.getId();
    CustomSummaryStatistic customSummaryStatistic = Warehouse.getInstance().getCustomSummeryStatisticById(idCustomArray);
    int sum = customSummaryStatistic.getSum();
    return sum < this.sum;
  }
}