import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FlattenedIterator {

  private List<MyIterator> iteratorList;

  public FlattenedIterator(List<MyIterator> iteratorList) {
    this.iteratorList = iteratorList;
  }

  public boolean isEmpty() {
    for (MyIterator i : iteratorList) {
      if (!i.isEmpty()) {
        return false;
      }
    }
    return true;
  }

  //incrementally iterates over the integers from all iterators in
  //an interleaved fashion
  public MyIterator iterate() {
    MyIterator newIterator = new MyIterator(new LinkedList<>());
    while (!this.isEmpty()) {
      for (MyIterator i : this.iteratorList) {
        if (!i.isEmpty()) {
          newIterator.add(i.removeFirst());
        }
      }
    }
    return newIterator;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("{");
    for (MyIterator i : iteratorList) {
      sb.append(i.toString());
      sb.append(',');
    }
    sb.deleteCharAt(sb.length()-1);
    sb.append('}');
    return sb.toString();
  }

  public static void main(String[] args) {
    List<MyIterator> list = new ArrayList<>();
    MyIterator a = new MyIterator(Arrays.asList('a','b','c'));
    MyIterator b = new MyIterator(Arrays.asList('d','e'));
    MyIterator c = new MyIterator(Arrays.asList('f','g','h'));
    list.add(a);
    list.add(b);
    list.add(c);

    FlattenedIterator iterators = new FlattenedIterator(list);
    System.out.println(iterators);
    MyIterator result = iterators.iterate();
    System.out.println(result);
  }

}
