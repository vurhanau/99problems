package problems99;

import java.util.List;

import static java.util.Arrays.asList;

public class Problem18 {

//  P18 (**) Extract a slice from a list.

  public static void main(String[] args) {
    System.out.println(slice(3, 7, asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
  }

  public static <T> List<T> slice(int lower, int upper, List<T> items) {
    if(items == null) {
      throw new IllegalArgumentException();
    }
    return items.subList(lower, upper);
  }
}
