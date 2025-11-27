package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArraySorter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraySorterImplTest {
  ArraySorter arraySorter = new ArraySorterImpl();
  CustomArray customArray;
  CustomArray expected;

  @BeforeEach
  void setUp() {
    int[] arrayNoSort = {8, 1, 4, 6, 7, 3, 5, 2};
    customArray = new CustomArray(arrayNoSort);
    int[] arraySort = {1, 2, 3, 4, 5, 6, 7, 8};
    expected = new CustomArray(arraySort);
  }

  @AfterEach
  void tearDown() {
    customArray = null;
  }

  @Test
  void shouldBubbleSort() {
    //when
    arraySorter.bubbleSort(customArray);
    //then
    assertArrayEquals(expected.getArray(), customArray.getArray());
  }

  @Test
  void shouldSelectionSort() {
    //when
    arraySorter.selectionSort(customArray);
    //then
    assertArrayEquals(expected.getArray(), customArray.getArray());
  }
}