package by.rabenok.task1.parser.impl;

import by.rabenok.task1.parser.ArrayParser;

import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {
  public static final String SPLIT_ARRAY_REGEX = "[\\s,;.-]+";

  @Override
  public int[] parse(String line) {
    String[] stringArray = line.strip().split(SPLIT_ARRAY_REGEX);
    return Arrays.stream(stringArray)
            .mapToInt(Integer::parseInt)
            .toArray();
  }
}