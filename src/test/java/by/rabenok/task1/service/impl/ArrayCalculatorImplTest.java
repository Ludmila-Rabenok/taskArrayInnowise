package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayCalculatorImplTest {
  ArrayCalculator arrayCalculator = new ArrayCalculatorImpl();
  CustomArray customArray;

  @BeforeEach
  void setUp() {
    int[] array = {1, 2, 3};
    customArray = new CustomArray(array);
  }

  @AfterEach
  void tearDown() {
    customArray = null;
  }

  @Test
  void shouldSumOfArray() {
    //given
    int sumExpected = 6;
    //when
    int sumActual = arrayCalculator.sumOfArray(customArray);
    //then
    assertEquals(sumExpected, sumActual);
  }
}