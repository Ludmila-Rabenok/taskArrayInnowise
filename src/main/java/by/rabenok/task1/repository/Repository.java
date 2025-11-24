package by.rabenok.task1.repository;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Repository {
  private static Repository instance;
  private final List<CustomArray> customArrayList = new ArrayList<>();

  private Repository() {
  }

  public static Repository getInstance() {
    if (instance == null) {
      instance = new Repository();
    }
    return instance;
  }

  public boolean add(CustomArray customArray) {
    return customArrayList.add(customArray);
  }

  public boolean remove(CustomArray customArray) {
    return customArrayList.remove(customArray);
  }

  public List<CustomArray> getAll() {
    return customArrayList;
  }

  public List<CustomArray> sort(Comparator<? super CustomArray> comparator) {
    return customArrayList.stream()
            .sorted(comparator)
            .toList();
  }

  public List<CustomArray> query(Specification specification) {
    return customArrayList.stream()
            .filter(specification::specify)
            .toList();
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Repository{");
    sb.append("customArrayList=").append(customArrayList);
    sb.append('}');
    return sb.toString();
  }
}