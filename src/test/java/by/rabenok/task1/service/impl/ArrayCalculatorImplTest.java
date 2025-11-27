package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayCalculatorImplTest {
  @Test
  void shouldSumOfArray() {
    //given
    ArrayCalculator arrayCalculator = new ArrayCalculatorImpl();
    int[] array = {1, 2, 3};
    CustomArray customArray = new CustomArray(array);
    int sumExpected = 6;
    //when
    int sumActual = arrayCalculator.sumOfArray(customArray);
    //then
    assertEquals(sumExpected, sumActual);
  }
}