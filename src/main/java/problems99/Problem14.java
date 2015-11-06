package problems99;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Problem14 {

//  P14 (*) Duplicate the elements of a list.

  public static void main(String[] args) {
    System.out.println(duplicate(asList('a', 'b', 'c', 'c', 'd')));
  }

  public static <T> List<T> duplicate(List<T> items) {
    List<T> duplicated = new ArrayList<>(items.size() * 2);
    for(T item : items) {
      duplicated.add(item);
      duplicated.add(item);
    }

    return duplicated;
  }
}
