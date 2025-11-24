package by.rabenok.task1.reader.impl;

import by.rabenok.task1.exception.ArrayException;
import by.rabenok.task1.reader.FileArrayReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileArrayReaderImpl implements FileArrayReader {
  public static final Logger LOGGER = LogManager.getLogger();

  @Override
  public List<String> readFile(String path) throws ArrayException {
    List<String> lines;
    try {
      lines = Files.readAllLines(Paths.get(path));
    } catch (IOException e) {
      LOGGER.error("Error reading file " + e.getMessage());
      throw new ArrayException("Error reading file " + e.getMessage());
    }
    return lines;
  }
}