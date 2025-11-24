package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayMinMaxFinder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayMinMaxFinderImplTest {
  ArrayMinMaxFinder arrayMinMaxFinder = new ArrayMinMaxFinderImpl();
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
  void shouldFindMin() {
    //given
    int minExpected = 1;
    //when
    int minActual = arrayMinMaxFinder.findMin(customArray);
    //then
    assertEquals(minExpected, minActual);
  }

  @Test
  void shouldFindMax() {
    //given
    int maxExpected = 3;
    //when
    int maxActual = arrayMinMaxFinder.findMax(customArray);
    //then
    assertEquals(maxExpected, maxActual);
  }
}