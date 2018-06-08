package AGBusCount;

import java.util.List;

public class Case {
  private int numBuses;
  private List<Integer> citiesCovered;
  private List<Integer> citiesToCount;

  public Case(int numBuses, List<Integer> citiesCovered, List<Integer> citiesToCount) {
    this.numBuses = numBuses;
    this.citiesCovered = citiesCovered;
    this.citiesToCount = citiesToCount;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("numBuses: " + numBuses + ", ");
    sb.append("cities covered: ");
    sb.append(citiesCovered.toString());
    sb.append("cities to count: ");
    sb.append(citiesToCount.toString());

    return sb.toString();
  }
}
