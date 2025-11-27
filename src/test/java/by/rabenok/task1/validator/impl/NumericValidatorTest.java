package by.rabenok.task1.validator.impl;

import by.rabenok.task1.validator.Validator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumericValidatorTest {
  Validator numericValidator = new NumericValidator();

  @ParameterizedTest
  @MethodSource("correctArgsProvider")
  void shouldIsValidNumeric(String line) {
    //when
    boolean actual = numericValidator.isValidNumeric(line);
    //then
    assertTrue(actual);
  }

  @ParameterizedTest
  @MethodSource("incorrectArgsProvider")
  void shouldIsNotValidNumericWhenStrIncorrect(String line) {
    //when
    boolean actual = numericValidator.isValidNumeric(line);
    //then
    assertFalse(actual);
  }

  static Stream<String> correctArgsProvider() {
    return Stream.of("1.2.8.99", "5,9 , 45,888888", "101;102;103;0", "9-7 -88-95", "4 8 99 55 77");
  }

  static Stream<String> incorrectArgsProvider() {
    return Stream.of("1.y2.8.99", "5,9 i, 45,888888", "101;102p;103;0", "");
  }
}