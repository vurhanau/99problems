package problems99;

import java.util.List;

import static java.util.Arrays.asList;

public class Problem17 {

//  P17 (*) Split a list into two parts.

  public static void main(String[] args) {
    System.out.println(split(3, asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')));
  }

  public static <T> List<List<T>> split(int border, List<T> items) {
    return asList(items.subList(0, border), items.subList(border, items.size()));
  }
}
