package CSortAScrambledItinerary;

public class Flight {
  private String source;
  private String dest;

  public Flight(String source, String dest) {
    this.source = source;
    this.dest = dest;
  }

  public String getSource() {
    return source;
  }

  public String getDest() {
    return dest;
  }

  @Override
  public String toString() {
    return source + "-" + dest;
  }
}
