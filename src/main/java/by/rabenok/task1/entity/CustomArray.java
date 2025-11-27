package by.rabenok.task1.entity;

import by.rabenok.task1.observer.CustomArrayEvent;
import by.rabenok.task1.observer.CustomArrayObservable;
import by.rabenok.task1.observer.CustomArrayObserver;
import by.rabenok.task1.observer.impl.CustomArrayObserverImpl;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class CustomArray implements CustomArrayObservable {
  private final int id;
  private int[] array;
  private CustomArrayObserver observer;

  public CustomArray(int[] array) {
    this.array = array.clone();
    this.id = getRandomId();
    attach(new CustomArrayObserverImpl());
    notifyObserver();
  }

  public int getId() {
    return id;
  }

  public int[] getArray() {
    return array.clone();
  }

  public void setArray(int[] array) {
    this.array = array.clone();
    notifyObserver();
  }

  private int getRandomId() {
    Random random = new Random();
    return random.nextInt();
  }

  @Override
  public void attach(CustomArrayObserver observer) {
    this.observer = observer;
  }

  @Override
  public void detach(CustomArrayObserver observer) {
    if (observer != null) {
      this.observer = null;
    }
  }

  @Override
  public void notifyObserver() {
    if (observer != null) {
      observer.actionPerformed(new CustomArrayEvent(this));
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomArray that = (CustomArray) o;
    return id == that.id && Arrays.equals(array, that.array);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(id);
    result = 31 * result + Arrays.hashCode(array);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("CustomArray{");
    sb.append("id=").append(id);
    sb.append(", array=").append(Arrays.toString(array));
    sb.append('}');
    return sb.toString();
  }
}