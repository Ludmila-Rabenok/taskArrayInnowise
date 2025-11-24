package by.rabenok.task1;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.exception.ArrayException;
import by.rabenok.task1.factory.ArrayFactory;
import by.rabenok.task1.factory.impl.CustomArrayFactory;
import by.rabenok.task1.parser.ArrayParser;
import by.rabenok.task1.parser.impl.ArrayParserImpl;
import by.rabenok.task1.reader.FileArrayReader;
import by.rabenok.task1.reader.impl.FileArrayReaderImpl;
import by.rabenok.task1.repository.Repository;
import by.rabenok.task1.validator.Validator;
import by.rabenok.task1.validator.impl.NumericValidator;

import java.util.List;

public class Main {

  public static void main(String[] args) throws ArrayException {
    FileArrayReader fileArrayReader = new FileArrayReaderImpl();
    List<String> lines = fileArrayReader.readFile("file/file.txt");
    ArrayParser arrayParser = new ArrayParserImpl();
    ArrayFactory arrayFactory = new CustomArrayFactory();
    Validator validator = new NumericValidator();
    for (String line : lines) {
      if (validator.isValidNumeric(line)) {
        int[] array = arrayParser.parse(line);
        CustomArray customArray = arrayFactory.create(array);
        Repository.getInstance().add(customArray);
      }
    }
//    System.out.println(Repository.getInstance().query(new ElementSpecification(8)));
//    System.out.println(Repository.getInstance().query(new SumEqualsSpecification(6)));
//    System.out.println(Repository.getInstance().query(new SumLessSpecification(50)));
//    System.out.println(Repository.getInstance().sort(new FirstElementComparator()));
//    System.out.println(Repository.getInstance().sort(new IdComparator()));
//    System.out.println(Repository.getInstance().sort(new LengthArrayComparator()));
  }
}