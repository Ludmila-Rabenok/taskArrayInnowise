package by.rabenok.task1.factory.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.factory.ArrayFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CustomArrayFactoryTest {
  @Test
  void shouldCreate() {
    //given
    ArrayFactory arrayFactory = new CustomArrayFactory();
    int[] array = new int[]{1, 8, 9, 5, 77};
    CustomArray expected = new CustomArray(array);
    //when
    CustomArray actual = arrayFactory.create(array);
    //then
    assertArrayEquals(expected.getArray(), actual.getArray());
  }
}