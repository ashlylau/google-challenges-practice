import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Integer[] array = new Integer[] {2,4,2,1};

    Map<Integer, Pair> map = new HashMap<>();
    int maxArea = 0;

    for (int i = 0; i < array.length; i++) {
      int currentHeight = array[i];
      for (int j = 1; j < array.length - i; j++) {
        currentHeight = Math.min(currentHeight, array[j + i]);
        int area = (j + 1) * currentHeight;
        if (area > maxArea) {
          maxArea = area;
          Pair<Integer, Integer> indices = new Pair(i, j+i);
          map.put(maxArea, indices);
        }
      }
    }
    System.out.println("Area: " + maxArea);
    System.out.println("Indices: (" + map.get(maxArea).getKey() + "," + map.get(maxArea).getValue() + ")");
    //System.out.println(map.toString());
  }

}
