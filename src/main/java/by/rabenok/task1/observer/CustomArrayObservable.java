package by.rabenok.task1.observer;

public interface CustomArrayObservable {
  void attach(CustomArrayObserver observer);

  void detach(CustomArrayObserver observer);

  void notifyObserver();
}