import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Integer[] array = new Integer[] {2,4,2,1,10,6,10};

    int maxArea = 0;

    for (int i = 0; i < array.length; i++) {
      int currentHeight;
      int area = currentHeight = array[i];
      for (int j = 1; j < array.length - i; j++) {
        currentHeight = Math.min(currentHeight, array[j]);
        area = (j + 1) * currentHeight;
      }
      if (area > maxArea) {
        maxArea = area;
      }
    }
    System.out.println(maxArea);
  }

}
