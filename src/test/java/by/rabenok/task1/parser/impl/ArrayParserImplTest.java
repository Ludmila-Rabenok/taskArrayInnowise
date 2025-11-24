package by.rabenok.task1.parser.impl;

import by.rabenok.task1.parser.ArrayParser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayParserImplTest {
  ArrayParser arrayParser = new ArrayParserImpl();
  String line;

  @BeforeEach
  void setUp() {
    line = "1.2.5.99.77";
  }

  @AfterEach
  void tearDown() {
    line = null;
  }

  @Test
  void shouldParse() {
    //given
    int[] expected = {1, 2, 5, 99, 77};
    //when
    int[] actual = arrayParser.parse(line);
    //then
    assertArrayEquals(expected, actual);
  }
}