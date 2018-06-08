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

  public void printCounts() {
    StringBuilder sb = new StringBuilder();
    for (Integer city : citiesToCount) {
      int count = count(city);
      if (count != 0) {
        sb.append(count);
        sb.append(' ');
      }
    }
    //sb.deleteCharAt(sb.length()-1);
    System.out.println(sb.toString());
  }

  public int count(int cityToCount) {
    int count = 0;
    for (int i = 0; i < numBuses; i++) {
      int start = citiesCovered.get(2*i);
      int last = citiesCovered.get(2*i + 1);
      if (cityToCount <= last && cityToCount >= start) {
        count++;
      }
    }
    //System.out.println(count);
    return count;
  }

}
