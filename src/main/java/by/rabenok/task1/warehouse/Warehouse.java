package by.rabenok.task1.warehouse;

import by.rabenok.task1.entity.CustomSummaryStatistic;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  private static Warehouse instance;

  private final Map<Integer, CustomSummaryStatistic> statisticMap = new HashMap<>();

  private Warehouse() {
  }

  public static Warehouse getInstance() {
    if (instance == null) {
      instance = new Warehouse();
    }
    return instance;
  }

  public CustomSummaryStatistic getCustomSummeryStatisticById(int id) {
    return statisticMap.get(id);
  }

  public CustomSummaryStatistic put(int id, CustomSummaryStatistic customSummaryStatistic) {
    return statisticMap.put(id, customSummaryStatistic);
  }
}