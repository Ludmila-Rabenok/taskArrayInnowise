package by.rabenok.task1;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.exception.ArrayException;
import by.rabenok.task1.factory.ArrayFactory;
import by.rabenok.task1.factory.impl.CustomArrayFactory;
import by.rabenok.task1.parser.ArrayParser;
import by.rabenok.task1.parser.impl.ArrayParserImpl;
import by.rabenok.task1.reader.FileArrayReader;
import by.rabenok.task1.reader.impl.FileArrayReaderImpl;
import by.rabenok.task1.service.ArrayCalculator;
import by.rabenok.task1.service.impl.ArrayCalculatorImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest {
  static List<String> actualList;
  static int[] actualArray;
  static CustomArray actualCustomArray;

  @AfterAll
  static void afterAll() {
    actualList = null;
    actualArray = null;
    actualCustomArray = null;
  }

  @Test
  @Order(1)
  void shouldReadFile() throws ArrayException {
    //given
    List<String> expectedList = new ArrayList<>();
    expectedList.add("11.22.33");
    expectedList.add("55.6.7");
    expectedList.add("9.8.77");
    FileArrayReader fileArrayReader = new FileArrayReaderImpl();
    //when
    actualList = fileArrayReader.readFile("file/test.txt");
    //then
    assertEquals(expectedList, actualList);
  }

  @Test
  @Order(2)
  void shouldParseLine() {
    //given
    int[] expectedArray = {11, 22, 33};
    ArrayParser arrayParser = new ArrayParserImpl();
    //when
    actualArray = arrayParser.parse(actualList.get(0));
    //then
    assertArrayEquals(expectedArray, actualArray);
  }

  @Test
  @Order(3)
  void shouldFactoryCreateCustomArray() {
    //given
    CustomArray expected = new CustomArray(actualArray);
    ArrayFactory arrayFactory = new CustomArrayFactory();
    //when
    actualCustomArray = arrayFactory.create(actualArray);
    //then
    assertArrayEquals(expected.getArray(), actualCustomArray.getArray());
  }

  @Test
  @Order(4)
  void shouldSumCustomArray() {
    //given
    int sumExpected = 66;
    ArrayCalculator arrayCalculator = new ArrayCalculatorImpl();
    //when
    int sumActual = arrayCalculator.sumOfArray(actualCustomArray);
    //then
    assertEquals(sumExpected, sumActual);
  }
}