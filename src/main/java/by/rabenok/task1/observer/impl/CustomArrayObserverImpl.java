package by.rabenok.task1.observer.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.observer.CustomArrayEvent;
import by.rabenok.task1.observer.CustomArrayObserver;
import by.rabenok.task1.service.ArrayCalculator;
import by.rabenok.task1.service.ArrayMinMaxFinder;
import by.rabenok.task1.service.impl.ArrayCalculatorImpl;
import by.rabenok.task1.service.impl.ArrayMinMaxFinderImpl;
import by.rabenok.task1.entity.CustomSummaryStatistic;
import by.rabenok.task1.warehouse.Warehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayObserverImpl implements CustomArrayObserver {
  private static final Logger LOGGER = LogManager.getLogger();

  @Override
  public void actionPerformed(CustomArrayEvent event) {
    CustomArray customArray = event.getSource();
    ArrayMinMaxFinder arrayMinMaxFinder = new ArrayMinMaxFinderImpl();
    ArrayCalculator arrayCalculator = new ArrayCalculatorImpl();
    int sum = arrayCalculator.sumOfArray(customArray);
    int min = arrayMinMaxFinder.findMin(customArray);
    int max = arrayMinMaxFinder.findMax(customArray);
    CustomSummaryStatistic customSummaryStatistic = new CustomSummaryStatistic(sum, min, max);
    Warehouse.getInstance().put(customArray.getId(), customSummaryStatistic);
    LOGGER.info("Summary statistic has been recalculated and added to warehouse." +
            " Id CustomArray = {} ", customArray.getId());
  }
}
