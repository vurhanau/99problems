package problems99;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class Problem15 {

//  P15 (**) Duplicate the elements of a list a given number of times.

  public static void main(String[] args) {
    System.out.println(duplicateN(3, asList('a', 'b', 'c', 'c', 'd')));
  }

  public static <T> List<T> duplicateN(int times, List<T> items) {
    List<T> duplicated = new ArrayList<>();
    for (T item : items) {
      IntStream.range(0, times).forEach(i -> duplicated.add(item));
    }
    return duplicated;
  }
}
