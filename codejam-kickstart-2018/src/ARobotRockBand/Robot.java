package ARobotRockBand;

public class Robot {
  private int number;

  public Robot(int number) {
    this.number = number;
  }


  public int getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return String.valueOf(number);
  }
}
