package by.rabenok.task1.entity;

public class CustomSummaryStatistic {
  private int sum;
  private int min;
  private int max;

  public CustomSummaryStatistic(int sum, int min, int max) {
    this.sum = sum;
    this.min = min;
    this.max = max;
  }

  public int getSum() {
    return sum;
  }

  public void setSum(int sum) {
    this.sum = sum;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }
}