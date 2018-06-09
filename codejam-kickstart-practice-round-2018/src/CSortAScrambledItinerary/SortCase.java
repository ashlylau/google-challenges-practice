package CSortAScrambledItinerary;

import java.util.ArrayList;
import java.util.List;

public class SortCase {
  private int numFlights;
  private List<Flight> flights;

  public SortCase(int numFlights, List<Flight> flights) {
    this.numFlights = numFlights;
    this.flights = flights;
  }

  public void sortFlights() {
    List<Flight> sortedList = new ArrayList<>();
    sortedList.addAll(flights);
    for (Flight fs : flights) {
      for (Flight fd : flights) {
        if (fs.getSource().equals(fd.getDest())) {
          sortedList.remove(fs);
          break;
        }
      }
    }

    for (Flight f : flights) {
      Flight last = sortedList.get(sortedList.size()-1);
      if (last.getDest().equals(f.getSource())) {
        sortedList.add(f);
       // System.out.println(f.toString());
      }
    }
    System.out.println(sortedList.toString());
    //return sortedList;
  }
}
