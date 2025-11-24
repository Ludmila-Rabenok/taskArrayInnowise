package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArraySorter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraySorterImplTest {
  ArraySorter arraySorter = new ArraySorterImpl();
  CustomArray customArray;

  @BeforeEach
  void setUp() {
    int[] array = {8, 1, 4, 6, 7, 3, 5, 2};
    customArray = new CustomArray(array);
  }

  @AfterEach
  void tearDown() {
    customArray = null;
  }

  @Test
  void shouldBubbleSort() {
    //given
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    CustomArray expected = new CustomArray(array);
    //when
    arraySorter.bubbleSort(customArray);
    //then
    assertArrayEquals(expected.getArray(), customArray.getArray());
  }

  @Test
  void shouldSelectionSort() {
    //given
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    CustomArray expected = new CustomArray(array);
    //when
    arraySorter.selectionSort(customArray);
    //then
    assertArrayEquals(expected.getArray(), customArray.getArray());
  }
}