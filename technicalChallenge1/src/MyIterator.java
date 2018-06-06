import java.util.LinkedList;
import java.util.List;

public class MyIterator {
  private List<Character> integerList;

  public MyIterator(List<Character> integerList)
  {
    this.integerList = new LinkedList<>();
    this.integerList.addAll(integerList);
  }

  public boolean isEmpty() {
    return integerList.isEmpty();
  }

  public void add(Character i) {
    this.integerList.add(i);
  }

  public Character removeFirst() {
    char first = this.integerList.get(0);
    integerList.remove(0);
    return first;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append('[');
    for (Character i : integerList) {
      sb.append(i);
      sb.append(',');
    }
    //sb.deleteCharAt(sb.length());
    sb.append(']');

    return sb.toString();
  }
}
