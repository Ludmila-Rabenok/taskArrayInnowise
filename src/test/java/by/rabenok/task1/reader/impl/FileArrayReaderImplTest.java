package by.rabenok.task1.reader.impl;

import by.rabenok.task1.exception.ArrayException;
import by.rabenok.task1.reader.FileArrayReader;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;


class FileArrayReaderImplTest {
  FileArrayReader fileArrayReader = new FileArrayReaderImpl();
  private static final String NON_EXISTENT_FILE = "non_existent_file.txt";

  @Test
  void shouldReadFileWithMock() throws ArrayException {
    //given
    try (MockedStatic<Files> mockedStatic = Mockito.mockStatic(Files.class)) {
      mockedStatic.when(() -> Files.readAllLines(any(Path.class))).thenReturn(any(List.class));
      //when
      fileArrayReader.readFile(NON_EXISTENT_FILE);
      //then
      mockedStatic.verify(() -> Files.readAllLines(any(Path.class)));
    }
  }

  @Test
  public void shouldReadFile() throws ArrayException {
    //given
    List<String> expected = new ArrayList<>();
    expected.add("11.22.33");
    expected.add("55.6.7");
    expected.add("9.8.77");
    //when
    List<String> actual = fileArrayReader.readFile("file/test.txt");
    //then
    assertEquals(expected, actual);
  }

  @Test
  void shouldThrowArrayExceptionWhenFileNotFound() {
    assertThrows(ArrayException.class, () -> {
      fileArrayReader.readFile(NON_EXISTENT_FILE);
    });
  }
}