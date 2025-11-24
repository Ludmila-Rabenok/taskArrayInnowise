package by.rabenok.task1.factory.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.factory.ArrayFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CustomArrayFactoryTest {
  ArrayFactory arrayFactory = new CustomArrayFactory();
  int[] array;

  @BeforeEach
  void setUp() {
    array = new int[]{1, 8, 9, 5, 77};
  }

  @AfterEach
  void tearDown() {
    array = null;
  }

  @Test
  void shouldCreate() {
    //given
    CustomArray expected = new CustomArray(array);
    //when
    CustomArray actual = arrayFactory.create(array);
    //then
    assertArrayEquals(expected.getArray(), actual.getArray());
  }
}