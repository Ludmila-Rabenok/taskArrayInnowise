package by.rabenok.task1.reader;

import by.rabenok.task1.exception.ArrayException;

import java.util.List;

public interface FileArrayReader {
  List<String> readFile(String path) throws ArrayException;
}