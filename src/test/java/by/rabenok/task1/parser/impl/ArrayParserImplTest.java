package by.rabenok.task1.parser.impl;

import by.rabenok.task1.parser.ArrayParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayParserImplTest {
  @Test
  void shouldParse() {
    //given
    ArrayParser arrayParser = new ArrayParserImpl();
    String line = "1.2.5.99.77";
    int[] expected = {1, 2, 5, 99, 77};
    //when
    int[] actual = arrayParser.parse(line);
    //then
    assertArrayEquals(expected, actual);
  }
}