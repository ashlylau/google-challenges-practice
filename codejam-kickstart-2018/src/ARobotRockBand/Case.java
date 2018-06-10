package ARobotRockBand;

import java.util.ArrayList;
import java.util.List;

public class Case {
  private int n;
  private int k;
  private List<List<Robot>> spotList;

  public Case(int n, int k) {
    this.n = n;
    this.k = k;
    this.spotList = new ArrayList<>();
  }

  public List<List<Robot>> getSpotList() {
    return spotList;
  }

  public int getPermutations() {
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int x = 0; x < n; x++) {
          for (int y = 0; y < n; y++) {
            int a = spotList.get(0).get(i).getNumber();
            int b = spotList.get(1).get(j).getNumber();
            int c = spotList.get(2).get(x).getNumber();
            int d = spotList.get(3).get(y).getNumber();

            if ((a^b^c^d) == k) {
              count++;
            }
          }
        }
      }
    }
    return count;
  }
}
